package com.AccountModule;

import static org.testng.Assert.fail;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;	
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ObjectRepository_pom.AccountPage;
import com.ObjectRepository_pom.HomePage;
import com.ObjectRepository_pom.LoginPage;
import com.crm.genericUtils.BaseClass;
import com.crm.genericUtils.ExcelUtils;
import com.crm.genericUtils.WebDriverUtils;
@Listeners(com.crm.genericUtils.ListImpClass.class)
public class AccountModule_AddUserTest extends BaseClass
{
	
	@Test(retryAnalyzer =com.crm.genericUtils.RetryImpClass.class)
	public void accountModuleTest() throws EncryptedDocumentException, IOException
	
	//public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//WebDriver driver = null;
		
//creating object of genericUtils package class
		//ExcelUtils excel = new ExcelUtils();
	//	WebDriverUtils webutil = new WebDriverUtils();
		
		
// Fetching the data		
	String	browser = excel.readDataFromExcelFile("AddUserAccount", 0, 1);
	String	url = excel.readDataFromExcelFile("AddUserAccount", 1, 1);
	String	userName = excel.readDataFromExcelFile("AddUserAccount", 2, 1);
	String	password = excel.readDataFromExcelFile("AddUserAccount", 3, 1);
	String	employee = excel.readDataFromExcelFile("AddUserAccount", 4, 1);
	String userName2 = excel.readDataFromExcelFile("AddUserAccount", 5, 1);
	String	password2 = excel.readDataFromExcelFile("AddUserAccount", 6, 1);
	
	System.out.println(password2);
//launch the Browser		
//		if(browser.equalsIgnoreCase("chrome"))
//		{
//			driver = new ChromeDriver();
//		}else {
//			System.out.println("wrong browser name");
//		}
//	
		
////maximize the browser And Handle the Sychronization		
//		webutil.waitForPageLoad(driver, 10);
//		webutil.maximizeWindow(driver);
//		
		
//Trigger URL
	//	driver.get(url);

		
//login into Application
	//	LoginPage lps = new LoginPage(driver);
		//lps.loginToApp(userName, password, driver);
		
				
//selecting Account module
		HomePage hp = new HomePage(driver);
		hp.accountsModuleBtn();
		
		fail();
//click on plus button and enter all details
		AccountPage ap = new AccountPage(driver);
		ap.addUserAccountPlusBtn();
		ap.enterAllDetailsToaddUserAccount(employee, userName2, password2);
		System.out.println("-----------Done By Using Pom And BaseClass----------");

	
	}
	

}
