package com.EndToEndScenario;

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
import org.testng.annotations.Test;

import com.ObjectRepository_pom.HomePage;
import com.ObjectRepository_pom.LoginPage;
import com.ObjectRepository_pom.SupplierPage;
import com.crm.genericUtils.BaseClass;
import com.crm.genericUtils.ExcelUtils;
import com.crm.genericUtils.WebDriverUtils;

public class EndToEndScenarioForSupplierModuleTest extends BaseClass
{
	@Test
	public void supplierModule() throws EncryptedDocumentException, IOException, InterruptedException
	//public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		
		//WebDriver driver=null;
		
		//object of diff - diff utils class 
				ExcelUtils excel = new ExcelUtils();
				WebDriverUtils driverutil = new WebDriverUtils();
		
				String	browser = excel.readDataFromExcelFile("SupplierModule", 0, 1);
				String	url = excel.readDataFromExcelFile("SupplierModule", 1, 1);
				String	userName = excel.readDataFromExcelFile("SupplierModule", 2, 1);
				String	password = excel.readDataFromExcelFile("SupplierModule", 3, 1);
				String	company = excel.readDataFromExcelFile("SupplierModule", 4, 1);
				String	provience = excel.readDataFromExcelFile("SupplierModule", 5, 1);
				String	city = excel.readDataFromExcelFile("SupplierModule", 6, 1);
				String	phoneNumber = excel.readDataFromExcelFile("SupplierModule", 7, 1);
				
		
//    System.out.println(provience);
//		
//		 
//
//		 if(browser.equalsIgnoreCase("chrome"))
//		 {
//			    driver = new ChromeDriver();
//				
//				
//		 }else {
//			 System.out.println("browser is not chrome");
//		 }
//	 driverutil.waitForPageLoad(driver, 10);
		 
		 
//trigger the url
		// driver.get(url);
		 
//LOGIN TO APPLICATION
		// LoginPage lp = new LoginPage(driver);
		// lp.loginToApp(userName, password, driver);
		 
			
//click on supplier module
			HomePage hp = new HomePage(driver);
			hp.supplierModule();
			
			
	
//click on AddToSupplierButton And Enter All Details

			SupplierPage sp = new SupplierPage(driver);
			sp.Supplier(company, provience, city, phoneNumber);
			
		
			
			
			
			
			
			System.out.println("---------------------Done By Using Both Pom And Base Class----------------------------");
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
//		WebElement companyName = driver.findElement(By.xpath("//form[@action='sup_transac.php?action=add']/child::div[@class='form-group']/child::input[@placeholder='Company Name']"));
//		companyName.click();
//		companyName.sendKeys(company);
//		
//		WebElement provience1 = driver.findElement(By.xpath("//form[@action='sup_transac.php?action=add']/child::div[@class='form-group']/child::select[@id='province']"));
//			
//		Select select = new Select(provience1);
//		select.selectByVisibleText(provience);
//	WebElement city1 = driver.findElement(By.xpath("//form[@action='sup_transac.php?action=add']/child::div[@class='form-group']/child::select[@id='city']"));
//	
//	Select select2 = new Select(city1);
//	select2.selectByVisibleText(city);
//	
//	WebElement phoneTextField = driver.findElement(By.xpath("//form[@action='sup_transac.php?action=add']/child::div[@class='form-group']/child::input[@placeholder='Phone Number']"));
//	
//
//	phoneTextField.click();
//	phoneTextField.sendKeys(phoneNumber);
//	
//driver.findElement(By.xpath("//form[@action='sup_transac.php?action=add']/child::button/child::i[@class='fa fa-check fa-fw']")).click();
//	
	
	
	
	
	}

}
