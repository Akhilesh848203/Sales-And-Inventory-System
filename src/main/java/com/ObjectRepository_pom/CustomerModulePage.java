package com.ObjectRepository_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtils.WebDriverUtils;

public class CustomerModulePage extends WebDriverUtils
{
	
	//Decleratin
	@FindBy(xpath = "//i[@class='fas fa-fw fa-plus']")
	private WebElement addCustomerPlusBtn;
	
	@FindBy(xpath = "//form[@action='cust_transac.php?action=add']/descendant::input[@placeholder='First Name']")
	private WebElement firstNameTextField;
	
	@FindBy(xpath = "//form[@action='cust_transac.php?action=add']/descendant::input[@placeholder='Last Name']")
	private WebElement lastNameTextField;
	
	@FindBy(xpath = "//form[@action='cust_transac.php?action=add']/descendant::input[@placeholder='Phone Number']")
	private WebElement phoneNumberTextField;
	
	@FindBy(xpath = "//form[@action='cust_transac.php?action=add']/child::button[text()='Save']")
	private WebElement saveButton;
	
	//initilization
	public CustomerModulePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	//utilization
	public WebElement getAddCustomerPlusBtn() {
		return addCustomerPlusBtn;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getPhoneNumberTextField() {
		return phoneNumberTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	//bussines logic
	public void diffOperationOnCustomerModule(String firstName,String secondName,String phoneNumber) throws InterruptedException
	{
		addCustomerPlusBtn.click();
		Thread.sleep(2000);
		firstNameTextField.sendKeys(firstName);
		lastNameTextField.sendKeys(secondName);
		phoneNumberTextField.sendKeys(phoneNumber);
		saveButton.click();
		
		
	}
	
	
	
	

}
