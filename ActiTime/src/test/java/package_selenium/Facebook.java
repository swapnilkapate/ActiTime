package package_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup(); // for Chrome browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		System.out.println("Titl : "+driver.getTitle());
		System.out.println("CurrentURL : "+driver.getCurrentUrl());
//		System.out.println("Page Source : "+driver.getPageSource());
//		System.out.println("Id of window"+driver.getWindowHandle());
		
		boolean logo = driver.findElement(By.xpath("//img[@class=\'fb_logo _8ilh img\']")).isDisplayed();
		if (logo==true) {
			System.out.println("logo is available");
		}
		else {
			System.out.println("logo is not available");
		}
		
		// to register on facebook
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println("Titl : "+driver.getTitle());
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("John");
		driver.findElement(By.name("lastname")).sendKeys("Alex");
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		driver.findElement(By.name("reg_passwd__")).sendKeys("987654@Vk");
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		
		WebElement w = driver.findElement(By.id("day"));
		Select s = new Select(w);
		s.selectByIndex(11);
		
		WebElement u = driver.findElement(By.id("month"));
		Select t = new Select(u);
		t.selectByValue("7");
		
		WebElement v = driver.findElement(By.id("year"));
		Select r = new Select(v);
		r.selectByVisibleText("1999");
		
		Thread.sleep(3000);
		driver.findElement(By.name("websubmit")).click();
		
		
		
//		List<WebElement> o = s.getOptions();
//		for (WebElement x:o) {
//			System.out.println(x.getAttribute("Value"));
//		}
//		
//		for (WebElement x:o) {
//			System.out.println(x.getText());
//		}
				
		// to forget password
//		driver.findElement(By.linkText("Forgotten password?")).click();
//		driver.findElement(By.xpath("//input[@class='inputtext _9o1w']")).sendKeys(Keys.SHIFT,"vicku@gmil.com");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@name='did_submit']")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		driver.navigate().back();
		
		//for size and location and css property like font, color of webelement on login page
//		WebElement un = driver.findElement(By.id("email"));
//		Dimension s = un.getSize();
//		int h = s.getHeight();
//		int w = s.getWidth();
//		System.out.println("Height: "+h);
//		System.out.println("Width: "+w);
//		
//		Point p = un.getLocation();
//		int x = p.getX();
//		int y = p.getY();
//		System.out.println("x-axis: "+x+" Y-axis: "+y);
//		
//		System.out.println("font size: "+un.getCssValue("font-size"));
//		System.out.println("color: "+un.getCssValue("color"));
				
		Thread.sleep(5000);
		
		driver.manage().deleteAllCookies();
						
		driver.close();
		
		
	}

}
