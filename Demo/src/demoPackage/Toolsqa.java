package demoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Toolsqa {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");

		// System.setProperty("webdriver.gecko.driver","C:\\Program
		// Files\\Java\\geckodriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		WebElement partiallinktest= driver.findElement(By.partialLinkText("Partial Link Test"));
		partiallinktest.click();
		
		System.out.println("partial link test pass");
		//driver.navigate().back();
		
		WebElement linktest= driver.findElement(By.linkText("Link Test"));
		linktest.click();
		
		System.out.println("link test pass");
		
		WebElement firstname= driver.findElement(By.name("firstname"));
		firstname.sendKeys("sayii");
		
		WebElement lastname= driver.findElement(By.name("lastname"));
		lastname.sendKeys("kulkarni");
		
		WebElement radioBtn= driver.findElement(By.id("sex-1"));
		radioBtn.click();
		
		WebElement radiobtn= driver.findElement(By.id("exp-0"));
		radiobtn.click();
		

		WebElement Date= driver.findElement(By.id("datepicker"));
		Date.sendKeys("13/2/2018");
		
		WebElement check1= driver.findElement(By.id("profession-1"));
		check1.click();
		
		WebElement check2= driver.findElement(By.id("tool-2"));
		check2.click();
		
		Select continents = new Select(driver.findElement(By.id("continents")));
		continents.selectByVisibleText("asia");

		
		
		
		
		
		
		
		
		
		
		
		
		


		
		
		

	}

}
