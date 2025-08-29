package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/Denner Ricardo/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com.br");

        Actions a = new Actions(driver);
        WebElement moveTo = driver.findElement(By.cssSelector("div[id='nav-link-accountList']"));

        a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")))
                .click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();


        //Moves to specific element
        a.moveToElement(moveTo).build().perform();
        a.moveToElement(moveTo).clickAndHold();

    }
}
