package day20;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.footlocker.ca/");
		driver.manage().window().maximize();
		
		WebDriverWait waitTime= new WebDriverWait(driver,Duration.ofSeconds(20));
		
		waitTime.until(ExpectedConditions.alertIsPresent());
		
	 driver.switchTo().alert().dismiss();
		
	

		
		
		

	}

}
