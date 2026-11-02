package LearningWebDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWindowSwitching {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//Capture the session id of the parent window
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
		//Click on YouTube link
		driver.findElement(By.linkText("YouTube")).click();
		//Caturing the Session id of all the window opened by the tool
		Set<String> allSesIds = driver.getWindowHandles();
		System.out.println(allSesIds);
		Thread.sleep(2000);
		//Removing the ParentWindow id from the Set of all Session ids
		allSesIds.remove(parentid);
		//Iterating to fetch individual session id of the window
		for (String sessId : allSesIds) {
			driver.switchTo().window(sessId);
			//Verifying if the captured id is for the child window
			driver.close();
			
				
			}
			
		}
		
		

	}


