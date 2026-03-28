import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.v140.domsnapshot.model.Rectangle;

public class GetRectangle {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();//launching the browser
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement registerlink=driver.findElement(By.linkText("Register"));
		Rectangle rect=registerlink.getRect();
		System.out.println(rect.getDimension());
		System.out.println(rect.getHeight());
		System.out.println(rect.height);
		System.out.println(rect.getWidth());
		System.out.println(rect.width);
		//fetching point coordinates along x and y 
		System.out.println(rect.getPoint());
		System.out.println(rect.getX());
		System.out.println(rect.x);
		System.out.println(rect.getY());
		System.out.println(rect.y);
		}
}
