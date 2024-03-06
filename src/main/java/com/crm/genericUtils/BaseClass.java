package com.crm.genericUtils;

import java.io.IOException;
import java.sql.SQLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import com.ObjectRepository_pom.LoginPage;
import com.ObjectRepository_pom.LogoutPage;

public class BaseClass 
{
	public DataBaseUtils dbu = new DataBaseUtils();
	public ExcelUtils excel = new ExcelUtils();
	public PropertyUtils pu = new PropertyUtils();
	public javaUtils ju = new javaUtils();
	public WebDriverUtils wu = new WebDriverUtils();
	 
	public static WebDriver driver;
	
	//@BeforeSuite
	public void connectToDB() throws SQLException
	{
		
		dbu.connectionToDB();
		System.out.println("---Connect To DB---");
	}
	
//--------------------------------------------------------------------------------------	
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		String browser = pu.readDataFromPropertyFile("browser");
		String url = pu.readDataFromPropertyFile("url");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
					
					
		}else if(browser.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}else
		{
			System.out.println("given browser name is not matching");
		}	
		
		//Maximize the browser
		wu.maximizeWindow(driver);
		
		//enter url
		driver.get(url);
		
		//wait for page load
		wu.waitForPageLoad(driver, 10);
		
		System.out.println("------Launch the browser------");
	}
	
//-------------------------------------------------------------------------------------------
	
	
	@BeforeMethod
       public void  loginToApp() throws IOException
       {
    	String userName = pu.readDataFromPropertyFile("userName"); 
    	 String password = pu.readDataFromPropertyFile("password");
    	  
    	  
    	  //Login To App
    	  LoginPage lp = new LoginPage(driver);
    	  lp.loginToApp(userName, password, driver);;
    	  
    	  System.out.println("-----Login to App----");
       }
	
//------------------------------------------------------------------------------------------------	
	
	@AfterMethod
	public void logoutFromApp()
	{
		LogoutPage lp = new LogoutPage(driver);
		lp.logoutFromApp();
		System.out.println("---Logout From Application---");
		
	}
	
//-------------------------------------------------------------------------------------------------	
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
		System.out.println("Browser closed");
	}
	
//-------------------------------------------------------------------------------------------------	
	
	@AfterSuite
	public void closeDB() throws SQLException
	{
		
		dbu.connectionToDB();
		System.out.println("---Disconnected from DB---");
	}


}
