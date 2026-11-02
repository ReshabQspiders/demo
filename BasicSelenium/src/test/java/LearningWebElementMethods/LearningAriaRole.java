package LearningWebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningAriaRole {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("[placeholder='First Name']")).getAriaRole());
		System.out.println(driver.findElement(By.cssSelector("[placeholder='First Name']")).getAccessibleName());
		System.out.println(driver.findElement(By.cssSelector("[ng-model='Adress']")).getAccessibleName());


	}

}
