package LearningLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningId {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		//Locating Search text field and writing Selenium on it
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		//Navigate to Wikipedia
		driver.navigate().to("https://www.wikipedia.org/");
		Thread.sleep(2000);
		//locating the web element
		driver.findElement(By.id("searchInput")).sendKeys("Selenium");
		

	}

}
