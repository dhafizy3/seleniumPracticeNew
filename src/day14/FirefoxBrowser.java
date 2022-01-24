package day14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxBrowser {
	public static void main(String[] args) {
		

		
		
//		String browserName = "";
//		
//		switch (browserName) {
//		case "chrome":
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			break;
//			
//		case "firefox":
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//			break;
//			
//		case "edge":
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//			break;
//			
//		default: 
//				WebDriverManager.chromedriver().setup();
//				driver = new ChromeDriver();
//			
//		}
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
     	 
		
		
		driver.get("https://google.com");
	}

}
