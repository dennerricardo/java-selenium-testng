package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Scope {

    public static void main(String[] args) throws InterruptedException {
        // 1. give me the count of links on th page.

        System.setProperty("webdriver.chrome.driver", "/Users/Denner Ricardo/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        System.out.println(driver.findElements(By.tagName("a")).size());

        //  limiting webDriver scope to footer
        WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerdriver.findElements(By.tagName("a")).size());

        WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columndriver.findElements(By.tagName("a")).size());

        // Click on each link in the column and check if they are open

        for( int i = 1 ; i < columndriver.findElements(By.tagName("a") ).size(); i++ ) {
            String clickonlinkTab =  Keys.chord(Keys.CONTROL, Keys.ENTER);

            //So whenever there is a keyboard event,
            //you have to pass them both as a sendKeys method.

            columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
            System.out.println(columndriver.findElements(By.tagName("a")).get(i).getText());
            Thread.sleep(5000L);


        }

//          So, in this A, B, C, our count will be four.
//          So, it clearly says
//          there are totally one, two, three, four,
//          five windows.
//          Okay? But this iterator will help you
//          to move to each and every window.
//          Okay? Once we move to that window id,
//          we'll switch to that.

        String parentWindow = driver.getWindowHandle();

        Set<String> abc = driver.getWindowHandles();
        Iterator<String> it = abc.iterator();

//          if you want to move to fourth,
//          you have to repeat this four times.
//          So, instead of that,
//          you can put simply while loop
//          and it keeps on increasing.
//          What is the condition I'm putting here?
//          HasNext. So, it tells whether the next index is present.

//          Has next tells us whether next index is present or not.
        while(it.hasNext()){
//          when you say it dot next, it actually moves to next index.
            String childWindow = it.next();
            driver.switchTo().window(childWindow);

            // Close only the child tab
            if (!childWindow.equals(parentWindow)) {
                System.out.println(driver.getTitle());
                driver.close();
            }

        }

    }
}
