package LearningWebDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningToSwitchWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("YouTube")).click();
		driver.findElement(By.linkText("Google+")).click();
		//Fetch the Session id of the Parent Window
		String parentId = driver.getWindowHandle();
		//Fetch the Session id of all tool opened window
		Set<String> allSesIds= driver.getWindowHandles();
		Thread.sleep(2000);

		for (String sessionid : allSesIds) {
			driver.switchTo().window(sessionid);
			if (driver.getCurrentUrl().contains("https://workspaceupdates.googleblog.com/2023/04/new-community-features-for-google-chat-and-an-update-currents%20.html")) {
				Thread.sleep(2000);

				System.out.println( driver.getTitle());
				driver.close();
				
			}
			
		}
		
		
		

	}

}
