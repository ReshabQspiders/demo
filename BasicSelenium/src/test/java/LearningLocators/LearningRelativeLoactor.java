package LearningLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class LearningRelativeLoactor {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//Locating the Locatable WE
		//Excellent Radio button
	
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(driver.findElement(By.id("pollanswers-1")))).click();

	}

}
