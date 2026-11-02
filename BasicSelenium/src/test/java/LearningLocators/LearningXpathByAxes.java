package LearningLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningXpathByAxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//Click on add to cart for pink iPhone 13
		driver.findElement(By.xpath("//a[.='Build your own cheap computer']/parent::h2/following-sibling::div[@class='add-info']/child::div[@class='buttons']/child::input")).click();

	}

	}


