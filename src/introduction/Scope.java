package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

    public static void main(String[] args) {
        // 1. give me the count of links on th page.
        //a

        System.setProperty("webdriver.chrome.driver", "/Users/Denner Ricardo/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        System.out.println(driver.findElements(By.tagName("a")).size());

        WebElement footerdriver = driver.findElement(By.id("gf-BIG"));

        System.out.println(footerdriver.findElements(By.tagName("a")).size());
    }
}
