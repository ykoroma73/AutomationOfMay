package ProtrainingTech.AutomationTechTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\eclipse-workspace\\AutomationTechTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement simpleAlert=driver.findElement(By.name("alert"));
		simpleAlert.clear();
		driver.switchTo().alert().accept();
		WebElement confirmation=driver.findElement(By.name("confirmation"));
		confirmation.clear();
		Thread.sleep(600);
		driver.switchTo().alert().accept();
		Thread.sleep(6000);
		confirmation.clear();
		Thread.sleep(6000);
		driver.switchTo().alert().dismiss();
		
		
		
		
	}

}
