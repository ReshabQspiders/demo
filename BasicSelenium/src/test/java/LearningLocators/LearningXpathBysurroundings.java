package LearningLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningXpathBysurroundings {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/duplicate?sublist=0&scenario=1");
		Thread.sleep(2000);
		//Click on add to cart for pink iPhone 13
		driver.findElement(By.xpath("//img[@alt='duplicateProduct11']/../..//input[@value='Add to Cart']")).click();

	}

}
