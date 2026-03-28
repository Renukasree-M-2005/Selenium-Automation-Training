import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextandTag {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();//launching the browser
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		WebElement aboutLink=driver.findElement(By.id("navbarDropdown"));
		System.out.println("visible text of the tag is"+aboutLink.getText());
		System.out.println("name of tag is "+ aboutLink.getTagName());
		
		
		

}
}
