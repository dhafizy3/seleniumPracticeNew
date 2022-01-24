package day23;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFirefox {

	public static void main(String[] args) {


		String location = System.getProperty("user.dir")+"\\Downloads";;
		//Chrome
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Firefox
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/msword"); //mime type
		profile.setPreference("browser.download.folderList", 2); //0-desktop 1-downloads 2-desired location
		profile.setPreference("browser.download.dir", location);


		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile);
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dawoo\\Desktop\\SDET\\geckodriver-v0.29.1-win64");
		WebDriver driver=new FirefoxDriver(options);
		
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-pdf-download/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
		
		
	
	}

}
