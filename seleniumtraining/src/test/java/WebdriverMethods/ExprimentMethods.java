package WebdriverMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExprimentMethods {

	    public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://www.google.com");

	        // 1️⃣ Current window ID
	        String first = driver.getWindowHandle();

	        // Open another site in same driver (simulate second window manually if popup happens)
	        driver.get("https://www.flipkart.com");

	        // 2️⃣ Get all window IDs
	        Set<String> all = driver.getWindowHandles();

	        // 3️⃣ Switch to window (if multiple exist)
	        for(String id : all) {
	            driver.switchTo().window(id);
	        }

	        System.out.println(driver.getTitle());

	        driver.quit();
	    }
	}


