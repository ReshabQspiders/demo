package LearningToHandleMultipleElements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningInspectableAutosuggestions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("APjFqb")).sendKeys("Sel");
		Thread.sleep(2000);
		List<WebElement> autoSugg = driver.findElements(By.cssSelector("[class='lnnVSe']"));
		for (WebElement sugg : autoSugg) {
			System.out.println(sugg.getText());
			
		}
		for (WebElement sugg : autoSugg) {
			if (sugg.getText().contains("selenium")) {
				sugg.click();
				break;
				
			}
			
		}

	}

}
