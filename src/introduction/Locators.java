package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		// System.setProperty("webdriver.chrome.driver", "/Users/Denner Ricardo/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		// Implicit wait is a global wait applied throughout the execution of the Selenium script.
		// Selenium waits for a certain amount of time for an element to appear or become interactable before throwing an exception.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul"); // ID Locator	
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");// Name Locator

		// whenever you see there is a space it means there are 2 classes
		// <button class="submit signInBtn" type="submit">Sign In</button>
		driver.findElement(By.className("signInBtn")).click(); 	// Class Name Locator 

		driver.findElement(By.className("logout-btn")).click(); 	// Class Name Locator
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("error")));

		driver.findElement(By.className("signInBtn")).click();

		Thread.sleep(1000);

		driver.findElement(By.className("error")).isDisplayed();
		driver.findElement(By.className("error")).getText();
		System.out.println(driver.findElement(By.className("error")).getText());
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText() + "<Css Selector>"); // Css Locator ex:1

		driver.findElement(By.linkText("Forgot your password?")).click(); // LinkText Locator

		Thread.sleep(1000); // Mills seconds 1000 = 1 second

		// <Xpath Locator> //Tagname[@attribute='value']
		// <input type="text" placeholder="Name">
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Denner");

		// <Css Selector> Tagname[attribute='value']
		// <input type="text" placeholder="Email">
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Denner@rsf.com"); // Css Locator ex:2
		Thread.sleep(1000);

		// <Xpath Locator> //Tagname[@attribute='value'][2]
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();


		// <input type="text" placeholder="Email">
		// <Css Selector> Tagname[attribute='value']:nth-child(3)
		// this is the last thing what you have to try
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("Denner@rsf.com");

		// <input type="text" placeholder="Phone Number">
		// <Xpath Locator> //parentTagname/childTagname
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("856765675");    // Xpath Locator ex:3

		// <Css Selector> Tagname[attribute='value']:nth-child(3)

		// <button class="reset-pwd-btn">Reset Login</button>
		driver.findElement(By.className("reset-pwd-btn")).click();

		// <form action="#"><h2>Forgot password</h2>
		// <p class="infoMsg">Please use temporary password 'rahulshettyacademy' to Login. </p>
		// <Css Selector> Parenttagname childtagname
		System.out.println(driver.findElement(By.cssSelector("form p")).getText()); // Css Locator ex:4

		// <div class="forgot-pwd-container"><a href="#">Forgot your password?</a></div>
		// <button class="submit signInBtn" type="submit">Sign In</button>
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']//button[1]")).click();



		Thread.sleep(1000); // Mills seconds 1000 = 1 second


		// <input type="text" placeholder="Username" id="inputUsername" value="">
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Denner");

		// CSS regular expression with *
		// <input type="password" placeholder="Password" name="inputPassword" value="">
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

		// <input type="checkbox" id="chkboxOne" name="chkboxOne" value="rmbrUsername">
		driver.findElement(By.id("chkboxOne")).click();

		// Xpath regular expression with [contains(@class,'submit')]
		// <button class="submit signInBtn" type="submit">Sign In</button>
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click(); // Contains (you wish to your xpath[locator] could be short and clean )		
		
		driver.quit();


	}

}
