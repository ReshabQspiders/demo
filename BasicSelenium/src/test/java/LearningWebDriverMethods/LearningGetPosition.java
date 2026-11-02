package LearningWebDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetPosition {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//Fetch the position of the default launched browser
		Point posi = driver.manage().window().getPosition();
		System.out.println(posi);
		//Fetching the x offset
		System.out.println(posi.getX());
		System.out.println(posi.x);
		//fetching y offset
		System.out.println(posi.getY());
		System.out.println(posi.y);

	}

}
