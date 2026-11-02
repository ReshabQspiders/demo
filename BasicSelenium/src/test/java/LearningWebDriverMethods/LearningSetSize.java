package LearningWebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningSetSize {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		//Set the Dimension of my browser window
		//Approach 1
		Dimension dim = new Dimension(500, 400);
		driver.manage().window().setSize(dim);
		//Approach 2
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(1500, 800));

	}

}
