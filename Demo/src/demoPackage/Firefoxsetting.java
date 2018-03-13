package demoPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxsetting {

	static int browser = 1;

	static WebDriver driver;

	static String projectLocation = System.getProperty("user.dir");

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		switch (browser) {

		case 1:
			System.out.println("Code is executed in Chrome Browser");
			System.out.println(projectLocation);

			System.setProperty("Webdriver.chrome.driver",projectLocation + "\\Chromedriver\\chromedriver.exe");

			driver = new ChromeDriver();

			break;

		case 2:

			System.out.println("Code is executed in mozila");
			System.out.println(projectLocation);

			System.setProperty("Webdriver.gecko.driver",projectLocation + "\\Geckodriver\\geckodriver.exe");

			driver = new FirefoxDriver();

			break;

		}

		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Program Files\\Java\\geckodriver.exe");
		 * 
		 * // FirefoxOptions option = new FirefoxOptions(); //
		 * Options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		 * WebDriver driver = new FirefoxDriver(option);
		 * 
		 * 
		 * // ChromeDriver driver = new ChromeDriver();
		 */

		driver.manage().window().maximize();

		driver.get("http://certifyme.in/");

	}

}
