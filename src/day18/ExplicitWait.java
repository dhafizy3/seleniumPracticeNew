package day18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dawoo\\Desktop\\SDET\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver drv= new ChromeDriver();
		WebDriverWait waitTime= new WebDriverWait(drv,Duration.ofSeconds(10));
		
		drv.get("https://www.google.com/");
		drv.manage().window().maximize();
		
		drv.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
		drv.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
		
		
		//WebElement ele = waitTime.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[normalize-space()='SeleniumHQ Browser Automation']")));
		waitTime.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[normalize-space()='SeleniumHQ Browser Automation']"))).click();
		//ele.click();
		



	}

}
