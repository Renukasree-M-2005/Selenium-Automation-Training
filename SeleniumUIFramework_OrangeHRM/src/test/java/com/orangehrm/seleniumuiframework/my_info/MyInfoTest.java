package com.orangehrm.seleniumuiframework.my_info;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyInfoTest {
	WebDriver driver = null;

	@Test
	public void login() throws InterruptedException {
		// launching the browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Navigating to orange hrm
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		// login using valid credentials
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(3000);
		// Myinfo link
		driver.findElement(By.xpath("//span[.='My Info']")).click();
		// Adding Info
		WebElement fn = driver.findElement(By.name("firstName"));
		Actions act = new Actions(driver);

	}
}
