package day18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HadlingCheckBoxes2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dawoo\\Desktop\\SDET\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver drv= new ChromeDriver();
		drv.manage().window().maximize();
		
		drv.get("https://itera-qa.azurewebsites.net/home/automation");
		

	}

}
