package HandlingKeybodardActions;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningKeysCopyPaste {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		WebElement fn=driver.findElement(By.cssSelector("[placeholder='First Name']"));
		WebElement email = driver.findElement(By.cssSelector("[type='email']"));
		fn.sendKeys("Reshab",Keys.TAB,"Patel");
		Thread.sleep(2000);
		fn.sendKeys(Keys.CONTROL+"a");
		fn.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(2000);

		email.sendKeys(Keys.CONTROL+"v",Keys.RIGHT);
		email.sendKeys("@gmail.com");
		email.sendKeys(Keys.TAB,"1234567890",Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER,Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.ENTER);
		
		
		
		
	}

}
