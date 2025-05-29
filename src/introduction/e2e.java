package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "/Users/Denner Ricardo/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.spicejet.com/");

		if(driver.findElement(By.xpath("(//div[@data-testid='return-date-dropdown-label-test-id'])[1]")).getDomAttribute("style").contains("background-color")){
			System.out.println("It's Disabled");
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);

		}

		driver.findElement(By.xpath("//input[@value='Delhi (DEL)']")).click();
		Thread.sleep(2000);

		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'BLR')]")).getText());
		driver.findElement(By.xpath("//div[contains(text(),'BLR')]")).click();
		Thread.sleep(2000);

		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'MAA')]")).getText());
		driver.findElement(By.xpath("//div[contains(text(),'MAA')]")).click();
		Thread.sleep(2000);


		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-16ru68a r-y47klf r-1loqt21 r-17b3b9k r-1otgn73 r-1aockid']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		Thread.sleep(2000);
		

		for(int i=1; i<5; i++) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		}

		driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).getText(), "5 Adults");

		System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).getText());
	}
		

}
