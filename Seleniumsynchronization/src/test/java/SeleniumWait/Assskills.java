package SeleniumWait;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assskills {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
				
		driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(20));
		driver.get("https://icehrmpro.gamonoid.com/login.php");
		driver.findElement(By.name("username")).sendKeys("invalidusername");
		driver.findElement(By.id("password")).sendKeys("invalidpss");
        driver.findElement(By.cssSelector("button[type='button']")).click();
        String actualMsg = driver.findElement(By.className("alert-danger")).getText();

        if(actualMsg.equals("Login failed")) {
            System.out.println("Invalid credential error message displayed");
        } else {
            System.out.println("Error message not displayed");
        }
        
        
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
     
        driver.findElement(By.xpath("//a[text()='Employees']")).click();
        driver.findElement(By.xpath("//ul[@id='admin_Employees']//a")).click();
    	driver.findElement(By.id("tabEmployeeSkill")).click();
    	driver.findElement(By.xpath("//button[text()='Save']")).click();
    	 driver.findElement(By.xpath("//span[text()='IceHrm ']")).click();
 		driver.findElement(By.linkText("Sign out")).click();

    	
 
	}
}
