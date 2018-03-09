package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Incognito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// DesiredCapabilities cap=DesiredCapabilities.chrome();
		//System.setProperty("webdriver.gecko.driver","D:\\Testing\\geckodriver\\geckodriver.exe");

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver chromedriver=new ChromeDriver(capabilities);
		chromedriver.get("https://www.google.com");
		 
		

	}

}
