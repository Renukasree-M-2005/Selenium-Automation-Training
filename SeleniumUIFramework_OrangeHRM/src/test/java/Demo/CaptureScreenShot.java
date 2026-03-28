package Demo;

import java.io.File;
import java.io.IOException;
import java.security.Timestamp;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import Generic_Utility.WebDriverUtility;
import object_repository.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CaptureScreenShot {
@Test
    // Run | Debug
    public void screenShot() throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverUtility wu = new WebDriverUtility(driver);
        Object_Repository.LoginPage lp= new Object_Repository.LoginPage(driver);
        wu.configMaximizedBrowser();
        wu.waitForElementsToLoad(20);
        wu.navigateToApplication("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        lp.login("Admin", "admin123");
        Thread.sleep(5000);
 // Capture the screenshot of Home page       
        TakesScreenshot ts = (TakesScreenshot) driver;
        File temp = ts.getScreenshotAs(OutputType.FILE);
        File perm = new File("./Report/dashboard.png");
        FileHandler.copy(temp, perm);
        WebElement recruitment = driver.findElement(By.xpath("//span[normalize-space()='Recruitment']"));
        recruitment.click();
Thread.sleep(3000);
        File temp2 = ts.getScreenshotAs(OutputType.FILE);
        File perm2 = new File("./Report/recruitmentPage.png");
        FileHandler.copy(temp2, perm2);
        driver.quit();
    }
}
