package ProtrainingTech.AutomationTechTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyCalenderFlight {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\eclipse-workspace\\AutomationTechTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.expedia.com/");
		driver.manage().window().maximize();
		WebElement selection= driver.findElement(By.id("d1-btn"));
		selection.clear();
		Thread.sleep(6000);
		WebElement departure=driver.findElement(By.xpath("//*[@aria-label='May 11, 2022']"));
		departure.click();
		Thread.sleep(6000);
		WebElement Return= driver.findElement(By.xpath("//*[@aria-label='Jun 26, 2022']"));
		Return.clear();
		Thread.sleep(6000);
		
		
	}

}
