package LearningWebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetCurrentURL {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//Navigating to amazon
		driver.get("https://www.amazon.com/");
		//Printing the Current Url of the Web Page
		System.out.println(driver.getCurrentUrl());

	}

}
