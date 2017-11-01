package TestScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Bio.Pagelibrary.ConfirmationPage;
import com.Bio.Pagelibrary.MainPage;
import com.Bio.Pagelibrary.NavigationPage;

import TestScripts.TestBase.WebBrowser;

public class BioTest {
	WebDriver driver;
	String getUrl= "https://www.thebioagency.com/news-and-views/white-papers/";
	String browserType ="Firefox";
	
  
  @Test
  public void bioTesting() throws InterruptedException {
	  String expectedResult = "Thanks, we hope you find the White Paper useful.";
	  MainPage homepage = new MainPage(driver);
	  homepage.clickonLink();	  
	  NavigationPage submitPage = new NavigationPage(driver);
	  ConfirmationPage confPage =submitPage.submitRegistrationForm("Ashu", "Automation Consultant", "IBM", "xyz@test.com");
	  
	  Assert.assertEquals(confPage.isConfirmationMessagePresent(), expectedResult);
	  //assertEquals(confPage.isConfirmationMessagePresent(), expectedResult);
  }
  
  
  @BeforeMethod
  public void setUp()
  {
	  //setting up the browser
	 driver = WebBrowser.open(browserType);
	 driver.get(getUrl);
	 driver.manage().window().maximize();
  }
  
  @AfterMethod
  public void tearDown()
  {
	  driver.quit();
  }
  
  
}
