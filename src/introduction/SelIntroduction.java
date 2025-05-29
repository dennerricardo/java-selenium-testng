package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

		public static void main(String[] args) {
			// invoking Browser
			// Chrome - ChromeDriver => Methods
			//.WebDriver close get
			
			// chromedriver.exe-> Chrome Browser 
			// System.setProperty("webdriver.chrome.driver", "/Users/Denner Ricardo/chromedriver.exe");
			
			// webDriver methods + class methods
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			System.out.println(driver.getTitle());  
			System.out.println(driver.getCurrentUrl());
			driver.close(); // shall close the current window
			driver.quit(); // shall quit the driver
			
		}
}
