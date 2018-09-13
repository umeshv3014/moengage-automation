package com.moengage.app.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

	@FindBy(xpath = "//span[contains(text(),'Create Campaign')]")
	public static WebElement CreateCampaigns;

	@FindBy(xpath = "//div/h3/span[contains(text(),'General Campaign')]/parent::h3/following-sibling::a/span[contains(text(),'Creat')]")
	public static WebElement CreateCampaignsButton;

	// General Campaign Segmentation 1
	// Name the Campaign
	@FindBy(xpath = "//*[@aria-label='campaignName']")
	public static WebElement NameTheCampaign;

	// Choose the platforms you want to run the campaign for:

	@FindBy(xpath = ".//*[@id='ANDROID']/div[1]")
	public static WebElement choosePlatform;

	// user Behaviour

	@FindBy(xpath = "//span[contains(text(),'Select User Actions')]")
	public static WebElement userActions;

	@FindBy(xpath = ".//*/segmentation-event-generator/div[1]/div[2]/div/a")
	public static WebElement segmentation;

	@FindBy(xpath = ".//*/segmentation-event-generator/div/div[2]/div/div/div/input")
	public static WebElement enterUserActionsinputBox;

	@FindBy(xpath = ".//*/segmentation-event-generator/div[1]/div[2]/div/div/ul/li")
	public static List<WebElement> selectUserActionsList;

	@FindBy(xpath = ".//a[contains(text(),'Next')]")
	public static WebElement Next;

	@FindBy(xpath = ".//div/div[1]/div[2]/textarea")
	public static WebElement messageTitle;

	@FindBy(xpath = ".//*[@id='app']/mentio-menu[1]/ul/li/a")
	public List<WebElement> selectMessageTitle_Name;

	@FindBy(xpath = "//*/div/div[2]/div[2]/textarea")
	public static WebElement enterMessage;

	@FindBy(xpath = ".//label[contains(text(),'Rich content')]/parent::md-tab-item")
	public static WebElement richContent;

	@FindBy(xpath = ".//*/div/md-card/md-card-content/div[2]/div[2]/select")
	public static WebElement selectContent;

	@FindBy(xpath = ".//*[@id='coupon']/div[2]/input")
	public static WebElement couponCode;

	@FindBy(xpath = ".//*[@id='image']/input")
	public static WebElement image;

	@FindBy(xpath = ".//md-content[2]/div/md-switch/div[1]")
	public static WebElement enableFallBackButton;

	@FindBy(xpath = ".//label[contains(text(),'Actions')]/parent::md-tab-item")
	public static WebElement actions;

	@FindBy(xpath = "//label[contains(text(),'Default Click Action')]/parent::div/following-sibling::div/select")
	public static WebElement defaultClickAction;

	@FindBy(xpath = ".//*[@id='androidnavigation']/div[1]/div[2]/div")
	public WebElement androidnavigation_div;

	// take the user to specific screen in app
	@FindBy(xpath = ".//*[@id='androidnavigation']/div[1]/div[2]/div/div/ul/li")
	public List<WebElement> androidnavigation;

	// Additional Key Value pairs (Optional) :

	@FindBy(xpath = ".//*[@id='androidnavigation']/div[2]/div/div/input")
	public static List<WebElement> androidnavigation_AddtionalKey;

	@FindBy(xpath = ".//*[@id='androidnavigation']/div[2]/div[2]/div[4]/button")
	public static WebElement KeyValuepairs;

	@FindBy(xpath = ".//div[@class='pushForm']/md-content[2]/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/div[1]/div[2]")
	public static WebElement fallBackMessage;

	// Scheduling & Goals
	@FindBy(xpath = "//input[contains(@datepicker-popup,'MM/dd/yyyy')]")
	public static WebElement scheduling_Goals_date;

	@FindBy(xpath = ".//strong[@class='ng-binding']")
	public static WebElement month_year;

	@FindBy(xpath = ".//i[@class='glyphicon glyphicon-chevron-right']")
	public static WebElement next_month;

	@FindBy(xpath = ".//table[@class='ui-timepicker ng-isolate-scope']//tr[1]/td[3]")
	public static WebElement update_Min;

	@FindBy(xpath = ".//table[@class='ui-timepicker ng-isolate-scope']//tr[2]/td[4]")
	public static WebElement am_pm_text;

	@FindBy(xpath = "//*[@id='revenuePerformance']/div[1]")
	public static WebElement tracks;

	@FindBy(xpath = "//span[contains(text(),'Select Event')]")
	public static WebElement goal_event;

	@FindBy(xpath = "//md-content//span[2]//div/ul/li")
	public static List<WebElement> goal_event_list;

	// TrackRevenuePerformance
	@FindBy(xpath = "//span[text()='Select Attribute']")
	public static WebElement Set_revenue;

	@FindBy(xpath = "//*[@id='select_attr_chosen']/div/ul/li")
	public static List<WebElement> Set_Revenue_currency_list;

	@FindBy(xpath = "//span[text()='Select Currency']")
	public static WebElement selectCurrency;

	@FindBy(xpath = "//*[@id='select_currency_chosen']/div/ul/li")
	public static List<WebElement> selectCurrency_list;

	@FindBy(xpath = ".//a[text()='Create Campaign']")
	public static WebElement createCampButton;

	@FindBy(xpath = "//span[text()='Yes']")
	public static WebElement createCamp;

}
