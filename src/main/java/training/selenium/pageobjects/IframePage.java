package training.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IframePage extends FramesPage {
	
	public IframePage(WebDriver driver) {
		super(driver);
	}
	
	public void switchToIFrame(){
		WebElement iFrame = getElement(By.cssSelector("#mce_0_ifr"), 3);
		driver.switchTo().frame(iFrame);
	}
	
	public void setTextIframe(String text){
		ele = getElement(By.cssSelector("#tinymce"),2);
		ele.sendKeys("");
		ele.sendKeys(text);
	}
}
