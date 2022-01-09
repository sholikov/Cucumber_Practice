package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {
    String filePath = "Employees.xlsx";

    @Test
    public void writeToExcelSheet() throws IOException {
        // open the Employees.xlsx using Apache POI
        FileInputStream in = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(in);

        // Goto "data" worksheet. or got first sheet by index, it works when we dont the name of sheet
        XSSFSheet datasheet = workbook.getSheetAt(0);

        // add a column name "salary"  and save into file
        XSSFCell salaryColCell = datasheet.getRow(0).createCell(3);// created 3rd cell

        salaryColCell.setCellValue("Salary");// we are writing "Salary" name into cell header

        XSSFCell  salary1 =datasheet.getRow(1).createCell(3);
        salary1.setCellValue("130000");



        // save the changes:
        // open to write to the file : FileInputStream --> reading
        //                             FileOutStream --- writing
        FileOutputStream outputStream = new FileOutputStream(filePath);

        workbook.write(outputStream);
        outputStream.close();
        workbook.close();
        in.close();


    }
}
