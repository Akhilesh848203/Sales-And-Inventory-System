package com.crm.genericUtils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils 
{
	/**
	 * handle the synchronization problem
	 * @param driver
	 * @param sec
	 */
	public void waitForPageLoad(WebDriver driver, int sec)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
		
	}
	/**
	 * maximize the window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
		
	}
	/*
	 * minimize the window
	 */
	public void minimizeWindow(WebDriver driver)
	{
		driver.manage().window().minimize();
			
	}
	
	/*
	 * explicit wait
	 */
	public WebDriverWait webDriverWaitObj(WebDriver driver, int sec )
	{
		WebDriverWait wait = new WebDriverWait(driver ,Duration.ofSeconds(sec));
				return wait;	
	}
	
	/*
	 * use of explicit wait
	 */
	public void waitUntilEleToBeVisible(WebDriver driver ,int sec,WebElement element)
	{
		
		webDriverWaitObj(driver , sec).until(ExpectedConditions.visibilityOf(element));
	}
	
	/*
	 * use of exlicit wait
	 */
	public void waitUntilEleToBeClickable(WebDriver driver , int se , WebElement element)
	{
		webDriverWaitObj(driver, se).until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/*
	 * use of explicit wai
	 */
	public void waitUntilAlertToBePresent(WebDriver driver , int sec)
	{
		webDriverWaitObj(driver, sec).until(ExpectedConditions.alertIsPresent());
	}
	
	/*
	 * creating the object of select class
	 */
	
	public Select dropDownObj(WebElement element)
	{
		Select sel = new Select(element);
		return sel;
	}
	
	/*
	 * selecting the dropdown element by using index value
	 */
	public void handleDropdown(WebElement element , int index)
	{
		dropDownObj(element).selectByIndex(index);
	}
	/*
	 * selecting the dropdown element by using  value
	 */
	
	public void handleDropdown(WebElement element, String value)
	{
		dropDownObj(element).selectByValue(value);
	}
	/*
	 * selecting the dropdown element by using visible text
	 */
	
	public void handleDropdown(String value,WebElement element)
	{
		dropDownObj(element).selectByVisibleText(value);
	}
	/*
	 * creating object of action class
	 */
	
	public Actions actionObj(WebDriver driver)
	{
		Actions act = new Actions(driver);
		return act;
	}
	
	/*
	 * handling the drag drop
	 */
	public void dragAndDrop(WebDriver driver, WebElement element )
	{
		actionObj(driver).click(element).perform();
	}
	
	//popup
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void cancelAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	/*
	 * handling the multiple window through driver transfer from one window to target window
	 */
	
	public void switchToWindow(WebDriver driver,String expWind)
	{
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		while(it.hasNext())
		{
			String win = it.next();
			String currentTitle = driver.switchTo().window(win).getTitle();
			
			if(currentTitle.contains(expWind));
			{
				break;
			}
		}
		
		//string scrPath
		}
		
	public String takescreenshot(WebDriver driver,String screenshotName) throws IOException 
	{
		javaUtils ju = new javaUtils();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = ".\\Screeshot\\"+screenshotName+ju.getSystemDateInFormat()+".png";
		File destination = new File(path);
		String srcPath = destination.getAbsolutePath();
		FileUtils.copyFile(src, destination);
		return srcPath;
		
		
	}
	
}
