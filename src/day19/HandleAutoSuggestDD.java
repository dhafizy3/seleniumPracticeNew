package day19;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAutoSuggestDD {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver drv= new ChromeDriver();
		drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		
		drv.get("https://www.google.com/");
		drv.manage().window().maximize();
		drv.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(5000);
		
		List<WebElement> ele = drv.findElements(By.xpath("//li[@role='presentation']"));
		System.out.println(ele.size());
		
		
		for(WebElement el:ele)
		{
			if (el.getText().equals("selenium rich foods"))
					{
				el.click();
				break;
					}
		}
		
	}

}
