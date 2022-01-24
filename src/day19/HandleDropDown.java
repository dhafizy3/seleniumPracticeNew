package day19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver drv= new ChromeDriver();
		drv.manage().window().maximize();
		
		drv.get("https://www.opencart.com/index.php?route=account/register");
		
		//drv.findElement(By.xpath("//select[@id='input-country']"));
		
		WebElement dropCountryEl = drv.findElement(By.xpath("//select[@id='input-country']"));
		Select dropCountry = new Select(dropCountryEl);
		
		//1) Selecting options from dropdown
//		dropCountry.selectByValue("1");
//		Thread.sleep(3000);
//		dropCountry.selectByVisibleText("Pakistan");
//		Thread.sleep(3000);
//
		dropCountry.selectByIndex(0);
//		
		//Finding number of options
		List<WebElement> options = dropCountry.getOptions();
		System.out.println(options.size());
		
		//Capture all the options and print them
		/*for(WebElement op:options)
		{
			System.out.println(op.getText());
		}*/
		
		/*for(int i=0; i<options.size(); i++)
		{
		System.out.println(options.get(i).getText());	
		}*/
		
//		for(WebElement op:options)
//		{
//			if(op.getText().equals("Afghanistan"))
//			{
//				op.click();
//				break;
//			}
//		}
//		
		
		
		
		
		
		
		
		

	}

}
