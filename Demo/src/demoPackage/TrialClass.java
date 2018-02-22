package demoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TrialClass {

	public static void main(String[] args) {
		System.out.println("Test print");

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");

		// System.setProperty("webdriver.gecko.driver","C:\\Program
		// Files\\Java\\geckodriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		//driver.get("http://certifyme.in/");
		driver.get("https://www.facebook.com/");

		// String baseUrl=("https://www.facebook.com/;");
		// driver.get(baseUrl);

		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("sayalikulkarni400@gmail.com");

		WebElement inputtext = driver.findElement(By.name("pass"));
		inputtext.sendKeys("sayali24");

		// WebElement Login=driver.findElement(By.id("loginbutton"));
		// Login.click();

		WebElement inputtext_58mg_5dba_2ph = driver.findElement(By.id("u_0_l"));
		inputtext_58mg_5dba_2ph.sendKeys("sayali");

		WebElement lastname = driver.findElement(By.id("u_0_n"));
		lastname.sendKeys("kulkarni");

		// WebElement MobileNumber=driver.findElement(By.id("u_0_q"));
		// MobileNumber.sendKeys("9822262488");

		WebElement emailaddress = driver.findElement(By.id("u_0_q"));
		emailaddress.sendKeys("sayu24@gmail.com");

		WebElement Reenteremailaddress = driver.findElement(By.id("u_0_t"));
		Reenteremailaddress.sendKeys("sayu24@gmail.com");

		WebElement Newpassword = driver.findElement(By.id("u_0_x"));
		Newpassword.sendKeys("sayu24");

		Select Birthday = new Select(driver.findElement(By.id("day")));

		Birthday.selectByVisibleText("13");

		// Select month= new Select(driver.findElement(By.id("month")));

		// month.selectByVisibleText("Nov");

		// Select month= new Select(driver.findElement(By.id("month")));
		// month.selectByIndex(11);

		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByValue("11");

		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1994");

		WebElement radioBtn = driver.findElement(By.id("u_0_b"));

		radioBtn.click();

		WebElement createaccount = driver.findElement(By.id("u_0_13"));
		createaccount.click();

	}
}