package parllelTesting;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


public class NewTest {
	public WebDriver driver;
    String projectLocation = System.getProperty("user.dir");
    @Parameters("myBrowser")
    @BeforeClass
    public void launchbrowser(String myBrowser)
    {
  	  if(myBrowser.equalsIgnoreCase("firefox")){
  		  System.setProperty("webdriver.gecko.driver",projectLocation+"\\Geckodriver\\geckodriver.exe");
  		  driver = new FirefoxDriver();
  	  }
  	  else
  	  {
  		  System.setProperty("webdriver.chrome.driver",projectLocation+"\\Chromedriver\\chromedriver.exe");
  		  driver = new ChromeDriver();
  	  }
    }
	
	
  @Test
  public void f() {
	  
	  driver.get("https://www.facebook.com");
	  boolean email =  driver.findElement(By.xpath("//*[@id='email']")).isDisplayed();
	  System.out.println(email);
	   
  }
}
