import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class SelIntroduction {

	public static void main(String[] args) {
		//Invoking Browser
		//Chrome  - ChromeDriver - > This class has all methods to automate in Chrome browser
		//FireFox - FirefoxDriver - > This class has all methods to automate in Chrome browser
		//Safari - SafariDriver - > This class has all methods to automate in Chrome browser
		
		//Create object of ChromeDriver Class
		//Driver is ChromeDriver.exe
		//WebDriver driver = new ChromeDriver(); // here ChromeDriver class is Implementing the webdriver interface
		
		//launch in FF
		// Driver is gecko.driver
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Swaroop\\Downloads\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver(); 
		
		//launch in Edge
		WebDriver driver = new EdgeDriver(); 
		
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println("URL =: " + driver.getCurrentUrl());
		System.out.println("TITLE: " + driver.getTitle());
		//driver.close(); // closed current tab 
		driver.quit(); // Closes all the tabs opened by automation
		
		driver.getPageSource()
		
	}

}
