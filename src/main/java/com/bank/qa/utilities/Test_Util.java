package com.bank.qa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import com.bank.Framework_base.TestBase;




public class Test_Util extends TestBase {
//public static long PAGE_LOAD_TIMEOUT=50;
public static long IMPLICIT_WAIT=10;
static Workbook book;
static Sheet sheet;

public static String TESTDATA_SHEET_PATH=System.getProperty("user.dir")+"/src/main/java/com/bank/qa/testdata/OnlineBank_Customer_data.xlsx";
public static Object[][] getTestData(String sheetName)
{
FileInputStream file=null;
try
{
file=new FileInputStream(TESTDATA_SHEET_PATH);
}
catch (FileNotFoundException e)
{
e.printStackTrace();
}
try {
	book=WorkbookFactory.create(file);
}
catch(IOException e)
{
e.printStackTrace();
}
sheet=book.getSheet(sheetName);
Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
for(int i=0;i<sheet.getLastRowNum();i++) {
for(int k=0;k<sheet.getRow(0).getLastCellNum();k++)
{
data[i][k]=sheet.getRow(i+1).getCell(k).toString();	
}
}
return data;
}


public static void takeScreenshotAtEndOfTest() throws IOException {
	Date currentdate = new Date();
	String screenshotfile = currentdate.toString().replace(" ", "-").replace(":", "-");
	File screenshotfile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotfile1,
			new File("C:\\Users\\Dell\\eclipse-workspace\\OnlineBank\\Screenshots\\" + screenshotfile + ".png"));

}

}







