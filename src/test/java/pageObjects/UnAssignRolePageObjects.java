package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utills.WaitUtill;

public class UnAssignRolePageObjects {
	
	public WebDriver driver;
	public WaitUtill WaitUtill;
	
	public UnAssignRolePageObjects(WebDriver driver) {
		this.driver = driver;
		this.WaitUtill = new WaitUtill(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "(//*[contains(@class,'__thDbe')])[2]")
	WebElement unAssignRoleBtn;
	
	@FindBy(xpath = "//*[contains(text(),'Unassign Employee From Role')]")
	WebElement unAssignRoleHeaderTxt;
	
	@FindBy(xpath = "(//*[@name='lastDate'])[1]")
	WebElement toDateInputField;
	
	@FindBy(xpath = "(//*[contains(@class,'__tDQ6y')])[1]")
	WebElement currentLocationInputField;
	
	@FindBy(xpath = "(//*[contains(@class,'__tDQ6y')])[2]")
	WebElement curentCampusInputField;
	
	@FindBy(xpath = "(//*[contains(@class,'__tDQ6y')])[3]")
	WebElement currentRoleInputField;
	
	@FindBy(xpath = "(//*[@name='remarks'])[1]")
	WebElement remarkInputField;
	
	
	
	public void clickOnUnAssignRoleBtn() {
		unAssignRoleBtn.click();
	}
	
	public String getUnAssignRoleHeaderTxt() {
		return unAssignRoleHeaderTxt.getAttribute("value");
	}
	
	public void setToDate(String date) {
		toDateInputField.sendKeys(date);
	}
	
	public String getCurrentLocation()
	{
		return currentLocationInputField.getAttribute("value");
	}
	
	public String getCurrentCampus() {
		return curentCampusInputField.getAttribute("value");
	}
	
	public String getCurrentRole() {
		return currentRoleInputField.getAttribute("value");
	}
	public void setRemark(String remark) {
		remarkInputField.sendKeys(remark);
	}
	
	
	
	

}
