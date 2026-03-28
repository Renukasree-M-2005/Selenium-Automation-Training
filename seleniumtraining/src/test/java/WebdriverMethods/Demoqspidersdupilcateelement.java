package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqspidersdupilcateelement {

	public static void main(String[] args)throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/duplicate");
		Thread.sleep(2000);
		driver.findElement(By.xpath("contains[.='X Path']")).click();

	}

}
