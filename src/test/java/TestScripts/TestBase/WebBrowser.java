package TestScripts.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebBrowser {
	public static WebDriver open(String browserType)
	{
		if (browserType.equalsIgnoreCase("firefox"))
		{
			return new FirefoxDriver();
		}
		else 
		{

			return new ChromeDriver();
		}
	}
	
	
	
	}

