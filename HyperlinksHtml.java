package week2.Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperlinksHtml {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Link.html");
		
		driver.manage().timeouts().getImplicitWaitTimeout();
		
		//Gettitle of the page
		WebElement link1 = driver.findElement(By.xpath("(//a[text() = 'Go to Home Page'])[1]"));
		String hyperlink1 = link1.getAttribute("href");
		link1.click();
		String title = driver.getTitle();
		String OriginalTitle ="TestLeaf - Selenium Playground";
		
		if(title.equals(OriginalTitle)) {
			System.out.println("The tile "+ OriginalTitle + "verified");
		}
		else {
			System.out.println("The tile "+ OriginalTitle + "incorrect");
		}
		driver.navigate().back();
		
		
		//Find where am supposed to go without clicking me?
		WebElement link2 = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
		String newLink = link2.getAttribute("href");
		System.out.println(newLink);
		
		
		//verify broken link
		
		WebElement link3 = driver.findElement(By.linkText("Verify am I broken?"));
		String brokenLink = link3.getAttribute("href");
		link3.click();
		System.out.println(brokenLink);
		
		
		if(brokenLink.contains("error")) {
			System.out.println("Link is broken");
		}
		else {
			System.out.println("Link working fine");
		}
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		
		
		
		//Go to Home Page(Interact with same link name)
		
		WebElement link4 = driver.findElement(By.xpath("(//a[text() = 'Go to Home Page'])[2]"));
		String hyperlink2 = link4.getAttribute("href");
		link4.click();
		
		
		
		if(hyperlink2.equals(hyperlink1)) {
			
			
			System.out.println("Both link are the same");
		}else {
			System.out.println("Both link are NOT the same");
		}
		driver.navigate().back();	
		
		
		
		//How many links are available in this page?
		
		List<WebElement> noOfLinks = driver.findElements(By.tagName("a"));
		int size = noOfLinks.size();	
		
		System.out.println("No of urls: " + size);
		
		for(WebElement eachElement : noOfLinks) {
			
			String url = eachElement.getText();
			System.out.println(url);
		}
			
	}

}
