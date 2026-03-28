import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();//launching the browser
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		System.out.println(driver.getWindowHandle());
		driver.navigate().refresh();
		driver.get("https://demoapps.qspiders.com/");
		System.out.println(driver.getWindowHandle());
}
}