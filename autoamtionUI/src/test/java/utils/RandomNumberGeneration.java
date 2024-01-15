package utils;

import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class RandomNumberGeneration {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		int randomNumber = (int)(Math.random()*99999+99999);
		
		System.out.println(randomNumber);
		
		String chord = Keys.chord(Keys.CONTROL,Keys.ALT,Keys.DELETE);
		
		Actions action = new Actions(driver);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@type='search']"));
		
		action.contextClick().build().perform();
		
		action.doubleClick().perform();
		
	}

}
