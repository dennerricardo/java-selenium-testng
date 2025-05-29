package introduction;


import com.google.common.io.Files;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;

public class Assignment {

    public static void main(String[] args) throws InterruptedException, IOException {
        String text = "Denner";
        System.setProperty("webdriver.chrome.driver", "/Users/Denner Ricardo/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Thread.sleep(2000L);
        driver.findElement(By.id("name")).sendKeys(text);

        driver.findElement(By.cssSelector("[id='alertbtn']")).click();

        // Switch context and grab the alert text
        System.out.println(driver.switchTo().alert().getText());
        // Switch context to accept the alert
        driver.switchTo().alert().accept();

        driver.findElement(By.id("name")).sendKeys("Bob dylan");
        driver.findElement(By.cssSelector("[id='confirmbtn']")).click();

        System.out.println(driver.switchTo().alert().getText());
        // Switch context to dismiss the alert
        driver.switchTo().alert().dismiss();
        getScreenshot(driver);




        driver.quit();
    }

    public static void getScreenshot(WebDriver driver) throws IOException{
//        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        File src  = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Files.copy(src, new File("C://Users/Denner Ricardo/java-selenium-testng/screenshots/screenshot.png"));

    }
}
