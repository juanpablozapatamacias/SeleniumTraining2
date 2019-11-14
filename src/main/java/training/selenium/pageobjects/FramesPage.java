package training.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.selenium.base.BasePage;

public class FramesPage extends BasePage{
	
	public FramesPage(WebDriver driver) {
		super(driver);
	}
	
	public IframePage clickIframeLink() {
		ele = getElement(By.xpath("//a[contains(text(),'iFrame')]"), 3);
		ele.click();
		
		return new IframePage(driver);
	}

}
