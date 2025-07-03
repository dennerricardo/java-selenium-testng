package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Base {
    public static void main(String[] args) throws  InterruptedException{
        System.setProperty("webdriver.chrome.driver", "/Users/Denner Ricardo/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));


        String[] vegetables = {"Cucumber", "Brocolli","Beetroot", "Carrot"} ;

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        Thread.sleep(3000);
        addItems(driver,vegetables);
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));


        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();

        //explicit wait
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

        driver.findElement(By.cssSelector("span.promoInfo")).getText();
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

    }

    public static void addItems(WebDriver driver,  String[] vegetables ){
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        int j = 0 ;
        for(int i=0; i < products.size();i++){
            //Brocolli - 1 Kg
            String[] nameProduct = products.get(i).getText().split("-");
            String formattedProduct = nameProduct[0].trim();


            //Format it to get actual vegetable name
            //Convert array into array list for easy search
            //Check whether name you extracted is present in the List
            List vgtblsList = Arrays.asList(vegetables);


            if(vgtblsList.contains(formattedProduct)){
                j++;
                System.out.println(formattedProduct);
                //Can mismatch when the text is changing dynamic
                //List<WebElement> indexCart = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
                //indexCart.get(i).click();
                List<WebElement> indexCart = driver.findElements(By.xpath("//div[@class='product-action']//button"));
                indexCart.get(i).click();
                if(j == vegetables.length){
                    break;
                }
            }
        }


    }
}
