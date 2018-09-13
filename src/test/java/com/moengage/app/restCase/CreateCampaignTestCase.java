package com.moengage.app.restCase;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.moenagage.app.pages.actions.HomePageActions;
import com.moenagage.app.pages.actions.LoginPageActions;
import com.moengage.app.pages.HomePage;
import com.moengage.app.pages.LoginPage;
import com.moengage.utill.Constant;
import com.moengage.utill.DataProviderParameters;
import com.moengage.utill.PageHandler;
import com.moengage.utill.TestCaseDataProvider;
import com.moengage.utill.TestDataFileHandler;

public class CreateCampaignTestCase extends PageHandler {
	public TestDataFileHandler testdata;
	public LoginPage loginPage;
	public LoginPageActions loginPageActions;
	public HomePage homePage;
	public HomePageActions homePageAction;

	@BeforeClass
	public void datafetch() {
		testdata = new TestDataFileHandler();
		testdata.loadConfigProperties();
	}

	@BeforeMethod
	public void setup() {
		String urlToRun = testdata.getPropertyValue("baseUrl");
		openBrowsers(urlToRun);
	}

	@Test(dataProvider = "inputTestData", dataProviderClass = TestCaseDataProvider.class)
	  @DataProviderParameters(path = Constant.CreatCampTestData,
	      sheetName = Constant.CreatCampTestData_SheetName)
	public void createcamp() throws InterruptedException {
		homePageAction = new HomePageActions(driver);
		loginPageActions = new LoginPageActions(driver);
		loginPageActions.loginToMoengage(testdata.getPropertyValue("email"),
				testdata.getPropertyValue("password"));;
		homePageAction.clickToOpenCampaignsList();
		homePageAction.selectCreateCampaigns();
		homePageAction.SelectGenralCreate();
		homePageAction.NameTheCampaign("ramasfr");
		homePageAction.choosePlatformToRunCampaign();
		homePageAction.selectUserActions();
		homePageAction.selectUserActionsFromList("AUTO_TEST_Searched");
		homePageAction.proceedToMessaging();
		homePageAction.enterMessageTitle("@Name");
		homePageAction.enterMessage("test");
		homePageAction.selectRichContent("Coupon");
		homePageAction.enterCouponCode("RAMRAM");
		homePageAction.selectRichContent("Image");
		homePageAction.enterImageURL("asdfasdf");
		homePageAction.selectActions();
		homePageAction.selectDefaultClickAction("Navigate to a screen");
		homePageAction.selectActionsandroidnavigation();
		homePageAction
				.selectAndroidnavigation("com.moengage.demoapp.DemoScreen");
		homePageAction.setAdditionalKeyValuepairs_androidnavigation("test");
		homePageAction.enableFallBackMessage();
		homePageAction.enterFallbackMessage("test");
		homePageAction.proceedToMessaging();
		homePageAction.dateSelector("02", "October 2018");
		homePageAction.minut_updater(50);
		homePageAction.am_pm_updater("AM");
		homePageAction.setConversionGoal_Tracks();
		homePageAction.setConversionGoal_goal_event();
		homePageAction.setConversionGoal_goal_event_list("AUTO_TEST_Searched");
		homePageAction.set_revenue();
		homePageAction.setRevenuecurrencylist("amount");
		homePageAction.selectCurrency();
		homePageAction.selectCurrency_list("US Dollar - USD");
		homePageAction.createCampBtn();
		homePageAction.createCamp();
	}

	@AfterSuite
	public void TeardownTest() {
		driver.quit();
	}
}