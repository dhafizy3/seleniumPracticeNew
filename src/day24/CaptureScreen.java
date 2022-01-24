package day24;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreen {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Fullpage screenshot
		//TakesScreenshot ss= (TakesScreenshot)driver;
		/*File src=ss.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\dawoo\\eclipse-workspace\\Selenium\\Downloads\\homepage.png");
		
		FileUtils.copyFile(src,trg);*/
		
		//Part of the webpage
		/*WebElement pageSection=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File ps=pageSection.getScreenshotAs(OutputType.FILE);
		File trg= new File("C:\\Users\\dawoo\\eclipse-workspace\\Selenium\\Downloads\\featured.png");
		FileUtils.copyFile(ps, trg);*/
		
		WebElement pageSection=driver.findElement(By.xpath("//button[normalize-space()='Search']"));
		File ps=pageSection.getScreenshotAs(OutputType.FILE);
		File trg= new File("C:\\Users\\dawoo\\eclipse-workspace\\Selenium\\Downloads\\sejk.png");
		FileUtils.copyFile(ps, trg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
