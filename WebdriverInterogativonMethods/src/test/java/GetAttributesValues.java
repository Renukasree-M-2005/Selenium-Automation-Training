import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributesValues {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();//launching the browser
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.id("small-searchterms"));
		System.out.println(search.getAttribute("id"));
		System.out.println(search.getDomAttribute("id"));
		System.out.println(search.getDomProperty("id"));
		
		System.out.println(search.getAttribute("value"));
		System.out.println(search.getDomAttribute("value"));
		System.out.println(search.getDomProperty("value"));
		Thread.sleep(2000);
		search.sendKeys("mobile");
		System.out.println(search.getAttribute("value"));
		System.out.println(search.getDomAttribute("value"));
		System.out.println(search.getDomProperty("value"));

	}

}
