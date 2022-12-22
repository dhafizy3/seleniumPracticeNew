package day19;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BoostrapDrpDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	
		WebDriver drv= new ChromeDriver(options);
		drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		drv.manage().window().maximize();
		
		drv.get("https://www.hdfcbank.com/");


		
		
		drv.findElement(By.xpath("//a[normalize-space() = 'Select Product Type']")).click();
		
		List <WebElement> type = drv.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
		System.out.println(type.size());
		
	
		//Select option
		for(WebElement t:type)
		{
			System.out.println(t.getText());
		}
		
		for(WebElement t:type)
		{
			if(t.getText().equalsIgnoreCase("loans"))
			{
			t.click();
			break;
			}
		}
		
	}
		public void testingTheMerge() {
		System.out.println("test");
	}

}
