package cssrelatedtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ColorOfWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver", ".\\driver\\chromedriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://demoqa.com/buttons");
		
		WebElement clickMe = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		String cssValue = clickMe.getCssValue("color");
		
		System.out.println(cssValue);
		
		System.out.println(clickMe.getCssValue("background-color"));
		
		System.out.println(clickMe.getCssValue("border-color"));
		
		if(clickMe.getCssValue("color").equals(clickMe.getCssValue("background-color")))
			System.out.println("same color");
		else
			System.out.println("different color");
		
	}

}
