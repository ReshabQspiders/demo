package LearningWebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LearningGetLocation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		Rectangle searchTextField = driver.findElement(By.id("APjFqb")).getRect();
		//Fetching the Rectangle(Dimension + Location)
		//Location
		System.out.println(searchTextField.getPoint());
		//Dimension
		System.out.println(searchTextField.getDimension());
		//height
		System.out.println(searchTextField.getHeight());
		System.out.println(searchTextField.height);
		//width
		System.out.println(searchTextField.getWidth());
		System.out.println(searchTextField.width);
		//x
		System.out.println(searchTextField.getX());
		System.out.println(searchTextField.x);
		//y
		System.out.println(searchTextField.getY());
		System.out.println(searchTextField.y);






		
		
		
	}

}
