package SeleniumWait;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FridayTestCase {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
				
		driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
	//	driver.findElement(By.linkText("Facebook")).click();
		String paret=driver.getWindowHandle();
		driver.findElement(By.linkText("Facebook")).click();
		driver.findElement(By.linkText("Twitter")).click();
		driver .findElement(By.linkText("YouTube")).click();
		Set<String> all=driver.getWindowHandles();
		for(String child:all) {
		driver.switchTo().window(child);
		if(driver.getTitle().equals("YouTube")) {
			driver.switchTo().window(child);
		}
		}
		driver.findElement(By.cssSelector("[type=\"text\"]")).sendKeys("Nelothi");
		driver.findElement(By.cssSelector("[title=\"Search\"]")).click();


}
}