package week2.Day2;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageHtmlPage {
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Image.html");
		driver.manage().timeouts().getImplicitWaitTimeout();
		
		//Click on this image to go home page
		
		WebElement image1 = driver.findElement(By.xpath("(//div[@class ='large-6 small-12 columns']/img)[1]"));
		image1.click();
		String title1 = driver.getTitle();
		String title2 ="TestLeaf - Selenium Playground";
		if(title1.equals(title2)) {
			System.out.println(title1 + "landed on the expected page");
		}
		else {
			System.out.println(title1 + "landed on UNexpected page");
		}
		driver.navigate().back();
		
		
		
		//Am I Broken Image?
		WebElement image2 = driver.findElement(By.xpath("(//div[@class ='large-6 small-12 columns']/img)[2]"));
		image2.click();
		String attribute = image2.getAttribute("naturalWidth");
			
		
		if(attribute.equals("0")) {
			System.out.println("Image broken");
		}
		else {
			System.out.println("Image not broken");
		}
		
		
		//Click me using Keyboard or Mouse
		
		WebElement image3 = driver.findElement(By.xpath("(//div[@class ='large-6 small-12 columns']/img)[3]"));
		image3.click();
		String imTitle1 = driver.getTitle();
		driver.navigate().back();
		System.out.println(imTitle1);
		
		
		//Action class yet to be taken. So ignoring this for now
		/*WebElement image4 = driver.findElement(By.xpath("(//div[@class ='large-6 small-12 columns']/img)[3]"));
		image4.sendKeys(Keys.ENTER);
		String imTitle2 = driver.getTitle();
		
		if(imTitle1.equals(imTitle2)) {
			System.out.println(imTitle2 + "landed on the expected page");
		}
		else {
			System.out.println(imTitle2 + "landed on UNexpected page");
		}
		driver.navigate().back();*/
		
		
				
		
		
				
				
	}

}
