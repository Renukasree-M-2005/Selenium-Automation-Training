package HandlingDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleCheck {
	public static void main(String[] args) throws InterruptedException{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	Thread.sleep(4000);
	WebElement sel=driver.findElement(By.id("cars"));
	Select obj=new Select(sel);
	System.out.println(obj.isMultiple());
	WebElement sel1=driver.findElement(By.id("cars"));
	Select obj1=new Select(sel1);
	System.out.println(obj1.isMultiple());

}
}
