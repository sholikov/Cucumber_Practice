package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.IOException;

public class ExcelReadActions {

    String filePath = "Employees.xlsx";

    @Test
    public void readExcelSheetData() throws IOException {
        // open the Employees.xlsx using Apache POI

        XSSFWorkbook workbook = new XSSFWorkbook(filePath);

        // Goto "data" worksheet. or got first sheet by index, it works when we dont the name of sheet
        XSSFSheet datasheet = workbook.getSheetAt(0);

        // print column names. row is 0. cells 0,1,2
        System.out.println("COLUMN NAMES");
        System.out.println(datasheet.getRow(0).getCell(0));

        // loop and print all 3 column names
        System.out.println("------------------------");
        for (int i = 0; i <= 2; i++) {

            System.out.println(datasheet.getRow(0).getCell(i));
        }

        // find out number of rows in the worksheet,  this one  starts counting from 1,
        int rowsCount = datasheet.getPhysicalNumberOfRows();
        System.out.println("rowsCount = " + rowsCount);//8 count starts from 1

        // this one  starts counting from 0
        int usedRowsCount = datasheet.getLastRowNum();
        System.out.println("usedRowsCount = " + usedRowsCount);//7 -> count starts from 0

        // print all first names
        System.out.println("ALL FIRST NAMES");
        for (int i = 1; i <= usedRowsCount; i++) {
            System.out.println(datasheet.getRow(i).getCell(0));

        }

        //loop and find "Fahima" in the firstname column
        // print her first | lastname | job id then exit loop

        System.out.println("\nFAHIMA's INFO:");
        for (int i = 1; i <= datasheet.getLastRowNum(); i++) {

            if (datasheet.getRow(i).getCell(0).toString().equals("Fahima")) {
                System.out.println(datasheet.getRow(i).getCell(0) + "|" +
                        datasheet.getRow(i).getCell(1) + "|" +
                        datasheet.getRow(i).getCell(2));
                break;// it is good to use to exit the loop
            }

        }

    }
}
