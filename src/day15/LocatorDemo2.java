package day15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		dr.get("http://tek-school.com/retail/index.php?route=product/product&path=18&product_id=45");
//		dr.findElement(By.xpath("//h2[normalize-space()='$2,000.00']"));
		
//		dr.get("http://automationpractice.com/index.php?");
//		dr.manage().window().maximize();
//		
//		
//		List<WebElement> sliders = dr.findElements(By.className("homeslider-container"));
//		System.out.println(sliders.size());
//		
//		List<WebElement> links= dr.findElements(By.tagName("a"));
//		System.out.println(links.size()) ;

	}

}
