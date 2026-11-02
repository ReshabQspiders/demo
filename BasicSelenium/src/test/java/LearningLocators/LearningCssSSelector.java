package LearningLocators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningCssSSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		//Locating the web element
		driver.findElement(By.cssSelector("[ng-model='FirstName']")).sendKeys("Reshab");
		driver.findElement(By.cssSelector("[placeholder='Last Name']")).sendKeys("Patel");
		Thread.sleep(2000);
	

	}

}
