package HandlingDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetALLselected {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		
		WebElement sel=driver.findElement(By.id("cars"));
		Select obj=new Select(sel);
		obj.selectByContainsVisibleText("Audi");
		obj.selectByContainsVisibleText("Saab");
        obj.selectByContainsVisibleText("Volvo");
        List<WebElement> options=obj.getAllSelectedOptions();
        for(WebElement opt:options) {
        	//String s=opt.getText();
        	//System.out.println(s);
        	System.out.println(opt.getText());
        }
driver.quit();
}
}
