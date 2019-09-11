 package pac1;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class dropdownselect {

public static void main (String args[]) throws InterruptedException
	
	{
		System.out.println("This is the First script ");
		System.setProperty("webdriver.chrome.driver","/Users/sds-shanmuga.r/Desktop/sele/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://team-scale.com/testo/references/ajax/");
		driver.manage().window().maximize();
		Select  pdp=new Select(driver.findElement(By.id("manufacture")));
		pdp.selectByIndex(1);
		
		Select cdp=new Select(driver.findElement(By.xpath("//select[@id='model']")));
		
		System.out.println("B");
		
	List<WebElement> l1=cdp.getOptions();
	
	
	System.out.println("C");

		
		
		for (int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i).getText());
		}
		
		driver.close();
		
	}
	
}
