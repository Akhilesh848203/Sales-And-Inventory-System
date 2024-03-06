package com.customerModule;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v113.runtime.Runtime.GetPropertiesResponse;
import org.testng.annotations.Test;

import com.ObjectRepository_pom.CustomerModulePage;
import com.ObjectRepository_pom.HomePage;
import com.ObjectRepository_pom.LoginPage;
import com.crm.genericUtils.BaseClass;
import com.crm.genericUtils.ExcelUtils;

import com.crm.genericUtils.PropertyUtils;
import com.crm.genericUtils.WebDriverUtils;

public class CustomerModule_CreateCustomerTest extends BaseClass
{
	@Test
	public void CustomerModuleTest() throws IOException, InterruptedException
	
	
	
	
	
	
	//public static void main(String[] args) throws IOException, InterruptedException 
	{
		
//creating object of required utils which is present in genericUtils package
		
		//WebDriverUtils webdriverUtils = new WebDriverUtils();
		//PropertyUtils propertyUtils =new PropertyUtils(); 
		
//Read data from property file
		String  browser =    pu.readDataFromPropertyFile("browser");
		String url =         pu.readDataFromPropertyFile("url");
		String userName =    pu.readDataFromPropertyFile("userName");
		String password =    pu.readDataFromPropertyFile("password");
		String firstName =   pu.readDataFromPropertyFile("firstName");
		String lastName =    pu.readDataFromPropertyFile("lastName");
		String phoneNumber = pu.readDataFromPropertyFile("phoneNumber");
	    System.out.println(lastName);
	    
//launch the chrome browser
//		if(browser.equalsIgnoreCase("chrome"))
//		{
//			driver = new ChromeDriver();
//		}
//		
//maximize the window		
		//webdriverUtils.maximizeWindow(driver);
		
//Handling the Synchronization problem		
		//webdriverUtils.waitForPageLoad(driver, 10);
		
//Trigger The URL
		//driver.get(url);
		
//login into the Application
		
		//LoginPage lps = new LoginPage(driver);
		//lps.loginToApp(userName, password, driver);
		
//click on customer module
		HomePage hp = new HomePage(driver);
		hp.customerModuleBtn();
		
//click on plus button and enter all details
		CustomerModulePage cmp = new CustomerModulePage(driver);
		cmp.diffOperationOnCustomerModule(firstName, lastName, phoneNumber);
		
//Save Btn

		//driver.quit();
		
				System.out.println("-----------DONE BY USING POM And BaseClass----------");
	}

}
