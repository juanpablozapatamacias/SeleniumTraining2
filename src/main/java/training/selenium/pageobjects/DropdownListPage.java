package training.selenium.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import training.selenium.base.BasePage;

public class DropdownListPage extends BasePage{
	
	public DropdownListPage(WebDriver driver) {
		super(driver);
	}

	public void selectDropDownListItem() {
		Select select = getSelectElement(By.xpath("//select[@id='dropdown']"), 3);
		List<WebElement> opt = select.getOptions();
		
		for(WebElement ele : opt) {
			ele.click();
		}
	}
}
