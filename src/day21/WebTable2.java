package day21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		
		driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='User Management']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Users']")).click();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		System.out.println(rows.size());
		
//		int count=0;
//		for(int r=1; r<=rows; r++)
//		{
//			String status = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+r+"]/td[5]")).getText();
//			if (status.equals("Disabled"))
//			{
//				count++;
//			}
//		}
//		
//		System.out.println(count);
//		System.out.println(rows-count);
		
		
		
		
		
		
		
		
		
		
		
		

	}
		
}

