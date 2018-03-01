package com.testng.ex;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Linkcounttest {
	public WebDriver driver;
	
  @Test
  public void test1() {
	  
	  java.util.List<WebElement> Links=driver.findElements(By.tagName("a"));
		System.out.println("total num of links are"+Links.size());
		for(int i=1;i<=Links.size();i=i+1)
		{
			System.out.println(Links.get(i).getText());
			
			
		}
		
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
	  driver=new  ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://certifyme.in/");
		//driver.get("https://www.facebook.com/");

	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
	  
  }

}
