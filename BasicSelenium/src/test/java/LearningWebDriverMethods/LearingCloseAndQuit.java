package LearningWebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearingCloseAndQuit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//Navigating to DemoWebShop
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//locating Facebook link and clicking on it
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(2000);
		//Closing the browser
		//driver.quit();
		


	}

}
