package training.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.selenium.base.BasePage;
import training.selenium.utilities.CommonUtilities;

public class SortableDataTablesPage extends BasePage {
	
	public SortableDataTablesPage (WebDriver driver) {
		super(driver);
	}
	
	//
	public void clickSortFirstName() {
		ele = getElement(By.xpath("//table[@id='table1']//th/*[contains(text(),'First')]"),3);
		ele.click();
		CommonUtilities.sleepByNSeconds(1);
	}
	
	////table[@id='table1']//tr[td[contains(text(),'John')]]/td[3]
	
	public void getJohnEmailInfo() {
		ele = getElement(By.xpath("//table[@id='table1']//tr[td[contains(text(),'John')]]/td[3]"),3);
		System.out.println(ele.getText());
	}
	
	public void clickSortLastName() {
		ele = getElement(By.xpath("//table[@id='table1']//th/*[contains(text(),'Last')]"),3);
		ele.click();
		CommonUtilities.sleepByNSeconds(1);
	}
	
	public void getConwayWebInfo() {
		ele = getElement(By.xpath("//table[@id='table1']//tr[td[contains(text(),'Conway')]]/td[5]"),3);
		System.out.println(ele.getText());
	}

}
