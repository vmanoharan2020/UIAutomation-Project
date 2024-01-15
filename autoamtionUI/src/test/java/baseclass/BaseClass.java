package baseclass;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();

		// option.addArguments("headless");

		ChromeDriver driver = new ChromeDriver(option);

		driver.get("https://www.irctc.co.in/nget/train-search");

		driver.manage().window().maximize();

		try {
			driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();

		} catch (Exception ElementNotInteractableException) {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

			wait.until(
					ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()=' FLIGHTS ']"))));

			driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		}

		// System.out.println(driver.getTitle());

		// String flights = driver.getWindowHandle();

		Set<String> windowHandles = driver.getWindowHandles();

		Iterator<String> it = windowHandles.iterator();

		while (it.hasNext()) {
			String next = it.next();

			driver.switchTo().window(next);

			System.out.println(driver.getTitle());
			System.out.println(next);
		}

	}

}
