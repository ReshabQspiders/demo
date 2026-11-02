package LearningLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		//Enter the first name
		driver.findElement(By.name("username")).sendKeys("Admin");
		//Enter The Password
		driver.findElement(By.name("password")).sendKeys("admin123");
		//Click on login button
		driver.findElement(By.cssSelector("[type='submit']")).click();

	}

}
