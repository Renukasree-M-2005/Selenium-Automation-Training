package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationsite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		driver.findElement(By.className("form-control ng-dirty ng-valid-parse ng-valid ng-valid-required ng-touched")).sendKeys("renu");

	}

}
