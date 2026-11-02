package HandlingKeybodardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningToHandleDropDown {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");

		Thread.sleep(2000);
		WebElement countryCode = driver.findElement(By.id("country_code"));
		countryCode.click();
		Thread.sleep(2000);
		//using keys class
		countryCode.sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER);
		//Using robot class	
		driver.findElement(By.id("select3")).click();
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);




}
}
