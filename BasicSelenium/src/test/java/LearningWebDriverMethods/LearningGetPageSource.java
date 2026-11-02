package LearningWebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetPageSource {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		//Fetching the source code of the web page
		System.out.println(driver.getPageSource());

	}

}
