package LearningWebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningIsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(10000);
		WebElement iphone = driver.findElement(By.xpath("//span[.='APPLE iPhone 11']"));
		System.out.println(iphone.isDisplayed());
		System.out.println(driver.findElement(By.id("loginBtn")).isDisplayed());
	}

}
