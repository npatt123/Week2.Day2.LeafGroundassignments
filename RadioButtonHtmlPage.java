package week2.Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonHtmlPage {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://www.leafground.com/pages/radio.html");
	
	//Are you enjoying the classes?
	WebElement button1 = driver.findElement(By.id("no"));	
	button1.click();
	
	//Find default selected radio button
	List<WebElement> list = driver.findElements(By.xpath("//input[@name='news']"));
	
	
	for(WebElement eachValue : list) {
		boolean isSelect = eachValue.isSelected();		
		
		if(isSelect == true) {
			
			System.out.println("Radio Button is Selected");
		}
		else {
			System.out.println("Radio Button is NOT Selected");
		}
		
	} 
	
	//Select your age group (Only if choice wasn't selected)
	List<WebElement> agelist = driver.findElements(By.xpath("//input[@class = 'myradio' and @name = 'age']"));
	
	for(WebElement eachValue:agelist ) {
		
		boolean isSelect = eachValue.isSelected();
		
		if(isSelect != true) {
			eachValue.click();
		}
		else {
			
			System.out.println("Button already clicked");
			
		}
		
		
	}
		driver.close();
	
}
}
