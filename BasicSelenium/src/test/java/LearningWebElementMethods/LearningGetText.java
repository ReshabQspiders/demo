package LearningWebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		//Name
		driver.findElement(By.id("name")).sendKeys("Reshab");
		//Email
		driver.findElement(By.id("email")).sendKeys("resh@gmail.com");
		
		//Password
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("pass@123");
		pass.submit();
		System.out.println(pass.getTagName());
		Thread.sleep(2000);
		//Login Web Element
		WebElement ele = driver.findElement(By.xpath("//h1[.='Login']"));
		System.out.println(ele.getText());
		//Verification
		if (ele.getText().equals("Login")) {
			System.out.println("----Test Execution : Pass -----");
			
		} else {
			System.out.println("----Test Execution : Fail -----");


		}
		

	}

}
