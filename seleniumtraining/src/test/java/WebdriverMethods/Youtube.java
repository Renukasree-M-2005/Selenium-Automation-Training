package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(4000);
		driver.findElement(By.("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		

	}

}
