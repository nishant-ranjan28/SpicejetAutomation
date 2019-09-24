package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactDetails {

	public static WebElement FirstName(WebDriver driver) {

		WebElement element = driver.findElement(By.xpath("//input[@id='CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxFirstName']"));
		return element;
	}
	
	
	public static WebElement LastName(WebDriver driver) {

		WebElement element = driver.findElement(By.xpath("//input[@id='CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxLastName']"));
		return element;
	}
	
	public static WebElement PhoneNumber(WebDriver driver) {

		WebElement element = driver.findElement(By.xpath("//input[@id='CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxHomePhone']"));
		return element;
	}
	
	public static WebElement Email(WebDriver driver) {

		WebElement element = driver.findElement(By.xpath("//input[@id='CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxEmailAddress']"));
		return element;
	}
}
