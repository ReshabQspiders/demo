package launchingBrowser;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Practice {

	public static void main(String[] args) throws IOException, InterruptedException {
		//First line of code
		//LAunching the empty browser
		String browser= "edge";
		WebDriver driver= null;
		
		if (browser.contains("chrome")) {
			driver= new ChromeDriver();
			}
		else if (browser.contains("edge")) {
			driver=new EdgeDriver();
			
		}
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm= new File("./ss/web2.png");
		FileHandler.copy(temp, perm);
			
		
		
	}

}
