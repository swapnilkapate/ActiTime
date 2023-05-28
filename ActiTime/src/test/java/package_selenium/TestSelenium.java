package package_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSelenium {
	
	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");		
//		WebDriver driver = new ChromeDriver();
		
// By using WebDriverManager - first add WebDriverManager dependency in pom.xml
		WebDriverManager.chromedriver().setup(); // for Chrome browser
		WebDriver driver = new ChromeDriver();
		
//		WebDriverManager.firefoxdriver().setup(); // for Firefox browser
//		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("swapnil@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("1234567890");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		driver.close();
		
	}
	
}
