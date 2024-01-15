package interviewprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	
	public static FirefoxDriver driver;
	
	public static void login(String userName, String password) throws InterruptedException {

		driver.findElement(By.id("user-name")).sendKeys(userName);
		
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.id("login-button")).click();
		
		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		
		
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		Thread.sleep(3000);

	}

	public static void main(String[] args) throws InterruptedException {
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.saucedemo.com");
		
		
		/*1. Navigate to www.saucedemo.com
		2. Count the total number of username displayed on the screen and print the count and the usernames
		3. Validate the login for 1st two username from the list i.e. “standard_user” and “locked_out_user”
	
	
	*/
		WebElement elements = driver.findElement(By.xpath("//div[@id='login_credentials']"));
		
		//System.out.println(elements.getText());
		
		String text = elements.getText();
		
		String[] list = text.split("\n");
		
		/*
		 * for (String string : list) {
		 * 
		 * System.out.println(string);
		 * 
		 * }
		 */
		
		int count = list.length-1;
		
		for (int i = 1; i < list.length; i++) {
			
			System.out.println(list[i]);
		}
			
		System.out.println("count of the user names :"+count);
		
		for (int i = 1; i < 2; i++) {
			
			login(list[i], "secret_sauce");
		}
		
		
		
	}	 
		

		
}
