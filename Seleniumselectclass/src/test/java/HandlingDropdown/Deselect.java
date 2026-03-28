package HandlingDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Deselect {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(4000);
		WebElement sel=driver.findElement(By.id("select-multiple-native"));
		Select obj=new Select(sel);
		obj.selectByContainsVisibleText("Fjallraven - Foldsac...");
		obj.selectByContainsVisibleText("Mens Casual Premium ...");
      obj.selectByContainsVisibleText("Mens Casual Slim Fit...");
       obj.selectByContainsVisibleText("John Hardy Women's L...");
       obj.selectByContainsVisibleText("White Gold Plated Pr...");
       obj.deselectAll();
      obj.selectByContainsVisibleText("Fjallraven - Foldsac...");
		obj.selectByContainsVisibleText("Mens Casual Premium ...");
     obj.selectByContainsVisibleText("Mens Casual Slim Fit...");
      obj.selectByContainsVisibleText("John Hardy Women's L...");
      obj.selectByContainsVisibleText("White Gold Plated Pr...");
      List<WebElement> options = obj.getOptions();
      System.out.println(options);
      System.out.println(options); 
      for(WebElement opt:options) {
    	  System.out.println(opt.getText());
      }
      

		
	}
}
