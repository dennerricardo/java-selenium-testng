package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "/Users/Denner Ricardo/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();

				driver.get("http://google.com");
				driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
				driver.navigate().back();
				driver.navigate().forward();
	}

}
