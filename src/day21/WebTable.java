package day21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		
		//Finding number of rows and columns
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='data-list']/tbody/tr"));
		
		System.out.println("# of Rows:" +rows.size());
		
		List<WebElement> column = driver.findElements(By.xpath("//table[@class='data-list']//th"));
		System.out.println("# of Column:" +column.size());
		
		
		//How to retrive data form a specific row and column
		String java = driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[1]")).getText();
		//System.out.println(java);
		
		//Retrive all data form table
		
		/*for(int r=1; r<=rows;r++)
		{
			for( int c=1; c<=column; c++)
			{
				java = driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print(java);
			}
			System.out.println();
		}*/
		
		for(int r=1; r<= rows.size(); r++)
		{
			String lang = driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr["+r+"]/td[1]")).getText();
			if(lang.equals("Java"))
			{
				String version = driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr["+r+"]/td[2]")).getText();
				String releaseDate = driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr["+r+"]/td[3]")).getText();
				System.out.println(lang+"       "+version+"      "+releaseDate);
			}
		}
		
	}

}
