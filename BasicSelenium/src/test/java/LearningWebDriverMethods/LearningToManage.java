package LearningWebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningToManage {

	public static void main(String[] args) throws InterruptedException {
		//Launching the browser
		WebDriver driver=new ChromeDriver();
		//Maximizing the browser window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Minimizing the browser window
		driver.manage().window().minimize();
		Thread.sleep(2000);
		//Setting the browser window to fullscreen.
		driver.manage().window().fullscreen();
		

	}

}
