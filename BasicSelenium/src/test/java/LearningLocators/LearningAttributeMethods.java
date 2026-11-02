package LearningLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningAttributeMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.id("small-searchterms"));
		//Without any action
		System.out.println(search.getDomAttribute("placeholder"));//SearchStore
		System.out.println(search.getDomProperty("placeholder"));//SearchStore
		System.out.println(search.getAttribute("placeholder"));//SearchStore
		//After performing typing action
		search.sendKeys("Electronics");
		Thread.sleep(1000);
		System.out.println(search.getDomAttribute("placeholder"));//SearchStore
		System.out.println(search.getDomProperty("placeholder"));//Electronics
		System.out.println(search.getAttribute("placeholder"));//Electronics
		driver.quit();
		


		

	}

}
