package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbyaxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(@class,'headerIconTextAlignment chNavText darkGreyText]")).click();
		


	}

}
