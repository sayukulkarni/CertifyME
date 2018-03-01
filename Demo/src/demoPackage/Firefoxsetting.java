package demoPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxsetting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.marionette.driver", "C:\\Program Files\\Java\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	//	FirefoxOptions option = new FirefoxOptions();
	//    Options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		
		
		// ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://certifyme.in/");
	

	}

}
