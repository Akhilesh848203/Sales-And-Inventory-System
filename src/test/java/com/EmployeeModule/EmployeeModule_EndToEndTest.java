package com.EmployeeModule;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.ObjectRepository_pom.EmployeePage;
import com.ObjectRepository_pom.HomePage;
import com.ObjectRepository_pom.LoginPage;
import com.crm.genericUtils.BaseClass;
import com.crm.genericUtils.ExcelUtils;
import com.crm.genericUtils.WebDriverUtils;
import com.crm.genericUtils.javaUtils;

public class EmployeeModule_EndToEndTest extends BaseClass
{
	@Test
    public void employee() throws EncryptedDocumentException, IOException
    
	//public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
    {
		//WebDriver driver = null;
		
//Object Of Diff - Diff utils class Which is present in genericUtils package 
		//ExcelUtils excel = new ExcelUtils();
		//WebDriverUtils driverutil = new WebDriverUtils();

		javaUtils ju = new javaUtils();
		

		
//Fetching Data From Excel
		String	browser = excel.readDataFromExcelFile("Employee", 0, 1);
		String	url = excel.readDataFromExcelFile("Employee", 1, 1);
		String	userName = excel.readDataFromExcelFile("Employee", 2, 1);
		String	password = excel.readDataFromExcelFile("Employee", 3, 1);
		String	firstName = excel.readDataFromExcelFile("Employee", 4, 1);
		String	lastName = excel.readDataFromExcelFile("Employee", 5, 1);
		String	gendar = excel.readDataFromExcelFile("Employee", 6, 1);
		String	email = excel.readDataFromExcelFile("Employee", 7, 1);
		String	phoneNumber = excel.readDataFromExcelFile("Employee", 8, 1)+ju.getRandomNumber();
		String	job = excel.readDataFromExcelFile("Employee", 9, 1);
		String	hireDate = excel.readDataFromExcelFile("Employee", 10, 1);
		String	provience = excel.readDataFromExcelFile("Employee", 11, 1);
		String	city = excel.readDataFromExcelFile("Employee", 12, 1);
		System.out.println(phoneNumber);
		
// Launch The Browser		
	//if(browser.equalsIgnoreCase("chrome"))
	//{
		//driver = new ChromeDriver();
		
	//}else {
	//	System.out.println("browser is not chrome");
		
	
	
//Trigger The URL
//	driver.get(url);

//Handling Synchronization Problem
		//	driverutil.waitForPageLoad(driver, 10);
	
	
//Login Into Application
//	LoginPage lps = new LoginPage(driver);
	//lps.loginToApp(userName, password, driver);
	//Thread.sleep(2000);
	
////Click on employee module
	
	HomePage hp = new HomePage(driver);
	hp.emplyoyeeModuleBtn();
	
	
	//
	
	
	
	
	
//Plus Button For Add Employ
	EmployeePage ep = new EmployeePage(driver);//this is constructor calling statement
	ep.diffOperationOnEmployeeModule(firstName, lastName, gendar, email, phoneNumber, job, hireDate, provience, city);
	
	
	

//
	   System.out.println("------------------Done By Using Both Pom And Base Class-----------------");
		
		
		
	}

}