package day23;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadChrome {

	public static void main(String[] args) {

	//Chrome
		//String location ="C:\\Users\\dawoo\\eclipse-workspace\\Selenium\\Downloads";
		String location = System.getProperty("user.dir")+"\\Downloads";
		
		HashMap preferences=new HashMap();
		preferences.put("download.default_directory", location);
		
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);
		
		
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dawoo\\Desktop\\SDET\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
		
		
	
	}

}
