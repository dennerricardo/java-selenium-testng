package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/Denner Ricardo/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
//        driver.switchTo().frame();
        driver.findElement(By.id("draggable"));

    }
}
