package testprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDemo {
	
	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement allElement = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Select sdd = new Select(allElement);
		
		List<WebElement> options = sdd.getOptions();
		
		WebElement firstSelectedOption = sdd.getFirstSelectedOption();
		
		System.out.println("First Selected Option :"+firstSelectedOption.getText());
		
		for(WebElement wb : options)
		{
			String text = wb.getText();
			
			char[] ch = text.toCharArray();
			
			if(text.startsWith("A"))
			{
				System.out.println(text);
			}
			
//			if(ch[0]==('A'))
//			{
//			System.out.println(text);
//			}
		}
	}
	

}
