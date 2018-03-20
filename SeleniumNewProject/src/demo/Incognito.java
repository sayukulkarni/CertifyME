package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;

public class Incognito {
	
	
	

	public static void main(String[] args) throws InterruptedException,NoAlertPresentException{
		// TODO Auto-generated method stub
		
		// DesiredCapabilities cap=DesiredCapabilities.chrome();
		//System.setProperty("webdriver.gecko.driver","C:\\program Files\\Java\\geckodriver\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver.exe");

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--incognito");
		//DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		//capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		//WebDriver chromedriver=new ChromeDriver(capabilities);
		//chromedriver.get("https://www.google.com");
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");			
		
	      	
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("1012");				
        driver.findElement(By.name("submit")).submit();			
        		
        // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
        // Accepting alert		
        alert.accept();		
		
		
		
		 
		

	}
}
