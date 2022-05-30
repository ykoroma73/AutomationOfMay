package ProtrainingTech.AutomationTechTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PointerMouseControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\eclipse-workspace\\AutomationTechTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		Actions ob = new Actions(driver);
		WebElement Signin = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		ob.moveToElement(Signin).build().perform();
		WebElement PrimeMwmeber = driver.findElement(By.linkText("Prime Membership"));
		ob.moveToElement(PrimeMwmeber).click().build().perform();
		
		
		
		
	}

	
}
