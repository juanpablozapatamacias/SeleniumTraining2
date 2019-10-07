package training.selenium.test;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import training.selenium.base.BasePage;
import training.selenium.pageobjects.BasicAuthPage;
import training.selenium.pageobjects.CheckboxesPage;
import training.selenium.pageobjects.ContextMenuPage;
import training.selenium.pageobjects.DropdownListPage;
import training.selenium.pageobjects.DynamicControlsPage;
import training.selenium.pageobjects.FileUploadPage;
import training.selenium.pageobjects.HomePage;
import training.selenium.pageobjects.MultipleWindowsPage;
import training.selenium.pageobjects.SortableDataTablesPage;

public class DemoTest extends BasePage{
	
	@BeforeClass
	public void setup() {
		driver = getDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.navigate().to("http://the-internet.herokuapp.com/");
	}
	
	@Test
	public void basicAuthenticationTest() {
		homePage = new HomePage(driver);
		BasicAuthPage basicAuthPage = homePage.clickBasicAuthLink();
		Assert.assertTrue(basicAuthPage.getBasicAuthenticationDialogConfirmation().
				contains("Congratulations"), "Wrong Credentials...");
		homePage = basicAuthPage.getHomePage();
	}
	
	@Test(dependsOnMethods = "basicAuthenticationTest")
	public void checkboxTest() {
		CheckboxesPage checkboxesPage = homePage.clickCheckboxesLink();
		Assert.assertTrue(checkboxesPage.getCheckboxesTitle().toLowerCase().contains("checkboxes"));
		checkboxesPage.clickCheckboxes();
		homePage = checkboxesPage.getHomePage();
	}
	
	@Test(dependsOnMethods = "checkboxTest")
	public void contextMenuTest() {
		ContextMenuPage contextMenuPage = homePage.clickContextMenuLink();
		contextMenuPage.doRightClick();
		homePage = contextMenuPage.getHomePage();
	}
	
	@Test(dependsOnMethods = "contextMenuTest")
	public void dropdownListTest() {
		DropdownListPage dropDownListPage = homePage.clickDropDownListPage();
		dropDownListPage.selectDropDownListItem();
		homePage = dropDownListPage.getHomePage();
	}
	
	@Test(dependsOnMethods = "dropdownListTest")
	public void dynamicControlTest() {
		DynamicControlsPage dynamicControlPage = homePage.clickDynamicControlsLink();
		Assert.assertTrue(dynamicControlPage.clickRemoveButton());
		Assert.assertTrue(dynamicControlPage.clickAddButton());
		Assert.assertTrue(dynamicControlPage.clickEnableButton());
		dynamicControlPage.fillTextField("Hello World!!");
		homePage = dynamicControlPage.getHomePage();
	}
	
	@Test(dependsOnMethods = "dynamicControlTest")
	public void fileUploadTest() {
		FileUploadPage fileUploadPage = homePage.clickFileUploadLink();
		fileUploadPage.clickUploadFile();
		Assert.assertTrue(fileUploadPage.fileUploadedMessage().toLowerCase().contains("uploaded"));
		fileUploadPage.navigateBack();
		homePage = fileUploadPage.getHomePage();
	}
	
	@Test(dependsOnMethods = "fileUploadTest")
	public void SortableDataTableTest() {
		SortableDataTablesPage sortableDataPage = homePage.clickSortableDataTablesPage();
		sortableDataPage.clickSortFirstName();
		sortableDataPage.getJohnEmailInfo();
		
		sortableDataPage.clickSortLastName();
		sortableDataPage.getConwayWebInfo();
		//Assert.assertTrue(multipleWinPage.getNewWindowMessageTab().toLowerCase().contains("new"));
		homePage = sortableDataPage.getHomePage();
	}
	
	@Test(dependsOnMethods = "SortableDataTableTest")
	public void multipleWindowsTest() {
		MultipleWindowsPage multipleWinPage = homePage.clickMultipleWindowsLink();
		multipleWinPage.clickToOpenAnotherWinTab();
		//Assert.assertTrue(multipleWinPage.getNewWindowMessageTab().toLowerCase().contains("new"));
		homePage = multipleWinPage.getHomePage();
	}
	
	@AfterClass
	public void teardown() {
		//driver.close();
		driver.quit();
		driver = null;
	}

}
