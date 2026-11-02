package LearningLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningXpathByTextFunction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		//click on xpath UI
		driver.findElement(By.xpath("//section[text()='X Path']")).click();
		Thread.sleep(1000);
		//cick on login3.0
		driver.findElement(By.xpath("//section[.='Login 3.0']")).click();

	}

}
