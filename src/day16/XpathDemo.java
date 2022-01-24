package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dawoo\\Desktop\\SDET\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		
		dr.get("http://automationpractice.com/index.php?");
		dr.manage().window().maximize();
		
		
		//dr.findElement(By.xpath("//input[@id='search_query_top' or @type='text']")).sendKeys("T-shirt");
		//dr.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/form[1]/div[3]/input[1]")).sendKeys("admin123");
		//dr.findElement(By.xpath("//button[@name='submit_search' or @ type='something']")).click();
		
		//dr.close();
		
		//Contains & Starts-with Xpaths
		
		//dr.findElement(By.xpath("//input[contains(@id,'top')]")).sendKeys("T-shirt");
		//dr.findElement(By.xpath("//button[@name='submit_search' or @ type='something']")).click();
		dr.findElement(By.xpath("//a[text()='Women']")).click();
		
		

	}

}
