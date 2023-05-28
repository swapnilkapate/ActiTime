package package_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailAccount {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup(); // for Chrome browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("identifierId")).sendKeys("swapweb2018");
		Thread.sleep(3000);
		
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);
		
		String at = driver.getTitle();
		
		String et = "gmail";
		
		System.out.println(at);
		
		driver.close();
		
		if (at.equalsIgnoreCase(et))
		{
			System.out.println("Test Successful");
		}
		else
		{
			System.out.println("Test Failure");
		}
		
	}

}
