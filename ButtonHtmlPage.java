package week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonHtmlPage {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		driver.manage().timeouts().getImplicitWaitTimeout();
		
		WebElement field1 = driver.findElement(By.xpath("//button[text() = 'Go to Home Page']"));
		field1.click();
		
		driver.navigate().back();
		
		WebElement field2 = driver.findElement(By.xpath("//button[@id = 'position']"));
		Point location = field2.getLocation();
		System.out.println(location);
		
		
		WebElement field3 = driver.findElement(By.id("color"));
		String cssValue = field3.getCssValue("background-color");
		System.out.println(cssValue);
		
		WebElement field4 = driver.findElement(By.id("size"));
		Dimension field4value = field4.getSize();
		System.out.println(field4value);		


	}

}
