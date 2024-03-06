package com.ObjectRepository_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtils.WebDriverUtils;

public class AccountPage extends WebDriverUtils
{
	//Decleratin
		@FindBy(xpath = "//i[@class='fas fa-fw fa-plus']")
		private WebElement addUserAccountPlusBtn;
		
		@FindBy(xpath = "//select[@name='empid']")
		private WebElement selectEmployeeDropDown;
		
		@FindBy(xpath = "//form[@action='us_transac.php?action=add']/descendant::input[@placeholder='Username']")
		private WebElement userNameTextField;
		
		@FindBy(xpath = "//form[@action='us_transac.php?action=add']/descendant::input[@name='password']")
		private WebElement passwordTextField;
		
		@FindBy(xpath = "//form[@action='us_transac.php?action=add']/descendant::button[text()='Save']")
		private WebElement saveBtn;
		
		@FindBy(xpath = "//span[text()='Prince Ly Cesar']")
		private WebElement princeLyCesarDropDownBtn;
		
		@FindBy(xpath = "//div[@aria-labelledby='userDropdown']/child::a[@href='#']")
		private WebElement logoutBtn;
		
		@FindBy(xpath = "//div[@aria-modal='true']/descendant::a[@class='btn btn-primary']")
		private WebElement confirmPopupPageLogoutBtn;
		
		//intilization
		public AccountPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		//utilization
		public WebElement getAddUserAccountPlusBtn() {
			return addUserAccountPlusBtn;
		}

		public WebElement getSelectEmployeeDropDown() {
			return selectEmployeeDropDown;
		}

		public WebElement getUserNameTextField() {
			return userNameTextField;
		}

		public WebElement getPasswordTextField() {
			return passwordTextField;
		}

		public WebElement getSaveBtn() {
			return saveBtn;
		}

		public WebElement getPrinceLyCesarDropDownBtn() {
			return princeLyCesarDropDownBtn;
		}

		public WebElement getLogoutBtn() {
			return logoutBtn;
		}

		public WebElement getConfirmPopupPageLogoutBtn() {
			return confirmPopupPageLogoutBtn;
		}
		
		//Bussines Logic
		
		public void addUserAccountPlusBtn()
		{
			addUserAccountPlusBtn.click();
		}
		
		public void enterAllDetailsToaddUserAccount(String employeeName,String userName,String password)
		{
			
			handleDropdown(employeeName, selectEmployeeDropDown);
			userNameTextField.sendKeys(userName);
			passwordTextField.sendKeys(password);
			saveBtn.click();
//			princeLyCesarDropDownBtn.click();
//			logoutBtn.click();
//			confirmPopupPageLogoutBtn.click();
			
			
			
			
		}

}
