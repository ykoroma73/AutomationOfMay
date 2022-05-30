package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

//Create web locator
public class Home {
	
	//Global driver
	
	WebDriver driver;
	
	//Locate the element
	@FindBy(name = "email") WebElement ids;
	@FindBy(name = "pass") WebElement paswd;
	@FindBy(linkText = "Forgot password?") WebElement Forgot;

//Create a page constructor
public Home(WebDriver driver) {
	this.driver = driver;
	
	//Create a page factory provided by selenium
	PageFactory.initElements(driver , this);

	//Create separate methods for each elements
	}
	public void Email() {
		//Call the email that you want to use on sendKeys
	ids.sendKeys("YusKor13@");
	
	}
	public void Pssword() {
	paswd.sendKeys("ObaiKor13@");


}
	public void ForgotToPssword() {
	Forgot.click();
	}
}
