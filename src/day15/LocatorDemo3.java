package day15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dawoo\\Desktop\\SDET\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://www.facebook.com/");
		dr.manage().window().maximize();
		
		
		String arValue = dr.findElement(By.cssSelector("#email")).getAttribute("value");
		System.out.println(arValue);
//		Thread.sleep(3000);
//
//		dr.findElement(By.cssSelector("#email")).clear();
//		
//		Thread.sleep(3000);
//		
//		dr.findElement(By.cssSelector("input.inputtext")).sendKeys("dawood.hafizy.9");

	}

}
