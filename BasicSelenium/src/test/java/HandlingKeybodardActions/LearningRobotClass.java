package HandlingKeybodardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningRobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/?msockid=084337bc35c266ec3605224134a0676d");
		Thread.sleep(2000);
		driver.findElement(By.id("gh-ac")).sendKeys("Coins");
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

	}

}
