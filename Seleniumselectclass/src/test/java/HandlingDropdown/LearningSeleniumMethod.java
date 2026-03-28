package HandlingDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningSeleniumMethod {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(4000);
//		driver.findElement(By.name("username")).senullndKeys("Admin");
		WebElement dropdown=driver.findElement(By.id("Skills"));
		Select sel=new Select(dropdown);
		sel.selectByIndex(9);
		sel.selectByValue("Data Analytics");
		Thread.sleep(2000);
		sel.selectByContainsVisibleText("script");
		
		
	}
}
