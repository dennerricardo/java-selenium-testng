package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandles {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/Denner Ricardo/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
        Set<String> windows = driver.getWindowHandles(); //[parentId,childId,subchilId]

        Iterator<String> it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();
//        String subchilId = it.next();

        driver.switchTo().window(childId);
        System.out.println(driver.findElement(By.cssSelector("p[class='im-para red']")).getText());

        String emailId = driver.findElement(By.cssSelector("p[class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];

        System.out.println(emailId);
        driver.switchTo().window(parentId);

        driver.findElement(By.cssSelector("input[id='username']")).sendKeys(emailId);

    }
}
