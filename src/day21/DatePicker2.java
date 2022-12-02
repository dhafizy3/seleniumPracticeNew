package day21;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		DateFormat dateFormat = new SimpleDateFormat("d");
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, 2);
		String newDate = dateFormat.format(cal.getTime());
		System.out.println(newDate);

		driver.get("https://www.plushcare.com/booking/primary-care/appointments/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='date-picker-input']")).click();

		// Date Selection
		List<WebElement> allDates = driver.findElements(By.xpath("//div[@aria-disabled='false']"));

		for (WebElement date : allDates) {
			String dt = date.getText();
			if (dt.equals(newDate)) {
				date.click();
				break;
			}
		}

	}

}
