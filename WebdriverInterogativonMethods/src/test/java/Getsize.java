//import java.awt.Dimension;
import org.openqa.selenium.Dimension;   
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getsize {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();//launching the browser
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement searchBtn=driver.findElement(By.id("nav-search-submit-button"));
		Dimension dims=searchBtn.getSize();
   System.out.println("the dimension of search button is"+dims);
   System.out.println(dims.getHeight());
   System.out.println(dims.height);
   System.out.println(dims.getWidth());
   System.out.println(dims.width);
   System.out.println(searchBtn.getCssValue("height"));
	}
   
}
