package training.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import training.selenium.base.BasePage;
import training.selenium.utilities.CommonUtilities;

public class DynamicControlsPage extends BasePage {
	
	public DynamicControlsPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean clickRemoveButton() {
		WebElement eleRemove = getElement(By.xpath("//div//form/button[contains(text(),\'Remove\')]"), 3);
		eleRemove.click();
		
		return isElementVisible(getElementPresenceOfElementLocated(By.xpath("//div//form//p"), 10));
	}
	
	public boolean clickAddButton() {
		WebElement eleAdd =  getElement(By.xpath("//div//form/button[contains(text(),\'Add\')]"),3);
		eleAdd.click();
		
		return isElementVisible(getElementPresenceOfElementLocated(By.xpath("//div//form//p"), 10));
	}
	
	public boolean clickEnableButton() {
		if(!isElementEnabled(getElement(By.xpath("//div//form//input[contains(@type, \'text\')]"), 5))){
			WebElement eleEnabled = getElement(By.xpath("//div//form/button[contains(text(),\'Enable\')]"),3);
			eleEnabled.click();
			
			CommonUtilities.sleepByNSeconds(10);
		}
		
		return getElement(By.xpath("//div//form//input[contains(@type, \'text\')]"), 5).isEnabled();
	} 
	
	public void fillTextField(String value) {
		WebElement eleTextField =  getElement(By.xpath("//div//form//input[contains(@type, \'text\')]"),3);
		eleTextField.sendKeys(value);
		
		CommonUtilities.sleepByNSeconds(3);
	}

	
}
