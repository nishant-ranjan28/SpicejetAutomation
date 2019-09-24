package TestRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestCases.HomePage;
import TestCases.ContactDetails;
import io.github.bonigarcia.wdm.WebDriverManager;

import Utilities.*;

public class EndToEnd {
	
	static WebDriver driver=null;
	
	public static void main(String[] args) throws InterruptedException {
		browserURL();
		DepartureArrival();
		DateOfJourney();
		Search();
		continueToBook();
		AddCustomers();
		
	}
	
	public static void browserURL() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser Successfully launched");

		String url = "https://www.spicejet.com/";
		driver.get(url);
		System.out.println("URL detected");

		//PageScreenshot.TakeFullScreenshot(driver);
	}
	
	public static void DepartureArrival() throws InterruptedException{
		//Click Departure Drop down
		HomePage.DepartureArrival(driver).click();
		
		//Select Departure City
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@value='AMD'])[1]")).click();
		System.out.println("Departure Selected");
		
		//Select Arrival City
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
		System.out.println("Arrival Selected");
	}
	
	public static void DateOfJourney() throws InterruptedException{
		
		//Select Depart Date
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath
				("//table[@class='ui-datepicker-calendar']//tr//a[contains(@class,'ui-state-default') and contains(.,'31')]"))).click();
		System.out.println("Date of journey selected");
	}
	
	public static void Search() throws InterruptedException{
		Thread.sleep(5000);
		HomePage.SearchFlight(driver).click();
		System.out.println("search flight button clicked");
	}
	
	public static void continueToBook() throws InterruptedException{
		Thread.sleep(5000);
		HomePage.ContinueToCustomer(driver).click();
		System.out.println("continue to add customer details");
	}
	
	public static void AddCustomers() throws InterruptedException{
		Thread.sleep(5000);
		ContactDetails.FirstName(driver).click();
		ContactDetails.FirstName(driver).click();
		ContactDetails.FirstName(driver).sendKeys("Nishant");
		System.out.println("First name added");
		
		Thread.sleep(5000);
		ContactDetails.LastName(driver).click();
		ContactDetails.LastName(driver).click();
		ContactDetails.LastName(driver).sendKeys("Ranjan");
		System.out.println("Last name added");
		
		Thread.sleep(5000);
		ContactDetails.PhoneNumber(driver).click();
		ContactDetails.PhoneNumber(driver).click();
		ContactDetails.PhoneNumber(driver).sendKeys("1234567890");
		System.out.println("Phone Number added");
		
		Thread.sleep(5000);
		ContactDetails.Email(driver).click();
		ContactDetails.Email(driver).click();
		ContactDetails.Email(driver).sendKeys("a@a.com");
		System.out.println("Email address added");
	}
}
