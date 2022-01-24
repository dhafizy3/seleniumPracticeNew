package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionVsActions {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement minSlider = driver.findElement(By.xpath("//span[@style = 'left: 0%;']"));
		WebElement maxSlider =driver.findElement(By.xpath("//span[@style = 'left: 100%;']"));
		 
		System.out.println(minSlider.getLocation());
		System.out.println(maxSlider.getLocation());

		act.dragAndDropBy(minSlider, 100, 0).perform();
		act.dragAndDropBy(maxSlider, -100, 0).perform();
		

	//	(612, 250)
		
		
	
		
	}

}
