package LearningLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningTagName {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		//Locating all the links in the webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for (WebElement link : links) {
			System.out.println(link.getText());
			
		}
		driver.quit();
		
		
		
	}

}
