package demoPackage;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Buttonpresence {
	private static final String FileUtils = null;
	static String projectlocation = System.getProperty("user.dir");
	 public static WebDriver driver;
	 
	 
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver",projectlocation+"//Chromedriver//chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://www.google.com");
		  try{
	            //the below statement will throw an exception as the element is not found, Catch block will get executed and takes the screenshot.
			  driver.findElement(By.name("hq")).sendKeys("tesyt");
	             
	               
		  }
		  catch (Exception e){
			  System.out.println("I'm in exception");
	//calls the method to take the screenshot.
			  getscreenshot();
	 	  }
	  }
	  
	  public static void getscreenshot() throws Exception 
	  {
	          File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       //The below method will save the screen shot in d drive with name "screenshot.png"
	          Files.copy(scrFile, new File("D:\\screenshot.png"));
	  }
	}
        
		
		