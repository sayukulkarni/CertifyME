package demoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
//import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Buttonpresence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://certifyme.in/");
		//driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=SvSUWuPRB7GcX8aihrgD");
		
	boolean  button=driver.findElement(By.xpath("//html/body/div[2]/form/div/input")).isDisplayed();
	
		//boolean button=driver.findElement(By.name("search")).isDisplayed();
		
		boolean allcourse=driver.findElement(By.id("bs-example-navbar-collapse-1")).isDisplayed();
		
		System.out.println(button);
		
			if(allcourse == true)
		{
			System.out.println("allcourse is present");
		
		}
		
	}

}
