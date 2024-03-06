package com.IntegrationTesting_customer_module;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.ObjectRepository_pom.CustomerModulePage;
import com.ObjectRepository_pom.HomePage;
import com.ObjectRepository_pom.LoginPage;
import com.ObjectRepository_pom.LogoutPage;
import com.ObjectRepository_pom.productCatogryAndPointOfSalePage;
import com.crm.genericUtils.BaseClass;
import com.crm.genericUtils.ExcelUtils;
import com.crm.genericUtils.WebDriverUtils;

public class IntegrationTesting_customer_module_PosTest extends BaseClass
{

	@Test
public void pos() throws EncryptedDocumentException, IOException, InterruptedException
	
	//public static void main(String[] args) throws IOException, InterruptedException 
	{
		//WebDriver driver = null;
		
		ExcelUtils excel = new ExcelUtils();
		WebDriverUtils driverUtil = new WebDriverUtils();
		
		
		String browser =     excel.readDataFromExcelFile("CUSTOMERMODULE", 0, 1);
		String url =         excel.readDataFromExcelFile("CUSTOMERMODULE", 1, 1);
		String userName =    excel.readDataFromExcelFile("CUSTOMERMODULE", 2, 1);
		String password =    excel.readDataFromExcelFile("CUSTOMERMODULE", 3, 1);
		String firstName =   excel.readDataFromExcelFile("CUSTOMERMODULE", 4, 1);
		String lastName =    excel.readDataFromExcelFile("CUSTOMERMODULE", 5, 1);
		String phoneNumber = excel.readDataFromExcelFile("CUSTOMERMODULE", 6, 1);
		System.out.println(phoneNumber);
		
		
//		FileInputStream fis = new FileInputStream("./src/test/resources/salesAndInventorySystem.properties");
//		Properties p = new Properties();
//		p.load(fis);
//		String	browser  =p.getProperty("browser");
//		String	url      = p.getProperty("url");
//		String	username = p.getProperty("username");
//		String	password = p.getProperty("password");
//		String	First_Name = p.getProperty("First_Name");
//		String	Last_Name = p.getProperty("Last_Name");
//		String	Phone_Number = p.getProperty("Phone_Number");
//		String	customer_name = p.getProperty("customer_name");
//		
//		if(browser.equalsIgnoreCase("chrome"))
//		{
//			driver = new ChromeDriver();
//		}
//		
//		//maximize browser
//		driverUtil.maximizeWindow(driver);
//		
//		driverUtil.waitForPageLoad(driver, 10);
//		
//		//trigger the URL
//		driver.get(url);
//		
//		//Login To Appliction
//		
//		LoginPage lp = new LoginPage(driver);
//		lp.loginToApp(userName, password, driver);
//		
		//click on customer module
		HomePage hp = new HomePage(driver);
		hp.customerModuleBtn();
		
		//click on customer module plus Btn and enterdetails
		CustomerModulePage cmp = new CustomerModulePage(driver);
		cmp.diffOperationOnCustomerModule(firstName, lastName, phoneNumber);
				
		
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		//trigger the URL
//		driver.get(url);
//		
//		//Login to the application
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
//		driver.findElement(By.xpath("//button[@name='btnlogin']")).click();
//		
//		//handle the popup
//		driver.switchTo().alert().accept();
//		
//		//selecting the customer module
//		driver.findElement(By.xpath("//span[text()='Customer']")).click();
//		
//		//creating the customer plus button
//		driver.findElement(By.xpath("//i[@class='fas fa-fw fa-plus']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//form[@action='cust_transac.php?action=add']/descendant::input[@placeholder='First Name']")).sendKeys(First_Name);
//		driver.findElement(By.xpath("//form[@action='cust_transac.php?action=add']/descendant::input[@placeholder='Last Name']")).sendKeys(Last_Name);
//		driver.findElement(By.xpath("//form[@action='cust_transac.php?action=add']/descendant::input[@placeholder='Phone Number']")).sendKeys(Phone_Number);
//		driver.findEleme nt(By.xpath("//form[@action='cust_transac.php?action=add']/child::button[text()='Save']")).click();
//		
		
//-----------------------------------------------------------------------------------------------------------		
		
//		//selection pos button
		
		hp.posBtn();
		
		String quantity = excel.readDataFromExcelFile("POSPAGE", 0, 1);
		String customerName = excel.readDataFromExcelFile("POSPAGE", 1, 1);
		String amount = excel.readDataFromExcelFile("POSPAGE", 2, 1);
		
		productCatogryAndPointOfSalePage pc = new productCatogryAndPointOfSalePage(driver);//cunstructor calling statement
		pc.posPage(quantity, customerName, amount);
		
		driverUtil.acceptAlert(driver);
		
	//	LogoutPage lp2 = new LogoutPage(driver);
		//lp2.logoutFromApp();
		
		
		
		
//		driver.findElement(By.xpath("//span[text()='POS']")).click();
		
//		driver.findElement(By.xpath("//a[text()='Others']")).click();
		
//		driver.findElement(By.xpath("//a[text()='Others']")).click();
//		driver.findElement(By.xpath("//h6[text()='Bottel']/following-sibling::input[@name='quantity']")).sendKeys("3");
		
//		driver.findElement(By.xpath("//h6[text()='Bottel']/following-sibling::input[@value='Add']")).click();
		
//		WebElement customer_dropdown = driver.findElement(By.xpath("//select[@style='border-radius: 0px;']"));
//		
//		//handle customer dropdown in pos section
//		
//		Select select = new Select(customer_dropdown);
//		Thread.sleep(2000);
//		select.selectByVisibleText(customer_name);
//		driver.findElement(By.xpath("//button[text()='SUBMIT']")).click();
//		
//		//handle payment
//		driver.findElement(By.xpath("//input[@placeholder='ENTER CASH']")).sendKeys("300");
//		driver.findElement(By.xpath("//button[text()='PROCEED TO PAYMENT']")).click();
//		
//		//payment confirmation popups
//		driver.switchTo().alert().accept();
//		
//		//for logout
//		driver.findElement(By.xpath("//img[@class='img-profile rounded-circle']")).click();
//		
//		driver.findElement(By.xpath("//a[@data-target='#logoutModal']")).click();
//		driver.findElement(By.xpath("//div[@aria-modal=\"true\"]/descendant::div[@class='modal-footer']/child :: a[@class='btn btn-primary']")).click();
//		
//		Thread.sleep(2000);
//		//Login to the application2
//				driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
//				driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
//				driver.findElement(By.xpath("//button[@name='btnlogin']")).click();
//				
//				//
//				
//		
//		driver.quit();
//		
//		
	
                 System.out.println("----Done By Using Both Pom And BaseClass----");
}
}