package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idmethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("godphoto");//amazon
		driver.findElement(By.id("prompt-textarea")).sendKeys("selenium");
		driver.findElement(By.id("aso_search_form_anchor")).sendKeys("capgemini");
		driver.findElement(By.id("typeahead-_R_1kddbsnpflqivb")).sendKeys("oops");
		driver.findElement(By.id("tnb-google-search-input")).sendKeys("tags");
		driver.findElement(By.id("search")).sendKeys("small flower");
		driver.findElement(By.id("full_name")).sendKeys("renukasree");
		driver.findElement(By.id("_R_1h6kqsqppb6amH1_")).sendKeys("renukasreee");
		driver.findElement(By.name("searchVal")).sendKeys("godphotos");
		
		
	}

}
