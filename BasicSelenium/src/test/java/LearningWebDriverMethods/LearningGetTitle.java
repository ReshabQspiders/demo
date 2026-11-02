package LearningWebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetTitle {

	public static void main(String[] args) throws InterruptedException {
		//Launching the browser
		WebDriver driver=new ChromeDriver();
		//Navigating to a webpage
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		//Printing the title of the web page
		System.out.println(driver.getTitle());

	}

}
