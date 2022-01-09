package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.IOException;

public class ExcelRead {

    @Test
    public void readingFromExcel() throws IOException {
        //Workbook>Worksheet>Row>Cell
        //Open excel workbook using XSSWorkbook class
        // pass file name in the constructor

        XSSFWorkbook workbook = new XSSFWorkbook("Employees.xlsx");

        // Go to worksheet pass the worksheet name
        XSSFSheet worksheet = workbook.getSheet("data");

        // print
        System.out.println(worksheet.getRow(1).getCell(0));
        System.out.println(worksheet.getRow(3).getCell(1));


    }
}
