package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPasswordCancel {
	
	//Create a global driver
	WebDriver driver;
	
	//Locate the element
	@FindBy(linkText = "Cancel") WebElement Forgotlink;
	@FindBy(xpath = "//*[contains(text(),'Please enter your email ')]") WebElement ForgotPageText;
	
	//Create the constructor using the name of the class
	public ForgetPasswordCancel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver , this);


		}
	//Method to click on the action required
	public void cancel() {
		//Click action
		Forgotlink.click();
		
	
	}
	//Method to get the text in the filed
	public String GetPageText() {
	//Syntax to get a text of any element.
	String ForgotPasswordCancel  = ForgotPageText.getText();
	return ForgotPasswordCancel;

	}
}
	

