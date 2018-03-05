package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "C:\\Java\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");

		//FirefoxProfile profile=new FirefoxProfile();
		//profile.setAcceptUntrustedCertificates(true);
		//WebDriver driver = new FirefoxDriver();
	//	WebDriver driver = new ChromeDriver();
		
		
		 // Create object of DesiredCapabilities class
		DesiredCapabilities cap=DesiredCapabilities.chrome();

		// Set ACCEPT_SSL_CERTS  variable to true
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);


		// Open browser with capability
		WebDriver driver=new ChromeDriver(cap);
		driver.get("http://velvet-rose.net");

	}

}
