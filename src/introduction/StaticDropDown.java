package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {

				System.setProperty("webdriver.chrome.driver", "/Users/Denner Ricardo/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				

				WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

				//dropdown with select tag - static

				// <select name="ctl00$mainContent$DropDownListCurrency" id="ctl00_mainContent_DropDownListCurrency">
                //      <option value="">Select</option>
                //      <option value="INR">INR</option>
                //      <option value="AED">AED</option>
                //      <option value="USD">USD</option>
				// </select>

				Select dropdown = new Select(staticDropdown);
				
				dropdown.selectByIndex(3);
				System.out.println(dropdown.getFirstSelectedOption().getText());
				
				dropdown.selectByVisibleText("AED");
				System.out.println(dropdown.getFirstSelectedOption().getText());
				
				dropdown.selectByValue("INR");
				System.out.println(dropdown.getFirstSelectedOption().getText());
				
				
			
	}

}
