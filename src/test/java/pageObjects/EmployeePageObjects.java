package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utills.WaitUtill;

public class EmployeePageObjects {

	private WebDriver driver;
	private WaitUtill waitUtill;

	public EmployeePageObjects(WebDriver driver) {
		this.driver = driver;
		this.waitUtill = new WaitUtill(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//*[contains(@class,'PcgVQ')])[4]")
	WebElement employeeBtn;

	@FindBy(xpath = "//*[contains(@class,'cardGreen__iIHLY')]")
	WebElement employeeManegementCard;

//	@FindBy(xpath = "//*[contains(@class,'application_search_header__-14GlB-')]")
//	WebElement employeeManagementHeaderTxt;

	@FindBy(xpath = "//*[contains(@class,'+KDp3 undefined')]")
	WebElement searchInputField;

	@FindBy(xpath = "//*[text()='Location']")
	WebElement locationfilterBtn;

	@FindBy(xpath = "//*[text()='Campus']")
	WebElement campusFilterBtn;
	@FindBy(xpath = "(//*[contains(@type,'button')])[1]")
	WebElement campusDrpdown;
	@FindBy(xpath = "//*[contains(@id,'option-0')]")
	WebElement campusSelectOption;

	@FindBy(xpath = "//*[text()='Search']")
	WebElement clksearchBtn;

	@FindBy(xpath = "//div[contains(@class,'EmployeeSearchResults_cardRow__bi5Mx')]/div[position() <= 2]")
	List<WebElement> profileCards;

	@FindBy(xpath = "//*[contains(@class,'__IvC3e ')]")
	WebElement btnNxt;

	@FindBy(xpath = "//*[contains(@class,'KiDxk  ')]")
	WebElement mappingRemappingBtn;

	@FindBy(xpath = "//*[text()='Assign Group']")
	WebElement assignGroupBtn;

//	@FindBy(xpath = "//*[contains(@name,'workingStartDate')]")
//	WebElement workingStartDateInputField;

	@FindBy(xpath = "//*[contains(@name,'city')]")
	WebElement cityInputField;

	@FindBy(xpath = "//*[contains(@name,'campus')]")
	WebElement campusInputField;

	@FindBy(xpath = "//*[@name='manager']")
	WebElement managerDropdown;

	@FindBy(xpath = "(//*[text()='Ava Davis (HYD000020)'])")
	WebElement managerSelectOption;

	@FindBy(xpath = "//*[@name='reportingManager']")
	WebElement reportingManagerDropdown;

	@FindBy(xpath = "(//*[text()='Chloe Green (HYD000026)'])")
	WebElement reportingManagerSelectOption;

	@FindBy(xpath = "//*[@name='remarks']")
	WebElement remarksInputField;

	@FindBy(xpath = "//*[contains(@class,'primary__wIbg5')]")
	WebElement confirmBtn;

//	@FindBy(xpath = "//*[contains(@class,'__IEXua')]")
//	WebElement cancelBtn;
	
	@FindBy(xpath = "//*[contains(@class,'secondary__S0loe ')]")
	WebElement backBtn;
	

	public void clickOnEmployeeBtn() {
		//employeeBtn.click();
		waitUtill.waitForVisibility(employeeBtn).click();
	}

	public void clickOnEmployeeManegementCard() {
		employeeManegementCard.click();
	}

//	public String getEmployeeManagementHeaderTxt() {
//		waitUtill.waitForVisibility(employeeManagementHeaderTxt);
//		return employeeManagementHeaderTxt.getText();
//	}

	public void clksearchEmployee() throws InterruptedException {
		Thread.sleep(2000);
		searchInputField.click();
		
	}

	public void filterOptions() throws InterruptedException {
		locationfilterBtn.click();
	}

//	public void campusFilter(String campusName)
//	{
//		campusFilterBtn.click();
//		campusDrpdown.click();
//		campusSelectOption.click();
//	}

	public void clksearchBtn() {
		waitUtill.waitForVisibility(clksearchBtn).click();
	}

	public void clkProfileCards() {
		
	    int cardsToClick = Math.min(2, profileCards.size());
	    for (int i = 0; i < cardsToClick; i++) {
	        profileCards.get(i).click();
	    }
	}

	public void clkNxtBtn() {
		btnNxt.click();
	}

	public void clickOnMappingRemappingBtn() {
		mappingRemappingBtn.click();
	}

	public void clickOnAssignGroupBtn() {
		assignGroupBtn.click();
	}

//	public String getWorkingStartDate() {
//		return workingStartDateInputField.getAttribute("value");
//	}

	public String getCity() {
		return cityInputField.getAttribute("value");
	}

	public String getCampus() {
		return campusInputField.getAttribute("value");
	}

	public void clickOnManagerDropdown() {
		managerDropdown.click();
		managerSelectOption.click();
	}

	public void clickOnReportingManagerDropdown() throws InterruptedException {
		reportingManagerDropdown.click();
		Thread.sleep(2000);
		reportingManagerSelectOption.click();
	}

	public void enterRemarks(String remarks) {
		remarksInputField.sendKeys(remarks);
	}

	public void clickOnConfirmBtn() {
		confirmBtn.click();
	}
	
	public void clickOnBackBtn() {
		backBtn.click();
	}

//	public void clickOnCancelBtn() {
//		cancelBtn.click();
//	}
	
	
	

}
