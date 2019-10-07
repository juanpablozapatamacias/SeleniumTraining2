package training.selenium.pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import training.selenium.base.BasePage;
import training.selenium.utilities.CommonUtilities;

public class ContextMenuPage extends BasePage{
	
	public ContextMenuPage(WebDriver driver) {
		super(driver);
	}
	
	public void doRightClick() {
		ele = super.getElementPresenceOfElementLocated(By.xpath("//div[@id='hot-spot']"), 3);
		Actions act = new Actions(driver);
		act.moveToElement(ele);
		act.contextClick(ele).build().perform();
		
		try {
			Alert alert = driver.switchTo().alert();
			String alertMessage = alert.getText();
			System.out.println(alertMessage);
			CommonUtilities.sleepByNSeconds(3);
			alert.accept();
			
		}
		catch (Exception e) {
			System.out.println("Unexpected alert is not present");
		}
	}

}
