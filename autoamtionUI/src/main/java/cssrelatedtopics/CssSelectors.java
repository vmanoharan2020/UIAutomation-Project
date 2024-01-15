package cssrelatedtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectors {
	
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", ".\\driver\\chromedriver.exe");
		
FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://demoqa.com/text-box");
		
		driver.findElement(By.cssSelector("#userName")).sendKeys("Veeramanikandan");
		
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("vmanoharan2020@yahoo.co.in");
		
		
	}

}
