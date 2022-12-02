package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basics {

	public static void main(String[] args) {
	
		//System.setProperty("webdriver.firefox.marionette", "C:\\Users\\dawoo\\Desktop\\SDET\\geckodriver-v0.29.1-win64");
		//FirefoxDriver driver=new FirefoxDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
//		WebDriver driver= new FirefoxDriver();
		
//		driver.get("http://tek-school.com/retail/index.php?route=product/product&path=18&product_id=45");
		
//		System.out.println(driver.findElement(By.xpath("//h2[normalize-space()='$2,000.00']")).getText());
		
//		driver.findElement(By.name("email")).sendKeys("dawood.hafizy.9");
//		driver.findElement(By.name("pass")).sendKeys("000000000");
//		driver.findElement(By.name("login")).click();
//		
//		 
//		String expTitle = "Dawood";
//		String actTitle = driver.getTitle();
//		if (expTitle.equals(actTitle))
//		{
//			System.out.println("test is passed");
//		}
//		else
//		{
//			System.out.println("test is failed");
//		}
//		
//		//driver.close();
		
		
		}

}
