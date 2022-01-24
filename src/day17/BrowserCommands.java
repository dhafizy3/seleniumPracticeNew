package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		
		WebDriver drv= new ChromeDriver();
		
		drv.get("https://opensource-demo.orangehrmlive.com/");
		
		drv.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Thread.sleep(5000);
		
		//drv.close();
		drv.quit();
		
		

	}

}
