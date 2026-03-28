package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();//launching the browser
		driver.get("https://demowebshop.tricents.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Twitter")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
