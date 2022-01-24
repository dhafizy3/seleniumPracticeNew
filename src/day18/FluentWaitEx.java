package day18;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitEx {

	public static WebElement main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dawoo\\Desktop\\SDET\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver drv= new ChromeDriver();
		
		drv.get("https://www.google.com/");
		drv.manage().window().maximize();
		
		drv.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
		drv.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
		
		   // Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.


		waitForFluentWait(drv,By.xpath("//h3[normalize-space()='SeleniumHQ Browser Automation']")).click();
		return null;
	}

	public static WebElement waitForFluentWait(WebDriver drv, final By locator) {
		
		
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(drv)
			       .withTimeout(Duration.ofSeconds(20))
			       .pollingEvery(Duration.ofSeconds(5))
			       .ignoring(NoSuchElementException.class);
		
		   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver drv) {
			       return drv.findElement(locator);
			     }
			   });	
		   return element;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
