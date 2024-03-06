package com.ObjectRepository_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtils.WebDriverUtils;
import com.crm.genericUtils.javaUtils;

public class EmployeePage extends WebDriverUtils
{
	
	//Decleration
	@FindBy(xpath = "//h4[@class='m-2 font-weight-bold text-primary']/descendant::i[@class='fas fa-fw fa-plus']")
	private WebElement addEmployeePlusBtn;
	
	@FindBy(xpath = "//form[@action='emp_transac.php?action=add']/descendant::input[@placeholder='First Name']")
	private WebElement firseNameTextField;
	
	@FindBy(xpath = "//form[@action='emp_transac.php?action=add']/descendant::input[@placeholder='Last Name']")
	private WebElement LastNameTextField;
	
	@FindBy(xpath = "//form[@action='emp_transac.php?action=add']/descendant::select[@name='gender']")
	private WebElement genderDropDown;
	
	@FindBy(xpath = "//form[@action='emp_transac.php?action=add']/descendant::input[@placeholder='Email']")
	private WebElement emailTextField;
	
	@FindBy(xpath = "//form[@action='emp_transac.php?action=add']/descendant::input[@placeholder='Phone Number']")
	private WebElement phoneNumberTextField;
	
	@FindBy(xpath = "//form[@action='emp_transac.php?action=add']/descendant::select[@name='jobs']")
	private WebElement jobsDropDown;
	
	@FindBy(xpath = "//form[@action='emp_transac.php?action=add']/descendant::input[@name='hireddate']")
	private WebElement hiredateTextField;
	
	@FindBy(xpath = "//select[@id='province']")
	private WebElement provienceDropDown;
	
	@FindBy(xpath = "//select[@id='city']")
	private WebElement cityDropDown;
	
	@FindBy(xpath = "//form[@action='emp_transac.php?action=add']/button[@class='btn btn-success']")
	private WebElement saveBtn;
	
//initilization
	public EmployeePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
//utilization
	public WebElement getAddEmployeePlusBtn() {
		return addEmployeePlusBtn;
	}

	public WebElement getFirseNameTextField() {
		return firseNameTextField;
	}

	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}

	public WebElement getGenderDropDown() {
		return genderDropDown;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPhoneNumberTextField() {
		return phoneNumberTextField;
	}

	public WebElement getJobsDropDown() {
		return jobsDropDown;
	}

	public WebElement getHiredateTextField() {
		return hiredateTextField;
	}

	public WebElement getProvienceDropDown() {
		return provienceDropDown;
	}

	public WebElement getCityDropDown() {
		return cityDropDown;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	//bussines Logic
	public void diffOperationOnEmployeeModule(String firstName,String lastName,String gendar,String email,String phoneNumber,String job,String hireDate,String provience,String city)
	{	
		
		
		addEmployeePlusBtn.click();
		firseNameTextField.sendKeys(firstName);
		LastNameTextField.sendKeys(lastName);
		handleDropdown(gendar, genderDropDown);
		emailTextField.sendKeys(email);
		phoneNumberTextField.sendKeys(phoneNumber);
		handleDropdown(job, jobsDropDown);
		hiredateTextField.click();
		hiredateTextField.sendKeys(hireDate);
		handleDropdown(provience, provienceDropDown);
		handleDropdown(city, cityDropDown);
		saveBtn.click();
		
		
		
		
		
		
	}
	
	
}











