package test.frontend.data;

import org.testng.annotations.DataProvider;
import parser.ExcelFileParser;

public class DataForBuySellOrder {

    @DataProvider(name = "BuyData")
    public static Object[][] BuyData() throws Exception {

        String xlFilePath = "./Excels/BuySell.xlsx";
        String sheetName = "Buy Order";
        Object[][] myData=testData(xlFilePath,sheetName);
        return myData;
    }

    @DataProvider(name = "SellData")
    public static Object[][] sellData() throws Exception{
        String xlFilePath = "./Excels/BuySell.xlsx";
        String sheetName = "sell Order";
        Object[][] myData=testData(xlFilePath,sheetName);
        return myData;
    }


    public static Object[][] testData(String xlFilePath, String sheetName) throws Exception {

        ExcelFileParser excelParserObj = new ExcelFileParser(xlFilePath);
        Object[][] excelData = null;


        /**
         * get Row count and Column count
         * And parse the excel file row by row, and column by column
         *
         */
        //excelParserObj.setExcelFilePath(xlFilePath);
        int rows = excelParserObj.getRowCount(sheetName);
        System.out.println("The total rows in the given sheet: "+rows);
        int columns = excelParserObj.getColumnCount(sheetName);
        System.out.println("The total columns in the given sheet: "+columns);
        excelData = new Object[rows-1][columns];

        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                excelData[i - 1][j] = excelParserObj.getCellData(sheetName, j, i);
            }

        }
        return excelData;
    }


}
