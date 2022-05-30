package ProtrainingTech.AutomationTechTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ChromeDriverSetup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//How to luanch chrome driver
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\eclipse-workspace\\AutomationTechTrainingProgram\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.facebook.com");
	driver.manage().window().maximize();
	//driver.navigate().back();
	//Thread.sleep(6000);
	/*driver.navigate().forward();
	String windowhandleids = driver.getWindowHandle();
	System.out.println(windowhandleids);*/
	
	//USING NAME TO LOCATE ELEMENT
	//WebElement Searchfield = driver.findElement(By.name("field-keywords"));
	//Thread.sleep(6000);
	
	//USING ID TO LOCATE ELEMENT
	//WebElement SearchButton = driver.findElement(By.id("nav-//search-submit-button"));
	//SearchButton.click();
	
	//USING LINKTEXT TO LOCATE ELEMENT
	// deallink = driver.findElement(By.linkText("Today's Deals"));
	//.click();
	
	//driver.close();
	
	//USING TAG NMAE TO LOACTE ELEMENT USING ABSOLUTE
	
	//WebElement Searchit = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/input"));
	//Searchit.click();
	
	
	//USING RELATIVE XPATH
	WebElement searchit = driver.findElement(By.xpath("//input[@aria-label='Search']"));
	searchit.sendKeys("Computer");
	WebElement searchicon= driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/input"));
	searchicon.click();
	WebElement linkid = driver.findElement(By.xpath("//a[text()='//a[text()='Books']"));
	linkid.click();
	
	}
	
	

}
