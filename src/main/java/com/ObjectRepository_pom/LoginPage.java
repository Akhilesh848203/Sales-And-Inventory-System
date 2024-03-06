package com.ObjectRepository_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtils.WebDriverUtils;

public class LoginPage extends WebDriverUtils
{

	
	//Decleration
	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement userNameTextField;
	
	@FindBy(xpath ="//input[@placeholder='Password']")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//button[@name='btnlogin']")
	private WebElement loginBtn;
	
	
	//initilization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//utilization
	
	public WebElement getUserNameTextField() {
		return userNameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	//bussiness Logic
	public void loginToApp(String userName,String password,WebDriver driver)
	{
		userNameTextField.sendKeys(userName);
		passwordTextField.sendKeys(password);
		loginBtn.click();
		acceptAlert(driver);
		
	}
	

}
