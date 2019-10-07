package training.selenium.pageobjects;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.selenium.base.BasePage;

public class MultipleWindowsPage extends BasePage {
	
	public MultipleWindowsPage (WebDriver driver) {
		super(driver);
	}
	
	public void clickToOpenAnotherWinTab() {
		
		String oldTab = driver.getWindowHandle();
		
		ele =  getElement(By.xpath("//a[contains(text(),'Click Here')]"),3);
		ele.click();
		
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		newTab.remove(oldTab);
		
		driver.switchTo().window(newTab.get(0));
		driver.close();
		
		driver.switchTo().window(oldTab);
		
	}
	
	public String getNewWindowMessageTab() {
		ele =  getElement(By.xpath("//h3[contains(text(),'New Window')]"),3);
		
		return ele.getText();
	}

}
