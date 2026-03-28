package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbystartswith {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[starts-with(text(),'Digital')]")).click();
		driver.get("https://www.ebay.com/");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(text(),'g')]")).sendKeys("watch");
		
		

	}

}
