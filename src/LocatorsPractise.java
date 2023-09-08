import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class LocatorsPractise {

	public static void main(String[] args) throws InterruptedException {
			
		//Create object of ChromeDriver Class
		//Driver is ChromeDriver.exe
		WebDriver driver = new ChromeDriver(); // here ChromeDriver class is Implementing the webdriver interface
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		
		driver.findElement(By.id("inputUsername")).sendKeys("Bhargavi");
		driver.findElement(By.name("inputPassword")).sendKeys("Bhargavi");		
		driver.findElement(By.className("signInBtn")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(		driver.findElement(By.cssSelector("p.error")).getText());
		
		//driver.close(); // closed current tab 
		//driver.quit(); // Closes all the tabs opened by automation
		
		
		/// below code is to click on forgot pwd
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Bhargavi");
		
	  //driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("BhargaviDharmapuri@testEmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("BhargaviDharmapuri@testEmail.com");
		
      //driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear(); // here we have used index
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("BhargaviDharmapuri@testEmail.com"); // here we have used index 
		
		//driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("1233334567");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("1233334567");
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // implicit wait - here we are waiting for object to load. not a hard wait
		Thread.sleep(1000); //Hard wait - not preferred
		
		//Capture temp password
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		//click on 'Go to login' button 
		driver.findElement(By.xpath("//div[contains(@class,'forgot-pwd-btn-conainer')]/button[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // implicit wait - here we are waiting for object to load. not a hard wait
		Thread.sleep(5000); //Hard wait - not preferred'
		
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Bhargavi");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");	
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
	}

}
