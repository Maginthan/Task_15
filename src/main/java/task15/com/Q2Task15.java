package task15.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Set up the Chrome driver
		ChromeDriver driver = new ChromeDriver();

		// Load the URl
		driver.get("https://www.google.com/");

		// To maximize the browser
		driver.manage().window().maximize();

		// Locate the element
		driver.findElement(By.name("q")).sendKeys("Selenium Browser Driver", Keys.ENTER);

		// To close the browser
		// driver.close();
	}

}
