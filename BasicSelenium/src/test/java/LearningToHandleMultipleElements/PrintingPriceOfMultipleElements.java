package LearningToHandleMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingPriceOfMultipleElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Books");
		driver.findElement(By.cssSelector("button[title='Search for Products, Brands and More']")).click();
		Thread.sleep(4000);
		List<WebElement> allPrice = driver.findElements(By.cssSelector("[class='hZ3P6w']"));
		for (WebElement price : allPrice) {
			
			System.out.println(price.getText());
			
		}
	}

}
