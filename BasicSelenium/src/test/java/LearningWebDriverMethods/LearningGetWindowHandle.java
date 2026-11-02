package LearningWebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//Fetching the session id of the driver controlled page
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		

	}

}
