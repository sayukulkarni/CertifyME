package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	//	System.setProperty("webdriver.gecko.driver", "C:\\Java\\geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "C:\\Java\\IEDriverServer.exe");
	//	FirefoxOptions option = new FirefoxOptions();
	//	Options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	//	WebDriver driver = new FirefoxDriver();
		WebDriver driver = new InternetExplorerDriver();
		
	    
		
		
		// ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://certifyme.in/");
	}

}
