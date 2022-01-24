package day18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dawoo\\Desktop\\SDET\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver drv= new ChromeDriver();
		
		drv.get("https://www.google.com/");
		drv.manage().window().maximize();
		
		drv.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
		drv.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
		
		By element = By.xpath("//h3[normalize-space()='SeleniumHQ Browser Automation']");
		waitForElement(drv,element,10).click();

	}
	
	public static WebElement waitForElement(WebDriver drv, By locator, int timeout) {
		
		WebDriverWait wait = new WebDriverWait(drv, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		return drv.findElement(locator);
		
	}
	

}
