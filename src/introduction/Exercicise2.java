package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Exercicise2 {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "/Users/Denner Ricardo/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000L);
		
		driver.findElement(By.name("name")).sendKeys("Denner");
		driver.findElement(By.name("email")).sendKeys("denner@email.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("password");
		
		Assert.assertFalse(driver.findElement(By.id("exampleCheck1")).isSelected());
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement genderDropdown = driver.findElement(By.id("exampleFormControlSelect1"));

		Select gender = new Select(genderDropdown);
		
		gender.selectByVisibleText("Male");
		
		driver.findElement(By.id("inlineRadio2")).click();
		
		Assert.assertTrue(driver.findElement(By.id("inlineRadio2")).isSelected());
		
		driver.findElement(By.name("bday")).sendKeys("07/08/2000");
		
		driver.findElement(By.cssSelector(".btn-success")).click();
				
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		
		Assert.assertEquals(driver.findElement(By.tagName("strong")).getText(),"Success!");
		
		System.out.println(driver.findElement(By.tagName("strong")).getText());
		
		
			
	}

}
