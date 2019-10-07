package training.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import training.selenium.base.BasePage;

public class CheckboxesPage extends BasePage {
	
	public CheckboxesPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickCheckboxes() {
		listEle = getListElements(By.xpath("//div//input[contains(@type,'check')]"), 3);
		
		for(WebElement e : listEle) {
			if(!e.isSelected()) e.click();
			else e.click();
		}
	}
	
	public String getCheckboxesTitle() {
		ele = super.getElement(By.xpath("//h3[contains(text(),'Checkboxes')]"), 3);
		return ele.getText();
	}

}
