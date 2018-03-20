package parllelTesting;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scroll {
	  WebDriver driver;
	   String projectLocation = System.getProperty("user.dir");
		@Test
	  public void f() {
			System.setProperty("webdriver.chrome.driver", projectLocation+"\\Chromedriver\\chromedriver.exe");
	        driver = new ChromeDriver();

	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Launch the application		
	        driver.get("http://demo.guru99.com/test/guru99home/");

	        //This will scroll the web page till end.		
	        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			
			
			
	  }
	  
  }

