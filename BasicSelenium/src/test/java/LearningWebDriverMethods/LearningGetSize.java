package LearningWebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetSize {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//Printing the Dimension of the browser
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		//Fetching width 
		System.out.println(size.getWidth());
		System.out.println(size.width);
		//Fetching Height
		System.out.println(size.getHeight());
		System.out.println(size.height);

	}

}
