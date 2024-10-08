package pageclases;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class UserProfile {

	WebDriver ndriver;
	WebDriverWait wait;

	public UserProfile(WebDriver odriver) {
		this.ndriver = odriver;
		PageFactory.initElements(ndriver, this);
		wait = new WebDriverWait(ndriver, Duration.ofSeconds(30));
	}

	@FindBy(xpath = "//span[contains(text(),' My Profile')]")
	private WebElement myProfile;

	@FindBy(xpath = "//span[@class='userName']")
	private WebElement userName;

	@FindBy(xpath = "(//label[contains(text(), 'Name')]//parent::div//parent::div//span//img[@alt='smartsense'])[last()]")
	private WebElement editProfileButton;

	@FindBy(xpath = "// label[contains(text(), 'Name')]//following::span")
	private WebElement name;

	@FindBy(xpath = "// label[contains(text(), 'Email')]//following::span")
	private WebElement email;

	@FindBy(xpath = "// label[contains(text(), 'Contact Number')]//following::span")
	private WebElement contactNumber;

	@FindBy(xpath = "// label[contains(text(), 'Number Format')]//following::span")
	private WebElement numberFormat;

	@FindBy(xpath = "// label[contains(text(), 'Delivery Mode')]//following::span")
	private WebElement deliveryMode;

	@FindBy(xpath = "// label[contains(text(), 'Dashboard Layout')]//following::span")
	private WebElement dashboardLayout;

	@FindBy(xpath = "//input[@name = 'name']")
	private WebElement enterName;

	@FindBy(xpath = "//input[@name = 'email']")
	private WebElement enterEmail;

	@FindBy(xpath = "//input[@name = 'phone']")
	private WebElement enterPhone;

	@FindBy(xpath = "(//div[@class='css-16pqwjk-indicatorContainer selectionbox_prefix__indicator selectionbox_prefix__dropdown-indicator'])[1]")
	private WebElement numberFormatDropdownButton;

	@FindBy(xpath = "(//div[@class='css-16pqwjk-indicatorContainer selectionbox_prefix__indicator selectionbox_prefix__dropdown-indicator'])[2]")
	private WebElement deliveryModeDropdownButton;

	@FindBy(xpath = "(//div[@class='css-16pqwjk-indicatorContainer selectionbox_prefix__indicator selectionbox_prefix__dropdown-indicator'])[3]")
	private WebElement dashboardLayoutDropdownButton;
	@FindBy(xpath = "//div[@class='save']")
	private WebElement saveEditProfileButton;

	@FindBy(xpath = "//span[@class='mainMsg']")
	private WebElement mainMessg;

	public void clickOnMyProfileButton() {
		wait.until(ExpectedConditions.visibilityOf(myProfile));
		myProfile.click();
	}

	public void clickOnuserNameButton() {
		wait.until(ExpectedConditions.visibilityOf(userName));
		userName.click();
	}

	public void User_cliks_on_Edit_profile_details_button() {
		wait.until(ExpectedConditions.elementToBeClickable(editProfileButton)).click();

	}

	public List<String> Get_user_details() {
		List<String> userDetails = new ArrayList<String>();
		userDetails.add(wait.until(ExpectedConditions.visibilityOf(name)).getText());
		userDetails.add(wait.until(ExpectedConditions.visibilityOf(email)).getText());
		userDetails.add(wait.until(ExpectedConditions.visibilityOf(contactNumber)).getText());
		userDetails.add(wait.until(ExpectedConditions.visibilityOf(numberFormat)).getText());
		userDetails.add(wait.until(ExpectedConditions.visibilityOf(deliveryMode)).getText());
		//		userDetails.add(wait.until(ExpectedConditions.visibilityOf(dashboardLayout)).getText());
		return userDetails;

	}

	public void UserEntersUserName(String name) {
		wait.until(ExpectedConditions.visibilityOf(enterName)).clear();
		;
		enterName.sendKeys(name);
	}

	public void UserEntersUserEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(enterEmail)).clear();
		enterEmail.sendKeys(email);
	}

	public void UserEntersUserContactNumber(String number) {
		wait.until(ExpectedConditions.visibilityOf(enterPhone)).clear();
		enterPhone.sendKeys(number);
	}

	public void userCliksOnNumbaerFormatDropdown() {
		wait.until(ExpectedConditions.visibilityOf(numberFormatDropdownButton)).click();
	}

	public List verifyNumberFormatDropdown(String dropdown) {
		String xpath = "//label[contains(text(), 'dropdown')]//following::div[contains(@class,'selectionbox_prefix__option')]"
				.replace("dropdown", dropdown);



		List<String> actual = new ArrayList<String>();
		wait.until(ExpectedConditions.visibilityOf(ndriver.findElement(By.xpath(xpath))));

		for (WebElement wb : ndriver.findElements(By.xpath(xpath))) {
			actual.add(wb.getText());
		}

		return actual;
	}

	public void selectValueFromNumberFormatDrpDown(String drpdownValue) throws Exception
	{
		wait.until(ExpectedConditions.visibilityOf(numberFormatDropdownButton)).click();
		//	Thread.sleep(2000);
		WebElement usUk =ndriver.findElement(By.xpath("//div[@class='css-11unzgr selectionbox_prefix__menu-list']/div[text()='"+drpdownValue+"']"));
		Actions acn = new Actions(ndriver);
		acn.moveToElement(usUk).click().build().perform();
	}


	public void selectValueFromDeliveryModeDrpDown(String drpdownValue) throws Exception
	{
		wait.until(ExpectedConditions.visibilityOf(deliveryModeDropdownButton)).click();
		Thread.sleep(2000);
		ndriver.findElement(By.xpath("//div[@class='css-11unzgr selectionbox_prefix__menu-list']/div[text()='"+drpdownValue+"']")).click();
	}

	public void selectValueFromDashBoardLayoutDrpDown(String drpdownValue)
	{
		wait.until(ExpectedConditions.visibilityOf(dashboardLayoutDropdownButton)).click();
		ndriver.findElement(By.xpath("//div[text()='"+drpdownValue+"']")).click();
	}

	public void userCliksOnDeliveryModeDropdown() {
		wait.until(ExpectedConditions.visibilityOf(deliveryModeDropdownButton)).click();
	}

	public void userCliksOnDashboardLayoutDropdown() {
		wait.until(ExpectedConditions.visibilityOf(dashboardLayoutDropdownButton)).click();
	}

	public void userSelectsVelueFromDropdown(String value) {
		String xpath = "//div [contains(@class, 'selectionbox_prefix__option')][contains(text(),'value')]"
				.replace("value", value);
		wait.until(ExpectedConditions.visibilityOf(ndriver.findElement(By.xpath(xpath)))).click();
	}

	public void userClicksOnUpdateProfileDetailsButton() throws Exception {

		wait.until(ExpectedConditions.elementToBeClickable(saveEditProfileButton)).click();
		Thread.sleep(2000);
	}
	String notfn;	
	public String getNotification() throws Exception
	{
		notfn  = mainMessg.getText();
		Thread.sleep(1000);
		System.out.println("user got notification -> "+notfn);
		return notfn;

	}
}
