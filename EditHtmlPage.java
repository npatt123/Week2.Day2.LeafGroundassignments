package week2.Day2;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditHtmlPage {
	
	public static void main(String[] args) {
		
		String isFieldDisabled = "disabled";
			
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		
		WebElement field1 = driver.findElement(By.xpath("//input[@id = 'email']"));
		field1.sendKeys("nalini.pattabiram@gmail.com");

		
		WebElement field2 = driver.findElement(By.xpath("//input[@value = 'Append ']"));
		String field2Value = field2.getAttribute("value");
		field2.sendKeys("Hello World");
		field2.sendKeys(Keys.TAB);
		field2.sendKeys(Keys.ENTER);
				
				
		WebElement field3= driver.findElement(By.xpath("//input[@name = 'username']"));
		String field3Value = field3.getAttribute("value");
		System.out.println(field3Value);
		
		WebElement field4 = driver.findElement(By.xpath("(//input[@name ='username'])[2]"));
		field4.clear();
		
		driver.manage().timeouts().getImplicitWaitTimeout();
		
		WebElement field5 = driver.findElement(By.xpath("//input[@disabled = 'true']"));
		boolean check = field5.isEnabled();
		
		 
		if(check != true) {
			
			System.out.println("The text field is disabled");
		}
		
		
	}

}
