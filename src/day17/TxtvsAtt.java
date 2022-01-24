package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TxtvsAtt {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		
		WebDriver drv= new ChromeDriver();
		
		drv.get("https://demo.nopcommerce.com/login?returnUrl=%2Felectronics");
		WebElement emailBox = drv.findElement(By.xpath("//input[@id='Email']"));
		
		emailBox.clear();
		
		emailBox.sendKeys("dawoodhafiz");
		
	}

}
