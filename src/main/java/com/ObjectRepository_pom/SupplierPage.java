package com.ObjectRepository_pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtils.WebDriverUtils;

public class SupplierPage extends WebDriverUtils
{
//decleration of state of object
	@FindBy(xpath = "//i[@class='fas fa-fw fa-plus']")
	private WebElement addSupplierPlusBtn;
	
	@FindBy(xpath = "//form[@action='sup_transac.php?action=add']/child::div[@class='form-group']/child::input[@placeholder='Company Name']")
	private WebElement supplierCompanyNameTextField;
	
	@FindBy(xpath = "//form[@action='sup_transac.php?action=add']/descendant::select[@id='province']")
	private WebElement selectProvienceDropDown;
	
	@FindBy(xpath = "//form[@action='sup_transac.php?action=add']/child::div[@class='form-group']/child::select[@id='city']")
	private WebElement cityNameDropDown;
	
	@FindBy(xpath = "//form[@action='sup_transac.php?action=add']/child::div[@class='form-group']/child::input[@placeholder='Phone Number']")
	private WebElement phoneNumberTextField;
	
	@FindBy(xpath = "//form[@action='sup_transac.php?action=add']/child::button/child::i[@class='fa fa-check fa-fw']")
	private WebElement saveBtn;
	
	
//initilization (By Using Constructor)
	public SupplierPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
//utilization (By Using Getter Method To Access State Of Object)
	public WebElement getAddSupplierPlusBtn() {
		return addSupplierPlusBtn;
	}


	public WebElement getSupplierCompanyNameTextField() {
		return supplierCompanyNameTextField;
	}


	public WebElement getSelectProvienceDropDown() {
		return selectProvienceDropDown;
	}


	public WebElement getCityNameTextField() {
		return cityNameDropDown;
	}


	public WebElement getPhoneNumberTextField() {
		return phoneNumberTextField;
	}


	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
//Bussines Logic(Logic to use the state of object to perform some operation)
	public void Supplier(String companyName,String provienceName,String cityName,String phoneNumber) throws InterruptedException
	{

		addSupplierPlusBtn.click();
		Thread.sleep(2000);
		supplierCompanyNameTextField.sendKeys(companyName);
		handleDropdown(provienceName, selectProvienceDropDown);
		handleDropdown(cityName, cityNameDropDown);
		phoneNumberTextField.sendKeys(phoneNumber);
		saveBtn.click();
		
		
		
		
	}
	
	
	

}
