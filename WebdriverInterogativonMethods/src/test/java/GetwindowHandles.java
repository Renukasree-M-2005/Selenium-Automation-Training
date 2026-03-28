import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetwindowHandles {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();//launching the browser
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(2000);
		String parentid=driver.getWindowHandle();
		System.out.println(parentid);
		driver.findElement(By.xpath("//h2[.='Watches']/..//button")).click();
		Thread.sleep(2000);
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println("allwindows"+allwindows);
		allwindows.remove(parentid);
       System.out.println(allwindows);//also in the form of set so convert into string use itarotor or foreach
       for(String string:allwindows ) {
    	   System.out.println(string);
       }
   	Thread.sleep(2000);
}
}