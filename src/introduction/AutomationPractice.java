package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutomationPractice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/Denner Ricardo/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
    	Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected()+", check box is unchecked");
		
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected()+", check box is checked");
				
		Thread.sleep(2000L);
		
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected()+", check box is unchecked");

		
				
		// To get the count of number of check boxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		driver.close();
	}

}
