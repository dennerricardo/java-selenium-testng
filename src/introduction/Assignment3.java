package introduction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;
import java.util.*;

public class Assignment3 {
    public static void main(String[] args) throws  InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "/Users/Denner Ricardo/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();

        // Disable Chrome password manager to avoid that pop-up
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        w.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));

        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");

        driver.findElement(By.cssSelector("input[value='user']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[value='user']")).isSelected());


        w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();

        driver.findElement(By.cssSelector("select[class='form-control']")).click();
        driver.findElement(By.xpath("//option[contains(text(),'Consultant')]")).click();



        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();

        w.until(ExpectedConditions.visibilityOfElementLocated(By.id("navbarResponsive")));

        //explicit wait
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-info']")));
        addAllItemsToCart(driver);


    }

    public static void addAllItemsToCart(WebDriver driver){
        List<WebElement> items = driver.findElements(By.cssSelector("h4.card-title"));
        List<WebElement> addButtons = driver.findElements(By.cssSelector("button.btn.btn-info"));
        for(int i = 0 ; i < items.size(); i++){
            String itemName = items.get(i).getText();
            System.out.println("Adding item to cart: " + itemName);
            addButtons.get(i).click();
        }

    }
    
}
