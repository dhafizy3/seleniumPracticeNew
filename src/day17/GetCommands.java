package day17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		
		WebDriver drv= new ChromeDriver();
		
		drv.get("http://automationpractice.com/index.php?");
		System.out.println(drv.getTitle());
		System.out.println(drv.getCurrentUrl());
//		System.out.println(drv.getPageSource());
		
		
		


	}

}
