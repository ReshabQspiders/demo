package LearningWebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningIsEnabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[.='ALLEN SOLLY']")).click();
		WebElement checkBtn = driver.findElement(By.id("Check"));
		System.out.println(checkBtn.isEnabled());
		
		WebElement ele = driver.findElement(By.id("Check Delivery"));
		
		ele.sendKeys("123456");
		
		Thread.sleep(5000);
		System.out.println(checkBtn.isEnabled());

		

	}

}
