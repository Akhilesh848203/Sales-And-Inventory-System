package FlipkartXpath;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AllIphoneNameAndPricePrint 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@placeholder=\"Search for Products, Brands and More\"]")).sendKeys("iphone",Keys.ENTER);
		 List<WebElement> mobiles = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		 List<WebElement> prices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		 
				
		
	}

}
