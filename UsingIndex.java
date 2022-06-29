package week2.Day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingIndex {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		driver.manage().timeouts().getImplicitWaitTimeout();
		
		
		WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
		Select dd1 = new Select(dropDown1);
		dd1.selectByIndex(3);		
	
		WebElement dropDown2 =driver.findElement(By.xpath("//select[@name = 'dropdown2']"));
		dropDown2.sendKeys("Selenium");
		
		WebElement dropDown3=driver.findElement(By.xpath("//select[@name = 'dropdown3']"));
		dropDown3.sendKeys("Appium");

		
		WebElement dropDown4 =driver.findElement(By.xpath("//select[@class = 'dropdown']"));
		dropDown4.sendKeys("UFT/QTP");
		
		WebElement dropDown6 =driver.findElement(By.xpath("(//div[@class='example'])[6]/select"));
		Select value = new Select(dropDown6);
		value.selectByValue("3");
		value.selectByVisibleText("Selenium");
		
		
		List<WebElement> dD4 =  driver.findElements(By.xpath("//select[@class='dropdown']/option"));
		System.out.println(dD4.size() + ": is the size of the dropdown");
		
		
		
		for (WebElement eachElement : dD4) {
            String dropDownOption = eachElement.getText();
            System.out.println(dropDownOption + " is the text of the dropdown");

		
		
		}
	}

}
