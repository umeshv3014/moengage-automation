package com.moengage.app.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.moengage.utill.PageHandler;

public class HomePage extends PageHandler {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Create Campaign General Campaign
	@FindBy(xpath = "//*[@id='nav']/li/a/span[contains(text(),'Campaigns')]")
	public static WebElement Campaigns;

	public void clickToOpenCampaignsList() {
		Campaigns.click();
	}

	@FindBy(xpath = "//span[contains(text(),'Create Campaign')]")
	public static WebElement CreateCampaigns;

	public void selectCreateCampaigns() {
		CreateCampaigns.click();
	}

	@FindBy(xpath = "//div/h3/span[contains(text(),'General Campaign')]/parent::h3/following-sibling::a/span[contains(text(),'Creat')]")
	public static WebElement CreateCampaignsButton;

	public void SelectGenralCreate() {
		CreateCampaignsButton.click();
	}

	// General Campaign Segmentation 1
	// Name the Campaign
	@FindBy(xpath = "//*[@aria-label='campaignName']")
	public static WebElement NameTheCampaign;

	public void NameTheCampaign(String nameOfCamoaign) {
		NameTheCampaign.sendKeys(nameOfCamoaign);
	}

	// Choose the platforms you want to run the campaign for:

	@FindBy(xpath = ".//*[@id='ANDROID']/div[1]")
	public static WebElement choosePlatform;

	public void choosePlatformToRunCampaign() {
		choosePlatform.click();
	}

	// user Behaviour

	@FindBy(xpath = "//span[contains(text(),'Select User Actions')]")
	public static WebElement userActions;

	public void selectUserActions() {
		userActions.click();
	}

	@FindBy(xpath = ".//*/segmentation-event-generator/div[1]/div[2]/div/a")
	public static WebElement segmentation;

	public void selectUsersegmentation() {
		segmentation.click();
	}

	@FindBy(xpath = ".//*/segmentation-event-generator/div/div[2]/div/div/div/input")
	public static WebElement enterUserActionsinputBox;

	public void enterUserActionsList(String value) {
		enterUserActionsinputBox.sendKeys(value);
	}

	@FindBy(xpath = ".//*/segmentation-event-generator/div[1]/div[2]/div/div/ul/li")
	public List<WebElement> selectUserActionsList;

	public void selectUserActionsFromList(String value) {
		enterUserActionsList(value);
		for (int i = 0; i < selectUserActionsList.size(); i++) {
			WebElement list = selectUserActionsList.get(i);
			if (list.getText().equals(value)) {
				list.click();
				break;
			}
		}
	}

	@FindBy(xpath = ".//a[contains(text(),'Next')]")
	public static WebElement Next;

	public void proceedToMessaging() {
		Next.click();
	}

	@FindBy(xpath = ".//div/div[1]/div[2]/textarea")
	public static WebElement messageTitle;

	public void enterMessageTitle(String message) {
		messageTitle.sendKeys(message);
		messageTitle.sendKeys(Keys.ENTER);
	}

	@FindBy(xpath = ".//*[@id='app']/mentio-menu[1]/ul/li/a")
	List<WebElement> selectMessageTitle_Name;

	public void selectMessageTitle_Name_list(String value) {
		for (int i = 0; i < selectMessageTitle_Name.size(); i++) {
			WebElement list = selectMessageTitle_Name.get(i);
			if (list.getText().equals(value)) {
				list.click();
				break;
			}
			System.out.println(list.getText());
		}
	}

	@FindBy(xpath = "//*/div/div[2]/div[2]/textarea")
	public static WebElement enterMessage;

	public void enterMessage(String message) {
		enterMessage.sendKeys(message);
	}

	@FindBy(xpath = ".//label[contains(text(),'Rich content')]/parent::md-tab-item")
	public static WebElement richContent;

	@FindBy(xpath = ".//*/div/md-card/md-card-content/div[2]/div[2]/select")
	public static WebElement selectContent;

	public void selectRichContent(String text) {
		richContent.click();
		Select select = new Select(selectContent);
		select.selectByVisibleText(text);
	}

	@FindBy(xpath = ".//*[@id='coupon']/div[2]/input")
	public static WebElement couponCode;

	public void enterCouponCode(String message) {
		couponCode.sendKeys(message);
	}

	@FindBy(xpath = ".//*[@id='image']/input")
	public static WebElement image;

	public void enterImageURL(String url) {
		image.sendKeys(url);
	}

	@FindBy(xpath = ".//md-content[2]/div/md-switch/div[1]")
	public static WebElement enableFallBackButton;

	public void enableFallBackMessage() {
		enableFallBackButton.click();
	}

	@FindBy(xpath = ".//label[contains(text(),'Actions')]/parent::md-tab-item")
	public static WebElement actions;

	public void selectActions() {
		actions.click();
	}

	@FindBy(xpath = "//label[contains(text(),'Default Click Action')]/parent::div/following-sibling::div/select")
	public static WebElement defaultClickAction;

	public void selectDefaultClickAction(String action) {
		Select select = new Select(defaultClickAction);
		select.selectByVisibleText(action);// Navigate to a screen
	}

	@FindBy(xpath = ".//*[@id='androidnavigation']/div[1]/div[2]/div")
	public WebElement androidnavigation_div;

	public void selectActionsandroidnavigation() {
		androidnavigation_div.click();
	}

	// take the user to specific screen in app
	@FindBy(xpath = ".//*[@id='androidnavigation']/div[1]/div[2]/div/div/ul/li")
	List<WebElement> androidnavigation;

	public void selectAndroidnavigation(String action) {
		for (int i = 0; i < androidnavigation.size(); i++) {
			WebElement list = androidnavigation.get(i);
			if (list.getText().equals(action)) {
				list.click();
				break;
			}
			System.out.println(list.getText());
		}
	}

