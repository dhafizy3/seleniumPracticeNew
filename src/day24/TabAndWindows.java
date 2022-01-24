package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class TabAndWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dawoo\\Desktop\\SDET\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demo.nopcommerce.com/");
		Keys.chord(Keys.CONTROL, Keys.RETURN);
		
		//driver.switchTo().window(WindowType.TAB);
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

}
