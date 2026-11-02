package LearningLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningXpathByContains {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/checkbox?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Domain' and @value='false' and @id='domain_b']")).click();
		
	}

}
