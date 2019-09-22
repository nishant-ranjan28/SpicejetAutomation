package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public static WebElement DepartureArrival(WebDriver driver) {
		
		WebElement element = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction"));
		return element;
	}
	
public static WebElement DOJ(WebDriver driver) {
		
		WebElement element = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']"));
		return element;
	}
	
}