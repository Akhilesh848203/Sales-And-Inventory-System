package com.ObjectRepository_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtils.WebDriverUtils;

public class productCatogryAndPointOfSalePage extends WebDriverUtils
{
	//Decleration
	
	@FindBy(xpath = "//a[text()='Others']")
	private WebElement catogryOtherBtn;
	
	@FindBy(xpath = "//h6[text()='Bottel']/following-sibling::input[@name='quantity']")
	private WebElement quantityTextField;
	
	@FindBy(xpath = "//h6[text()='Bottel']/following-sibling::input[@value='Add']")
	private WebElement addBtn;
	
	@FindBy(xpath = "//select[@style='border-radius: 0px;']")
	private WebElement customerDropDown;
	
	@FindBy(xpath = "//button[text()='SUBMIT']")
	private WebElement submitBtn;
	
	
	@FindBy(xpath = "//input[@placeholder='ENTER CASH']")
	private WebElement paymentTextField;
	
	@FindBy(xpath = "//button[text()='PROCEED TO PAYMENT']")
	private WebElement proceedToPaymentBtn;
	
	
	
	//initilization
	
	public productCatogryAndPointOfSalePage(WebDriver driver)
	{
	
		PageFactory.initElements(driver, this);
		
	}
	

   //utilization

	public WebElement getCatogryOtherBtn() {
		return catogryOtherBtn;
	}



	public WebElement getQuantityTextField() {
		return quantityTextField;
	}



	public WebElement getAddBtn() {
		return addBtn;
	}



	public WebElement getCustomerDropDown() {
		return customerDropDown;
	}



	public WebElement getSubmitBtn() {
		return submitBtn;
	}



	public WebElement getPaymentTextField() {
		return paymentTextField;
	}



	public WebElement getProceedToPaymentBtn() {
		return proceedToPaymentBtn;
	}

	
	public void posPage(String quantity ,String customerName,String amount)
	{
		catogryOtherBtn.click();
		quantityTextField.clear();
		quantityTextField.sendKeys(quantity);
		addBtn.click();
		handleDropdown(customerName, customerDropDown);
		submitBtn.click();
		paymentTextField.click();
		paymentTextField.sendKeys(amount);
		
		proceedToPaymentBtn.click();
		
	
	
	
	}
         
		
	}
	
	
	


