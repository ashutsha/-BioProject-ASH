package com.Bio.Pagelibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage {
WebDriver driver;
By firstLink = By.xpath("//*[@class='Tiles-item'][1]/a/div/span");
By rightArrow1 = By.cssSelector("span.icon-wrapper> span");
By rightArrow2 = By.cssSelector("button.arrow.arrow-right > span");

public MainPage(WebDriver driver)
{
	this.driver = driver;
}

public NavigationPage clickonLink() throws InterruptedException
{
	driver.findElement(firstLink).click();
	Thread.sleep(5000);
	driver.findElement(rightArrow1).click();
	Thread.sleep(2000);
	driver.findElement(rightArrow2).click();
	Thread.sleep(2000);
	driver.findElement(rightArrow2).click();


			return new NavigationPage(driver);

}
}
