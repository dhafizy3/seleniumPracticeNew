package day23;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions2 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dawoo\\Desktop\\SDET\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.SPACE).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.CONTROL).perform();
		Thread.sleep(3000);

		act.sendKeys(Keys.ESCAPE).perform();
	}

}
