package day23;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;



public class DownloadPDF {

	public static void main(String[] args) {


		String location = System.getProperty("user.dir")+"\\Downloads";;
		//Chrome

		/*HashMap preferences=new HashMap();
		preferences.put("download.default_directory", location);
		preferences.put("plugins.always_open_pdf_externally", true);
		
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);*/
		
		//Firefox
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf"); //mime type
		profile.setPreference("browser.download.folderList", 2); //0-desktop 1-downloads 2-desired location
		profile.setPreference("browser.download.dir", location);
		profile.setPreference("pdfjs.disabled", true);


		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile);
		
		

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dawoo\\Desktop\\SDET\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-pdf-download/");
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
		
		
	
	}

}
