package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioElement {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(4000);
        driver.findElement(By.cssSelector("[value='feMale']")).click();

	}

}
