package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dawoo\\Desktop\\SDET\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?");
		driver.manage().window().maximize();
		
		WebElement women=driver.findElement(By.xpath("//a[@title='Women']"));
		
		//Actions act = new Actions(driver);
		//act.moveToElement(women).perform();

		Actions act =new Actions(driver);
		Action ac=act.moveToElement(women).build();   //We create action but not performed.
		
		ac.perform();
	
		
	}

}
