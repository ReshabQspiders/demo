package LearningWebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetMethod {

	public static void main(String[] args) throws InterruptedException {
		//Launching the empty browser
		WebDriver driver=new ChromeDriver();
		//Navigate to DemoWebShop
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//Navigating to google
		driver.get("https://www.google.com/");

	}

}
