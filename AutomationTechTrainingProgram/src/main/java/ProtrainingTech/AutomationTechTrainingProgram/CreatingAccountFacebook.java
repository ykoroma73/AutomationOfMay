package ProtrainingTech.AutomationTechTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class CreatingAccountFacebook {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\eclipse-workspace\\AutomationTechTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement creatanaccount = driver.findElement(By.linkText("Create new account"));
		creatanaccount.click();
		Thread.sleep(6000);
		WebElement month = driver.findElement(By.id("month"));
		//class and Constructor
		Select ob = new Select(month);
		
		//Select by value
		ob.selectByValue("1");
		//Select by visible text
		WebElement dateof = driver.findElement(By.name("birthday_day"));
		Select it = new Select(dateof);
		it.selectByVisibleText("6");
		
		//Select by index
		
		WebElement Year = driver.findElement(By.name("birthday_year"));
		Select years = new Select(Year);
		years.selectByIndex(6);
		
	
	}

}
