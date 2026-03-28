package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextField {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(4000);
	    WebElement firstname=driver.findElement(By.cssSelector("[placeholder='First Name']"));
	    firstname.sendKeys("renu");
	    Thread.sleep(2000);
	    firstname.clear();
	    
	    
	    


	}

}
