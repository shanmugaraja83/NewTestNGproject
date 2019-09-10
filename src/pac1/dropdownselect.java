 package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownselect {

public static void main (String args[]) throws InterruptedException
	
	{
		System.out.println("This is the First script ");
		System.setProperty("webdriver.chrome.driver","/Users/sds-shanmuga.r/Desktop/sele/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://team-scale.com/testo/references/ajax/");
		driver.manage().window().maximize();
		driver.findElement(By.id("manufacture"));
		System.out.println("Hi");
		Thread.sleep(2000);
	}
	
}
