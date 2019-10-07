package training.selenium.pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import training.selenium.base.BasePage;
import training.selenium.utilities.CommonUtilities;

public class BasicAuthPage extends BasePage {
	
	public BasicAuthPage(WebDriver driver) {
		super(driver);
	}
	
	public String getBasicAuthenticationDialogConfirmation() {
		ele = super.getElement(By.cssSelector
				("body:nth-child(2) div.row:nth-child(2) div.large-12.columns:nth-child(2) div.example > p:nth-child(2)"), 3);
		System.out.println("Text contains: " + ele.getText());
		CommonUtilities.sleepByNSeconds(3);
		return ele.getText();
	}
	/*
	public HomePage getHomePage() {
		driver.navigate().back();
		CommonUtilities.sleepByNSeconds(3);
		return new HomePage(driver);
	}
	*/
}
