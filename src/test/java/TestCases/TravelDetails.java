package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelDetails {

	public static WebElement Title(WebDriver driver) {

		WebElement element = driver.findElement(By.xpath("//select[@id='CONTROLGROUPPASSENGER_ContactInputPassengerView_DropDownListTitle']"));
		return element;
	}
	
}
