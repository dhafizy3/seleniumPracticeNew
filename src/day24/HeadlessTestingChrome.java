package day24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTestingChrome {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
