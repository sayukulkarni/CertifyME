package demoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toolsqa {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");

		// System.setProperty("webdriver.gecko.driver","C:\\Program
		// Files\\Java\\geckodriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		WebElement partiallink test= driver.findElement(By.id("Partial Link Test"));
		

	}

}
