package demoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		 JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Launch the application		
	       // driver.get("http://demo.guru99.com/test/guru99home/");
	        driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
	        
	        WebElement Element = driver.findElement(By.linkText("VBScript"));

	        //This will scroll the web page till end.		
	       // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			
	        js.executeScript("arguments[0].scrollIntoView();", Element);

		
		
		
		
		
		
		
		
		

		
		


	}

}
