package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver drv= new ChromeDriver();
		
		drv.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		drv.manage().window().maximize();
		
		WebElement searchStore = drv.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		//isDisplayed isEnabled
		
		System.out.println("Display status:" +searchStore.isDisplayed());
		Thread.sleep(3000);

		System.out.println("Display status:" +searchStore.isEnabled());
		
		//isSelected ---for radio buttons and check boxes
		WebElement male = drv.findElement(By.xpath("//input[@id='gender-male']"));
		Thread.sleep(3000);

		WebElement female = drv.findElement(By.xpath("//input[@id='gender-female']"));
		
		male.click();
		//female.click();
		
		System.out.println("Display Status:" + male.isSelected());
		Thread.sleep(3000);
		System.out.println("Display Status:" + female.isSelected());
		
		//drv.close();
		
		

	}

}
