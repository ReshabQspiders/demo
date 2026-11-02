package LearningToHandleMultipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HandlingNoninspectableAutosuggestions {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("-disable--notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[data-reactid='1039']")).sendKeys("hoodies");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[.='Hoodies']")).click();
		Actions act=new Actions(driver);
		List<WebElement> products = driver.findElements(By.cssSelector("li[class='product-base']"));
		List<WebElement> allWishlist = driver.findElements(By.xpath("//span[.='wishlist']"));
		
		for (WebElement webElement : products) {
			act.moveToElement(webElement).perform();
			Thread.sleep(1000);
			
			for (WebElement webElement2 : allWishlist) {
				webElement2.click();
				driver.navigate().back();
				Thread.sleep(1000);
				//driver.switchTo().alert().dismiss();
				break;
				
				
			}
		}

	}

}
