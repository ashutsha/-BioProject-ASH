package com.Bio.Pagelibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPage {
	WebDriver driver;
By txtConfirmation = By.xpath("//*[@class='form-row PageContent-introduction']/p[contains(text(),'Thanks, we hope you find the White')]");

public ConfirmationPage(WebDriver driver) {
	this.driver = driver;
}

public String isConfirmationMessagePresent() {
	WebDriverWait wait=new WebDriverWait(driver, 10);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(txtConfirmation));
	return driver.findElement(txtConfirmation).getText();
}
}
