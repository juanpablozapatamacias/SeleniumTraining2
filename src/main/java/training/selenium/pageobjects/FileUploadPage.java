package training.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import training.selenium.base.BasePage;

public class FileUploadPage extends BasePage {

	public FileUploadPage (WebDriver driver) {
		super(driver);
	}
	
	public void clickUploadFile() {
		WebElement fileElement = getElement(By.xpath("//div//form/input[@id='file-upload']"), 3);
		fileElement.sendKeys(System.getProperty("user.dir") + "/Folder/textExample.txt");
		
		WebElement submit = getElement(By.xpath("//div//form/input[@id='file-submit']"), 3);
		submit.click();
	}
	
	public String fileUploadedMessage() {
		ele =  getElementPresenceOfElementLocated(By.xpath("//div/*[contains(text(),'File Uploaded!')]"),3);		
		return ele.getText();
	}
}
