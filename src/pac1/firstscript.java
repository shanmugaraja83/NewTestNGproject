package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstscript {
	
	
	
	public static void main (String args[]) throws InterruptedException
	
	{
		System.out.println("This is the First script ");
		System.setProperty("webdriver.chrome.driver","/Users/sds-shanmuga.r/Desktop/sele/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://team-scale.com/testo/references/date_picker/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		driver.findElement(By.xpath("//td[@class='eformDay'][3]")).click();
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
