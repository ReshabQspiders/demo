package LearningWebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetSize {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.cssSelector("[type='submit']"));
		System.out.println(ele.getCssValue("height"));
		System.out.println(ele.getCssValue("width"));
		Dimension size = ele.getSize();
		System.out.println(size);
		System.out.println(size.getHeight());
		System.out.println(size.height);

		System.out.println(size.getWidth());
		System.out.println(size.width);


		

	}

}
