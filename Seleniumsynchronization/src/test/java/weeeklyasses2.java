import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class weeeklyasses2 {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
				
		driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(20));
		driver.get("https://icehrmpro.gamonoid.com/login.php");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.cssSelector("button[type='button']")).click();
		String expectedUrl = "https://icehrmpro.gamonoid.com/?g=admin&n=dashboard&m=admin_Admin";
        String currentUrl = driver.getCurrentUrl();
        if(currentUrl.contains(expectedUrl)) {
            System.out.println("Login Successful - Dashboard page displayed");
        } else {
            System.out.println("Login Failed");
        }
        driver.findElement(By.cssSelector("#menu_admin_Employees span")).click();
        
       // driver.findElement(By.xpath("[contains(text(),'Employees')]")).click();
        driver.findElement(By.xpath("//ul[@id='admin_Employees']//a")).click();
    	//driver.findElement(By.cssSelector("button[type='button']")).click();
       //driver.findElement(By.cssSelector("button.ant-btn")).click();
      driver.findElement(By.xpath("//span[text()='Filter Employees']")).click();
      driver.findElement(By.xpath("//span[text()='Select Department']")).click();
      driver.findElement(By.xpath("//div[text()='Marketing Department']")).click();
     
      driver.findElement(By.cssSelector("button.ant-btn-primary")).click();
      driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
	    
	
	}
	


}
