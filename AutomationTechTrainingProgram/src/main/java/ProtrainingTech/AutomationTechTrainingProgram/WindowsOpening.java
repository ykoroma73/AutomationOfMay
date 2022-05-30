package ProtrainingTech.AutomationTechTrainingProgram;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsOpening {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\eclipse-workspace\\AutomationTechTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		Actions ob = new Actions(driver);
		WebElement newrelease= driver.findElement(By.linkText("New Releases"));
		ob.keyDown(Keys.SHIFT).build().perform();
		newrelease.clear();
		ob.keyUp(Keys.SHIFT).build().perform();
		driver.getWindowHandle();
		driver.getWindowHandles();
		Set<String> Windowhandles= driver.getWindowHandles();
		Iterator<String> interator = Windowhandles.iterator();
		String ParentWindow = interator.next();
		String secondWindow = interator.next();
		System.out.println("This is a Parent Window = + ParentWindow");
		System.out.println("This is the second window = + secondWindow");
		driver.switchTo().window(secondWindow);
		WebElement newWindowClick = driver.findElement(By.linkText("Camera & Photo Products"));
		Thread.sleep(6000);
		newWindowClick.clear();
		
	}

}
