package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DymanicDropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/Denner Ricardo/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://corporate.spicejet.com/Default.aspx");
		
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_1']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_1']")).isSelected());
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); 
		
		
//		System.out.println(driver.findElement(By.id("#ctl00_mainContent_view_date2")).isEnabled());
//		driver.findElement(By.id("#ctl00_mainContent_view_date2")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("its enabled");
					Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		
		// //a[@value='MAA'] 

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='AJL']")).click();
		System.out.println(driver.findElement(By.xpath("//a[@value='AJL']")).getText());
		Thread.sleep(2000);
		// driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();

		// (//a[@value='BKK'])[2] if have more than one to click on the second by index 
		// driver.findElement(By.xpath("(//a[@value='BKK'])[2]")).click();
		// System.out.println(driver.findElement(By.xpath("(//a[@value='BKK'])[2]")).getText());

		// have some companies that don't like search by index so down below have other solution with xpath 
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BKK']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BKK']")).getText());
		

	}

}
