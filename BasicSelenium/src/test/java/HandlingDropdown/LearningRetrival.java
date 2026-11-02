package HandlingDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LearningRetrival {
	
	@Test
	public void Retrival() throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		WebElement skills = driver.findElement(By.id("Skills"));
		Select sel=new Select(skills);
		//Fetching Options From the Dropdown
		List<WebElement> options = sel.getOptions();
		for (WebElement opt : options) {
			System.out.println(opt.getText());
			
		}
		System.out.println("The located UI is multi-select: "+sel.isMultiple());

		Thread.sleep(2000);
		driver.navigate().to("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(4000);
		WebElement listbox = driver.findElement(By.id("select-multiple-native"));
		Select sell=new Select(listbox);
		sell.selectByIndex(2);//casual cotton
		sell.selectByIndex(1);//casual premium
		sell.selectByIndex(3);//casual slim
		System.out.println("----------------------------------------------");

		System.out.println(sell.getFirstSelectedOption().getText());
		List<WebElement> selectedOptions = sell.getAllSelectedOptions();
		System.out.println("----------------------------------------------");
		for (WebElement webElement : selectedOptions) {
			System.out.println(webElement.getText());
			
		}
		System.out.println("The located UI is multi-select: "+sell.isMultiple());


	}

}
