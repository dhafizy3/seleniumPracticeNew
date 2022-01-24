package day20;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		//String winID = driver.getWindowHandle();
		//System.out.println(winID);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> winIDs = driver.getWindowHandles();
		
		//Approach1
		List<String> winIDList = new ArrayList(winIDs);
		System.out.println(winIDList.get(0));
		System.out.println(winIDList.get(1));
		Thread.sleep(3000);
		
		driver.switchTo().window(winIDList.get(0));
		System.out.println("Parent Window  :" +driver.getTitle());
		Thread.sleep(3000);
		driver.switchTo().window(winIDList.get(1));
		System.out.println("Childd Window  :" +driver.getTitle());
		
		
		//Approach2
		/*for(String winID:winIDs)
		{
			//System.out.println(winID);
			System.out.println(driver.switchTo().window(winID).getTitle());
		}*/
		
		//Close specific browser window
		for(String winID:winIDs)
		{
		String title = driver.switchTo().window(winID).getTitle();
			
			if(title.equals("OrangeHRM"))
				driver.close();
			
		}
		
		

	}

}
