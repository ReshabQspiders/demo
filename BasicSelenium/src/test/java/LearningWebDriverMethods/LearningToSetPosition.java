package LearningWebDriverMethods;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningToSetPosition {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		//Setting the position of the browser window on the screen
		//Approach 1
		Point offset = new Point(30, 50);
		driver.manage().window().setPosition(offset);
		//Approach 2
		Thread.sleep(2000);
		driver.manage().window().setPosition(new Point(0, 0));

	}

}
