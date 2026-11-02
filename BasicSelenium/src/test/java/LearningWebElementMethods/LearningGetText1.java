package LearningWebElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetText1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		
		List<WebElement> ele = driver.findElements(By.cssSelector("[class='poppins text-[15px]']"));
		
		for (WebElement modules : ele) {
			Thread.sleep(500);
			
			System.out.println(modules.getTagName());

			if (modules.getText().contains("Sync")) {
				modules.click();
				
				
				
			}
			
			
			
			
		}
		
			
		}
	}