	// Additional Key Value pairs (Optional) :

	@FindBy(xpath = ".//*[@id='androidnavigation']/div[2]/div/div/input")
	public static List<WebElement> androidnavigation_AddtionalKey;

	@FindBy(xpath = ".//*[@id='androidnavigation']/div[2]/div[2]/div[4]/button")
	public static WebElement KeyValuepairs;

	public void setAdditionalKeyValuepairs_androidnavigation(String value1) {
		for (int i = 2; i <= 3; i++) {
			WebElement xpath = driver.findElement(By
					.xpath(".//*[@id='androidnavigation']/div[2]/div[" + i
							+ "]/div[4]/button"));
			xpath.click();
		}
		for (int i = 0; i < androidnavigation_AddtionalKey.size(); i++) {
			WebElement list = androidnavigation_AddtionalKey.get(i);
			list.sendKeys(value1);
		}
	}

	@FindBy(xpath = ".//div[@class='pushForm']/md-content[2]/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/div[1]/div[2]")
	public static WebElement fallBackMessage;

	public void enterFallbackMessage(String message) {
		Actions actions = new Actions(driver);
		actions.moveToElement(fallBackMessage);
		actions.click();
		actions.sendKeys(message);
		actions.build().perform();
		// fallBackMessage.sendKeys(message);
	}

	// Scheduling & Goals
	@FindBy(xpath = "//input[contains(@datepicker-popup,'MM/dd/yyyy')]")
	public static WebElement scheduling_Goals_date;

	@FindBy(xpath = ".//strong[@class='ng-binding']")
	public static WebElement month_year;

	@FindBy(xpath = ".//i[@class='glyphicon glyphicon-chevron-right']")
	public static WebElement next_month;

	public void enterSchedulingGoalsDate(String message) {
		scheduling_Goals_date.sendKeys(message);
	}

	// select the data
	public void dateSelector(String date, String Month_Year)
			throws InterruptedException {
		scheduling_Goals_date.click();
		String str = month_year.getText();

		if (str.equals(Month_Year)) {
			System.out.println("month selected");
		} else {
			for (int i = 1; i < 12; i++) {
				next_month.click();
				Thread.sleep(1000);
				if (month_year.getText().equals(Month_Year)) {
					WebElement we = driver
							.findElement(By
									.xpath("//table[@role='grid']//tr/td[@aria-disabled='false']/button/span[contains(text(),'"
											+ date + "')]"));
					we.click();
					System.out.println("month and date selected");
					break;
				}
			}
		}

	}

	@FindBy(xpath = ".//table[@class='ui-timepicker ng-isolate-scope']//tr[1]/td[3]")
	public static WebElement update_Min;

	public void minut_updater(int min) {
		for (int i = 1; i <= min; i++) {
			update_Min.click();
		}
	}

	@FindBy(xpath = ".//table[@class='ui-timepicker ng-isolate-scope']//tr[2]/td[4]")
	public static WebElement am_pm_text;

	public void am_pm_updater(String am_pm) {
		am_pm_text.getText();
		if (am_pm.equals(am_pm_text.getText())) {
			System.out.println(am_pm + "selected ");
		} else {
			am_pm_text.click();
		}
	}

	// Set Conversion Goal(s)

	@FindBy(xpath = "//*[@id='revenuePerformance']/div[1]")
	public static WebElement tracks;

	public void setConversionGoal_Tracks() {
		tracks.click();
	}

	@FindBy(xpath = "//span[contains(text(),'Select Event')]")
	public static WebElement goal_event;

	public void setConversionGoal_goal_event() {
		goal_event.click();
	}

	@FindBy(xpath = "//md-content//span[2]//div/ul/li")
	public static List<WebElement> goal_event_list;

	public void setConversionGoal_goal_event_list(String value) {
		for (int i = 0; i < goal_event_list.size(); i++) {
			WebElement list = goal_event_list.get(i);
			if (list.getText().equals(value)) {
				list.click();
				break;
			}
			System.out.println(list.getText());
		}
	}

	// TrackRevenuePerformance
	@FindBy(xpath = "//span[text()='Select Attribute']")
	public static WebElement Set_revenue;

	public void set_revenue() {
		Set_revenue.click();
	}

	@FindBy(xpath = "//*[@id='select_attr_chosen']/div/ul/li")
	public static List<WebElement> Set_Revenue_currency_list;

	public void setRevenuecurrencylist(String value) {
		for (int i = 0; i < Set_Revenue_currency_list.size(); i++) {
			WebElement list = Set_Revenue_currency_list.get(i);
			if (list.getText().equals(value)) {
				list.click();
				break;
			}
			System.out.println(list.getText());
		}
	}

	@FindBy(xpath = "//span[text()='Select Currency']")
	public static WebElement selectCurrency;

	public void selectCurrency() {
		selectCurrency.click();
	}

	@FindBy(xpath = "//*[@id='select_currency_chosen']/div/ul/li")
	public static List<WebElement> selectCurrency_list;

	public void selectCurrency_list(String value) {
		for (int i = 0; i < selectCurrency_list.size(); i++) {
			WebElement list = selectCurrency_list.get(i);
			if (list.getText().equals(value)) {
				list.click();
				break;
			}
			System.out.println(list.getText());
		}
	}

	@FindBy(xpath = ".//a[text()='Create Campaign']")
	public static WebElement createCampButton;

	public void createCampBtn() {
		createCampButton.click();
	}

	@FindBy(xpath = "//span[text()='Yes']")
	public static WebElement createCamp;

	public void createCamp() {
		createCamp.click();
	}
}
