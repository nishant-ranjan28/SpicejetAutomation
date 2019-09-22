package TestRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import TestCases.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

import Utilities.*;

public class EndToEnd {
	
	static WebDriver driver=null;
	
	public static void main(String[] args) throws InterruptedException {
		browserURL();
		DepartureArrival();
		
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

}
