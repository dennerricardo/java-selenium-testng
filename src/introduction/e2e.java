package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/Denner Ricardo/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");

		// dropdown with select tag - Dynamic
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		Thread.sleep(2000);
		
//		int i=1;
//	while (i<5) {
//			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
//			i++;
//	
//	}
	
	for(int i=1; i<5; i++) {
		driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
	}

		driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).getText(), "5 Adults");
//		
		System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).getText());
	}
		

}
