package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dawoo\\Desktop\\SDET\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		WebElement desk = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac =driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		
		//mouse hover action
		Actions act = new Actions(driver);
		
		act.moveToElement(desk).moveToElement(mac).click().perform();
		
		
	}

}
