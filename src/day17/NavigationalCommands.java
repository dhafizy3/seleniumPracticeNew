package day17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		
		WebDriver drv= new ChromeDriver();
		
		//drv.get("https://www.snapdeal.com/");
		
		drv.navigate().to("https://www.snapdeal.com/");
		drv.navigate().to("https://www.amazon.com/");
		
		Thread.sleep(6000);
		
		drv.navigate().back();
		Thread.sleep(6000);
		drv.navigate().forward();
		
		drv.navigate().refresh();
		
		drv.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
