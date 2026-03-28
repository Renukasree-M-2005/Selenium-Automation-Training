

//import java.awt.Point;
import org.openqa.selenium.Point;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssvalue {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();//launching the browser
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.name("q"));
		Point loc=search.getLocation();
		System.out.println(loc);
		System.out.println(loc.getX());
		System.out.println(loc.x);
		System.out.println(loc.getY());
		System.out.println(loc.y);
		driver.quit();
		}	
	}
