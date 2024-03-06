package com.ObjectRepository_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage 
{
	//decleration
	
	@FindBy(xpath = "//img[@class='img-profile rounded-circle']")
	private WebElement princeLyCesarBtn;
	
	@FindBy(xpath = "//div[@aria-labelledby='userDropdown']/child::a[@data-target='#logoutModal']")
	private WebElement logoutBtn;
	
	@FindBy(xpath = "//div[@aria-modal='true']/descendant::a[@class='btn btn-primary']")
	private WebElement confirmPopupPageLogoutBtn;

	
	//initlization
	public LogoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

//Utilization
	public WebElement getPrinceLyCesarBtn() {
		return princeLyCesarBtn;
	}


	public WebElement getLogoutBtn() {
		return logoutBtn;
	}


	public WebElement getConfirmPopupPageLogoutBtn() {
		return princeLyCesarBtn;
	}
	
	
	//Bussines Logic
	public void logoutFromApp()
	{
		 princeLyCesarBtn.click();
		 logoutBtn.click();
		 confirmPopupPageLogoutBtn.click();
		
	}
	
}
