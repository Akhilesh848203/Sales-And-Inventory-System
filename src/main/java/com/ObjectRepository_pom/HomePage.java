package com.ObjectRepository_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	//Declerations
	
	@FindBy(xpath = "//span[text()='Customer']")
	private WebElement customerModuleBtn;
	
	@FindBy(xpath ="//span[text()='Employee']")
	private WebElement emplyoyeeModuleBtn;
	
	@FindBy(xpath = "//span[text()='Product']")
	private WebElement productModuleBtn;
	
	@FindBy(xpath = "//span[text()='Inventory']")
	private WebElement InventoryModuleBtn;
	
	@FindBy(xpath = "//span[text()='Transaction']")
	private WebElement transactionModuleBtn;
	
	@FindBy(xpath= "//a[@href='supplier.php']")
	private WebElement supplierModule;
	
	@FindBy(xpath = "//span[text()='Accounts']")
	private WebElement accountsModuleBtn;
	
	@FindBy(xpath = "//span[text()='POS']")
	private WebElement posBtn;
	
	@FindBy(xpath = "//span[text()='Prince Ly Cesar']")
	private WebElement princeLyCesarBtn;
	
	//initilization
		public HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
		
		//utilization

		public WebElement getCustomerModuleBtn() {
			return customerModuleBtn;
		}

		public WebElement getEmplyoyeeModuleBtn() {
			return emplyoyeeModuleBtn;
		}

		public WebElement getProductModuleBtn() {
			return productModuleBtn;
		}

		public WebElement getInventoryModuleBtn() {
			return InventoryModuleBtn;
		}

		public WebElement getTransactionModuleBtn() {
			return transactionModuleBtn;
		}

		public WebElement getSupplierModule() {
			return supplierModule;
		}

		public WebElement getAccountsModuleBtn() {
			return accountsModuleBtn;
		}

		public WebElement getPosBtn() {
			return posBtn;
		}

		public WebElement getPrinceLyCesarBtn() {
			return princeLyCesarBtn;
		}
	
		
		//bussiness Logic
		
       public void customerModuleBtn()
       {
    	   customerModuleBtn.click();
       }
       
    	 public void  emplyoyeeModuleBtn()
    	 {
    		 emplyoyeeModuleBtn.click();
    	 }
    	 
    	 public void productModuleBtn()
    	 {
    		 
    	   productModuleBtn.click();
    	 }
    	 
    	 public void InventoryModuleBtn()
    	 {
    	   InventoryModuleBtn.click();
    	 }
    	 
    	 public void transactionModuleBtn()
    	 {
    	   transactionModuleBtn.click();
    	 }
    	 
    	 public void supplierModule() 
    	 {
    		 
    	   supplierModule.click();
    	 }
    	 
    	 public void accountsModuleBtn()
    	 {
    	   accountsModuleBtn.click();
    	 }
    	 
    	 public void posBtn()
    	 {
    	   posBtn.click();
    	 }
    	 public void princeLyCesarBtn()
    	 {
    	   princeLyCesarBtn.click();
    	 } 
       }
















