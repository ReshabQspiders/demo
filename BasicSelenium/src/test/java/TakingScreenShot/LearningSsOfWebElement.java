package TakingScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LearningSsOfWebElement {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rangerover.com/en-in/range-rover/index.html");
		Thread.sleep(4000);
		
		WebElement logo = driver.findElement(By.cssSelector("[data-testid='logo']"));
		File temp = logo.getScreenshotAs(OutputType.FILE);
		File perm=new File("./ReportData/WebElement.png");
		FileHandler.copy(temp, perm);

	}

}
