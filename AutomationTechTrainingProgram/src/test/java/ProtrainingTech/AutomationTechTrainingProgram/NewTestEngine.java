package ProtrainingTech.AutomationTechTrainingProgram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestEngine {
  @Test
  public void f() {
	  System.out.println("This is test annotation");
  }
  @BeforeMethod//4
  public void beforeMethod() {
	  System.out.println("This is before mether annotation");
  }

  @AfterMethod//5
  public void afterMethod() {
	  System.out.println("This is after method trst annotaion");
  }

  @BeforeClass//3
  public void beforeClass() {
	  System.out.println("This is before class annotatoon");
  }

  @AfterClass//6
  public void afterClass() {
	  System.out.println("This is after class annotation");
  }

  @BeforeTest//2
  public void beforeTest() {
	  System.out.println("This is before test annotation");
  }

  @AfterTest//7
  public void afterTest() {
	  System.out.println("Thsi is after test annotation");
  }

  @BeforeSuite//1
  public void beforeSuite() {
	  System.out.println("Thia is before suite annotatoon");
  }

  @AfterSuite//8
  public void afterSuite() {
	  System.out.println("This is after suite annotation");
  }

}
