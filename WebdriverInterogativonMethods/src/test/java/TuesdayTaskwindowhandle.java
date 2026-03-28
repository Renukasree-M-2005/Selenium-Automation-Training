import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TuesdayTaskwindowhandle {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();//launching the browser
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'Facebook')]")).click();
		System.out.println(driver.getWindowHandle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Twitter']")).click();
		System.out.println(driver.getWindowHandle());
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println(allwindows);
		for(String str:allwindows) {
			driver.switchTo().window(str);
			String title=driver.getTitle();
			Thread.sleep(2000);
			System.out.println("id"+str);
			System.out.println("title"+title);
		}
		

}
}