package day18;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class HandlingCheckBoxes {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver drv= new ChromeDriver();
		drv.manage().window().maximize();
		
		drv.get("https://itera-qa.azurewebsites.net/home/automation");
		
		
		//1) one check box
		drv.findElement(By.xpath("//input[@id='monday']"));
		
		
		//2) multiple checkbox
		List<WebElement> checkboxes= drv.findElements(By.xpath("//input[contains(@id, 'day')]"));
		System.out.println(checkboxes.size());
		
		//using normal for loop to select all checkboxes
		for(int i=0; i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		
		
		//using advance for loop to select all checkboxes
		/*for(WebElement ele:checkboxes)
		{
			ele.click();
		}*/
		
		/*for(WebElement ele:checkboxes)
		{
			ele.click();
		}*/
		
		//3) select multiple checkboxes by choice
		
		/*for (WebElement ele:checkboxes)
		{
			String value=ele.getAttribute("id");
			if (value.equals("monday") || value.equals( "sunday"))
			{
				ele.click();
			}
		}*/
		
		/*for (WebElement ele:checkboxes)
		{
			String value=ele.getAttribute("id");
		System.out.println(value);	
		}*/
//		
//		for(int i=5; i<checkboxes.size();i++)
//		{
//			checkboxes.get(i).click();
//		}
//		
		
		
		

	}

}
