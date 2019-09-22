package roughWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Try1 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser Successfully launched");

		String url = "https://www.spicejet.com/";
		driver.get(url);
		System.out.println("URL detected");
		
		//Thread.sleep(5000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@value='AMD'])[1]")).click();
		System.out.println("Departure Selected");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
		System.out.println("Arrival Selected");
		
	}

}
