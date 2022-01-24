package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dawoo\\Desktop\\SDET\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//1. Scroll page by pixel number
		
		/*js.executeScript("window.scrollBy(0,3000)", "");
		long value= (Long)js.executeScript("return window.pageYOffset;");
		System.out.println("number of pixel: " +value);*/
		
		//2. Scroll down till element is visible
		/*WebElement cr = driver.findElement(By.xpath("//img[@alt='Flag of Croatia']"));
		js.executeScript("arguments[0].scrollIntoView();", cr);
		long value= (Long)js.executeScript("return window.pageYOffset;");
		System.out.println("number of pixel: " +value);*/
		
		//2. Scroll down till element is visible

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		long value= (Long)js.executeScript("return window.pageYOffset;");
		System.out.println("number of pixel: " +value);
		
	}

}
