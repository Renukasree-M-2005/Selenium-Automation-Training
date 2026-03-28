package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='flex-1']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id'query-builder-test']")).sendKeys("selenium");
		//Thread.sleep(4000);
		
		

		
		
		
		
		
		

	}

}
