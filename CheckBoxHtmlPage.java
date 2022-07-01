package week2.Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxHtmlPage {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		driver.manage().timeouts().getImplicitWaitTimeout();

        //Select the languages that you know?

		WebElement option1 = driver.findElement(By.xpath("//input[@type = 'checkbox'][2]"));
		option1.click();
		
		
		//Confirm Selenium is checked
		
		WebElement option2 = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input"));
		option2.isSelected();
		if(option2.isSelected() == true) {
			
			System.out.println("Already Selected");
		}else {
			System.out.println("Not Seelcted");
			
		}
		
		//DeSelect only checked
		List<WebElement> option3 = driver.findElements(By.xpath("//label[text()='DeSelect only checked']/following::input"));
		
		
		for(WebElement eachValue : option3) {
			if(eachValue.isSelected()){
				eachValue.click();
				System.out.println("CheckBox Deselected");
				
			}			
			}				
		//Select all below checkboxes
		List<WebElement> option4 = driver.findElements(By.xpath("//label[text()='Select all below checkboxes ']/following::input"));
		for(WebElement eachValue : option4) {
			if(!eachValue.isSelected()){
				eachValue.click();
				System.out.println("CheckBox selected");
			}
	}
		
		driver.close();
	}	
	

}
