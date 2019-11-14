package training.selenium.pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.selenium.base.BasePage;
import training.selenium.utilities.CommonUtilities;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public BasicAuthPage clickBasicAuthLink() {
		driver.navigate().to("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		return new BasicAuthPage(driver);
	}
	
	public CheckboxesPage clickCheckboxesLink(){
		ele = getElement(By.xpath("//a[contains(text(),'Checkboxes')]"), 3);
		ele.click();
		return new CheckboxesPage(driver);
	}
	
	public ContextMenuPage clickContextMenuLink() {
		ele = getElement(By.xpath("//a[contains(text(),'Context Menu')]"),3);
		ele.click();
		return new ContextMenuPage(driver);
	}
	
	public DropdownListPage clickDropDownListPage() {
		ele = getElement(By.xpath("//a[contains(text(),'Dropdown')]"),3);
		ele.click();
		return new DropdownListPage(driver);
	}
	
	public DynamicControlsPage clickDynamicControlsLink() {
		ele = getElement(By.xpath("//a[contains(text(),'Dynamic Controls')]"),3);
		ele.click();
		return new DynamicControlsPage(driver);
	}
	 
	public FileUploadPage clickFileUploadLink() {
		ele = getElement(By.xpath("//a[contains(text(),'File Upload')]"),3);
		ele.click();
		return new FileUploadPage(driver);
	}
	
	public MultipleWindowsPage clickMultipleWindowsLink() {
		ele = getElement(By.xpath("//a[contains(text(),'Multiple Windows')]"),3);
		ele.click();
		return new MultipleWindowsPage(driver);
	}
	
	public SortableDataTablesPage clickSortableDataTablesPage() {
		ele = getElement(By.xpath("//a[contains(text(),'Sortable Data Tables')]"),3);
		ele.click();
		return new SortableDataTablesPage(driver);
	}

	public FramesPage clickFramesLink() {
		// TODO Auto-generated method stub
		ele = getElement(By.xpath("//a[contains(text(),'Frames')]"),3);
		ele.click();
		return new FramesPage(driver);
	}
	
}
