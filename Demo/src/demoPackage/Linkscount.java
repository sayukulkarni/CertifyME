package demoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://certifyme.in/");
		//driver.get("https://www.facebook.com/");
		
		
		//"a" is used for anchore tag
		java.util.List<WebElement> Links=driver.findElements(By.tagName("a"));
		System.out.println("total num of links are"+Links.size());
		for(int i=1;i<=Links.size();i=i+1)
		{
			System.out.println(Links.get(i).getText());
			
			
		}
		
		
		
		
		
		

		
		


	}

}
