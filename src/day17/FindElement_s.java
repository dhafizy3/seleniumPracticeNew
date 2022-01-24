package day17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_s {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		
		WebDriver drv= new ChromeDriver();
		
		drv.get("https://demo.nopcommerce.com/");
		
		//findElement()
		
		//first scenario
		WebElement searchBox = drv.findElement(By.xpath("//input[@id='small-searchterms']"));
		searchBox.sendKeys("Apple iPhone");
		
		
		
		//second scenario
		WebElement links = drv.findElement(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(links.getText());
		
		//third scenario
		//WebElement button = drv.findElement(By.xpath("//button[normalize-space()='Search']//img"));
		
		//findElements()
		
		//1 Scenario
		List <WebElement> searchBoxs = (List) drv.findElements(By.xpath("//input[@id='small-searchterms']"));
		System.out.println(searchBoxs.size());
		
		//2 Scenario
		List<WebElement> elements = drv.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(elements.size());
		
		for(WebElement w:elements)
		{
			System.out.println(w.getText());
		}
		
		//3 Scenario
		List <WebElement> buttons = drv.findElements(By.xpath("//button[normalize-space()='Search']//img"));
		System.out.println(buttons.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
