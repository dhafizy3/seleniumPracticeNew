package day24;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dawoo\\Desktop\\SDET\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//How to capture cookies from browser?
		Set<Cookie>cookies =driver.manage().getCookies();
		
		System.out.println("Before" +cookies.size());
		//Thread.sleep(3000);
		
		//how to print cookies
		for(Cookie c:cookies) {
			System.out.println(c.getName()+ ":   "+c.getValue());
		}
		Thread.sleep(3000);
		
		//How to add cookies to browser
	
		Cookie coo = new Cookie("NEW", "546");
		driver.manage().addCookie(coo);
		cookies=driver.manage().getCookies();
		
		System.out.println("After" +cookies.size());

		//How to delete cookies
		driver.manage().deleteCookie(coo);
		cookies=driver.manage().getCookies();
		System.out.println("After" +cookies.size());
		
		//How to delete all cookies
		driver.manage().deleteAllCookies();
		cookies=driver.manage().getCookies();
		System.out.println("After" +cookies.size());

	}

}
