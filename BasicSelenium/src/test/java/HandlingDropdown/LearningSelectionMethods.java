package HandlingDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LearningSelectionMethods {
	
	@Test
	public void Selection() throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		//Locating the DropDown
		WebElement skillsDropDown = driver.findElement(By.id("Skills"));
		//Creating the Object of Select class
		Select sel=new Select(skillsDropDown);
		//Calling select class methods
		//using indexing
		sel.selectByIndex(10);
		Thread.sleep(2000);
		//using value
		sel.selectByValue("CSS");
		Thread.sleep(2000);
		//Using VisibleText
		sel.selectByVisibleText("HTML");
		Thread.sleep(2000);
		//Using Contains Visible text
		sel.selectByContainsVisibleText("Open");
		System.out.println("The located UI is multi-select: "+sel.isMultiple());


	}

}
