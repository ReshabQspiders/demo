package LearningWebDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningNavaigationMethods {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		//Navigate to Youtube using to("String url")
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(2000);
		//Navigating to Spotify using to(Url url)
		driver.navigate().to(new URL("https://open.spotify.com/"));
		//Navigating back Youtube
		Thread.sleep(2000);
		driver.navigate().back();
		//Navigating forward to Spotify
		Thread.sleep(2000);
		driver.navigate().forward();
		//Refreshing Spotify page
		Thread.sleep(2000);
		driver.navigate().refresh();

		

	
		

	}

}
