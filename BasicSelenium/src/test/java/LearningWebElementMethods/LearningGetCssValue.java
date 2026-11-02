package LearningWebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetCssValue {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		WebElement link = driver.findElement(By.id("navbarDropdown"));
		System.out.println(link.getCssValue("background-color"));
		

	}

}
