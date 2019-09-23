package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public static WebElement DepartureArrival(WebDriver driver) {

		WebElement element = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction"));
		return element;
	}

	public static WebElement SearchFlight(WebDriver driver) {

		WebElement element = driver.findElement(By.xpath("//input[@name='ctl00$mainContent$btn_FindFlights']"));
		return element;
	}

	public static WebElement ContinueToCustomer(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//div[@id='continue-to-contact-page']"));
		return element;
	}
	
	public static WebElement Title(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//select[@id='CONTROLGROUPPASSENGER_ContactInputPassengerView_DropDownListTitle']"));
		return element;
	}

}