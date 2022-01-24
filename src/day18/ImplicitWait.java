package day18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dawoo\\Desktop\\SDET\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver drv= new ChromeDriver();
		
		drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		drv.get("https://www.google.com/");
		drv.manage().window().maximize();
		
		drv.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
		drv.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
		
		//Thread.sleep(5000);
		drv.findElement(By.xpath("//h3[normalize-space()='SeleniumHQ Browser Automation']")).click();
		
		
		//drv.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();

	}

}
