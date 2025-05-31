package TestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Pages.HomePage;
import Pages.LoginPage; 
import org.testng.annotations.Test;

public class CreateObject extends HomePage{
	
	@Test
	public void LoginPage() throws IOException
	{
			FileInputStream file = new FileInputStream("C:\\Users\\rajes\\eclipse-workspace\\SaalesforceTesting\\src\\test\\resources\\TestData\\TestData.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			XSSFRow row1 = sheet.getRow(1);		
			int row = row1.getLastCellNum();
			
			System.out.println(row);
			
			for (int i = 1; i < row; i++)
			{ 
//			try {	
				XSSFRow row2 = sheet.getRow(i);
				
				XSSFCell uname = row2.getCell(0);
				XSSFCell pwd = row2.getCell(1);
				//XSSFCell Cell1 = row2.getCell(0);
				String Username = uname.toString();
				String Password = pwd.toString();
				System.out.println(Username + Password);
				BrowserActions();
				loginPage();
				
				HomePage();
				ObjManager();
			}

	}		
}