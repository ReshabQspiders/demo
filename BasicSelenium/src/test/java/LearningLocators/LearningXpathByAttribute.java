package LearningLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningXpathByAttribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/login1.0?sublist=0&scenario=1");
		Thread.sleep(2000);
		//Locate Username
		driver.findElement(By.xpath("//input[@placeholder='Username:']")).sendKeys("Vishnu");
		//Locate Password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Vishnu@345");
		//Locate Checkbox
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

	}

}
