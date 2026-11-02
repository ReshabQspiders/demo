package HandlingDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LearningDeslection {
	
	@Test
	public void Deselection() throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(4000);
		WebElement listBox = driver.findElement(By.id("select-multiple-native"));
		Select sel=new Select(listBox);
		//Selecting
		sel.selectByIndex(0);
		sel.selectByIndex(1);
		sel.selectByIndex(2);
		sel.selectByIndex(3);
		Thread.sleep(2000);
		System.out.println("The located UI is multi-select: "+sel.isMultiple());
		//De-selecting
		sel.deselectByIndex(0);
		Thread.sleep(2000);
		sel.deselectByValue("Mens Casual Premium Slim Fit T-Shirts ");
		Thread.sleep(2000);
		sel.deselectByVisibleText("Mens Cotton Jacket...");
		Thread.sleep(2000);
		sel.deSelectByContainsVisibleText("Mens Casual Slim Fit...");
		Thread.sleep(2000);
		//Selecting
				sel.selectByIndex(0);
				sel.selectByIndex(1);
				sel.selectByIndex(2);
				sel.selectByIndex(3);
				Thread.sleep(2000);
				//Deselect all
		sel.deselectAll();
		




	}

}
