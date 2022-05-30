package ProtrainingTech.AutomationTechTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\eclipse-workspace\\AutomationTechTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/");
		driver.manage().window().maximize();
		WebElement dropablelinked = driver.findElement(By.linkText("Droppable"));
		dropablelinked.clear();
		driver.switchTo().frame(0);
		WebElement dragable = driver.findElement(By.id("draggable"));
		WebElement dropable = driver.findElement(By.id("droppable"));
		Actions ob = new Actions(driver);
		ob.dragAndDrop(dragable, dropable).build().perform();
		driver.switchTo().parentFrame();
		WebElement sortslinked = driver.findElement(By.linkText("Sortable"));
		sortslinked.clear();
		
		
		
		
	}

}
