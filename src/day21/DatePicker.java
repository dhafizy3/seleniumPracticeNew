package day21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		String year= "1994";
		String month= "December";
		String day = "1";
		
		driver.switchTo().frame(0);
		
		//Direct Approach
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("07/10/2021");
		
		//Using Datepicker
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		while(true)
		{
			String mon= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yr= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(mon.equals(month) && yr.equals(year))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[normalize-space() = 'Prev']")).click();
			}
			
		}
		
		//Date Selection
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement date:allDates)
		{
			String dt=date.getText();
			if(dt.equals(day))
			{
				date.click();
				break;
			}
		}
		
		

	}

}
