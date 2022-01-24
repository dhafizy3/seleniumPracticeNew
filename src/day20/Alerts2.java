package day20;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		//System.out.println(myAlert.getText());
//		
//		myAlert.sendKeys("Good");
//		
//		myAlert.accept();  //  close alert by Ok
//		
		//myAlert.dismiss(); //close alert by Cancel
		
		
		

	}

}
