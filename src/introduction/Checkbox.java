package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {

		// TestNG is one of the testing framework
		System.setProperty("webdriver.chrome.driver", "/Users/Denner Ricardo/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.spicejet.com/");

		Assert.assertFalse(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-7o8qx1'])[1]")).isSelected());
		System.out.println(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-7o8qx1'])[1]")).isSelected());
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-7o8qx1'])[1]")).click();

		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-7o8qx1'])[1]")).isSelected());

//		driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
//
//		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
//		System.out.println(driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
//
//		// count the number of checkboxes
//		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		


		
	}

}
