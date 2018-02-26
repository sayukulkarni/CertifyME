package com.testng.ex;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class NewTest1 {
	public WebDriver driver;
  @Test
  public void test1() {
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
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
	  driver=new  ChromeDriver();

		driver.manage().window().maximize();
		//driver.get("http://certifyme.in/");
		driver.get("https://www.facebook.com/");

  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
	  
  }

}
