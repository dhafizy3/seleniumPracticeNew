package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPerformance {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		
		dr.get("http://automationpractice.com/index.php?");
		dr.manage().window().maximize();
		
		dr.findElement(By.id("search_query_top")).sendKeys("T-shirts");
		dr.findElement(By.name("submit_search")).submit();
		dr.findElement(By.linkText("Printed Chiffon Dress")).click();
		

	}

}
