package com.Bio.Pagelibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationPage {
	WebDriver driver;
	By name = By.id("Name");
	By jobTitle = By.id("JobTitle");
	By company = By.id("Company");
	By email = By.id("Email");
	By btnSubmit = By.cssSelector("button.Button");


	public NavigationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
			
	}
	public ConfirmationPage submitRegistrationForm(String name1, String jobTitle1, String company1, String email1)
	{
		driver.findElement(name).sendKeys(name1);
		driver.findElement(jobTitle).sendKeys(jobTitle1);
		driver.findElement(company).sendKeys(company1);
		driver.findElement(email).sendKeys(email1);
		driver.findElement(btnSubmit).click();
		return new ConfirmationPage(driver);
	}
	
}
