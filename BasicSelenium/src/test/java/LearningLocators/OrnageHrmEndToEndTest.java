package LearningLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrnageHrmEndToEndTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Login page
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		//Dashboard
		driver.findElement(By.xpath("//a[@data-v-6475d26d and @href='/web/index.php/time/viewTimeModule']")).click();
		WebElement textfield = driver.findElement(By.cssSelector("[placeholder='Type for hints...']"));
		textfield.sendKeys("test");
		Thread.sleep(2000);
		textfield.sendKeys(Keys.DOWN,Keys.ENTER);
		driver.findElement(By.cssSelector("[type='submit']")).click();
		//logout
		driver.findElement(By.cssSelector("[class='oxd-userdropdown']")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
		

	}

}
