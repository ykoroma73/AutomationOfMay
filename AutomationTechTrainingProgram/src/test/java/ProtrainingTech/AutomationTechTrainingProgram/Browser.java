package ProtrainingTech.AutomationTechTrainingProgram;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.ForgetPasswordCancel;
import PageObjectModel.Home;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.layertree.model.PictureTile;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Browser {
	WebDriver driver;
  @Test(priority = 2)
  public void f() throws InterruptedException {
	  //Opens the driver and later delete after creating the various separate methods in the Home page
	  //call the object of the class
	 Home ob = new Home(driver);
	 ob.Email();
	 ob.Pssword();
	 Thread.sleep(6000);
	 ob.ForgotToPssword();
	 //Create the object of the Forgot Password Cancel
	 ForgetPasswordCancel ob2 = new ForgetPasswordCancel(driver);
	 Thread.sleep(6000);
	 ob2.cancel();
  }
  @Test(priority = 1)
  public void verificationOfText() throws InterruptedException, IOException {
	  //Create the object of the HOME CLASS by Call the home class and importing it
	  Home ob = new Home(driver);// To call the forgot password method
	  ForgetPasswordCancel ob2 = new ForgetPasswordCancel(driver);
	  Thread.sleep(6000);
	  //To click on the forgot password
	  ob.ForgotToPssword(); 
	  pictures();
	  Thread.sleep(6000);
	  String VerificationOfText= ob2.GetPageText();
	  pictures();
	  System.out.println(VerificationOfText);
	  pictures();
	  SoftAssert st = new SoftAssert();
	  st.assertEquals(VerificationOfText,"Please enter your email or mobile number to search for your account.");
	  //Assert.assertEquals(VerificationOfText,"Please enter your email or mobile number to search for your account.", "Text is displaying");
	  ob2.cancel();
	  st.assertAll();
	  //Take screen shot and the format or type 
	//Save the screen shot into variables use a class call file
	  //File WebShots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  //FileHandler.copy(WebShots, new File("C:\\Users\\Owner\\eclipse-workspace\\AutomationTechTrainingProgram\\Pictures\\PictureOfWeb.jpg"));
	  
  }
  @BeforeClass
  public void beforeClass() throws IOException {
	//Opening a chrome browser properties.
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\eclipse-workspace\\AutomationTechTrainingProgram\\Drivers\\chromedriver.exe");
	  //;
	//Constructor for opening chrome browser
	//driver = new ChromeDriver();
	
	  //Create an edge browser/page 
	  //System.setProperty("webdriver.edge.driver", "C:\\Users\\Owner\\eclipse-workspace\\AutomationTechTrainingProgram\\Drivers\\msedgedriver.exe");
	//driver = new EdgeDriver();
	 
	  //Create a Firefox browser/page
	  //System.setProperty("webdriver.gecko.driver", "C:\\Users\\Owner\\eclipse-workspace\\AutomationTechTrainingProgram\\Drivers\\geckodriver.exe");
	// driver = new FirefoxDriver();
	
	  //Call to open any browser
	  browsersToSetUp("chrome");
	  driver.navigate().to("https://www.facebook.com");
	driver.manage().window().maximize();
	pictures();
		
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  //Closing the driver
	  Thread.sleep(6000);
	  driver.quit();
  }
  //To set up browsers in a professionally way
  public void browsersToSetUp(String browsers) {
	  if(browsers.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\eclipse-workspace\\AutomationTechTrainingProgram\\Drivers\\chromedriver.exe");
		  driver = new ChromeDriver();
	  }else if(browsers.equalsIgnoreCase("Edge")) {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\Owner\\eclipse-workspace\\AutomationTechTrainingProgram\\Drivers\\msedgedriver.exe");
		  driver = new EdgeDriver();
	  }else if(browsers.equalsIgnoreCase("Firefox")) {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Owner\\eclipse-workspace\\AutomationTechTrainingProgram\\Drivers\\geckodriver.exe");
		  driver = new FirefoxDriver();
	  }
  }
  public void pictures() throws IOException {
	  //Code for taking multiple screen shots
	  File WebShots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(WebShots, new File("C:\\Users\\Owner\\eclipse-workspace\\AutomationTechTrainingProgram\\Pictures\\PictureOfWeb.jpg"));
  }
  

}
