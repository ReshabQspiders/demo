package LearningWebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningActionsMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		//First Name
		driver.findElement(By.cssSelector("[placeholder='First Name']")).sendKeys("Reshab");
		WebElement lastName = driver.findElement(By.cssSelector("[ng-model='LastName']"));
		lastName.sendKeys("Gowda");
		Thread.sleep(2000);
		lastName.clear();
		lastName.sendKeys("Patel");
		Thread.sleep(2000);
		WebElement radio = driver.findElement(By.cssSelector("[value='Male']"));
		radio.sendKeys("b");
		
		

	}

}
