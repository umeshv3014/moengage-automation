package com.moengage.app.restCase;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.moengage.app.pages.HomePage;
import com.moengage.app.pages.LoginPage;
import com.moengage.utill.PageHandler;
import com.moengage.utill.TestDataFileHandler;

public class CreateCampaignTestCase extends PageHandler {
	LoginPage loginPage;
	HomePage homePage;
	TestDataFileHandler testdata;

	@BeforeClass
	public void datafetch() {
		testdata = new TestDataFileHandler();
		testdata.loadConfigProperties();
	}

	@BeforeTest
	public void setup() {
		openBrowsers(testdata.getPropertyValue("baseUrl"));
	}

	@Test(priority = 0)
	public void createcamp() throws InterruptedException {
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		loginPage.loginToMoengage("moeautouser@gmail.com", "dosalike1!");
		homePage.clickToOpenCampaignsList();
		homePage.selectCreateCampaigns();
		homePage.SelectGenralCreate();
		homePage.NameTheCampaign("ramasfr");
		homePage.choosePlatformToRunCampaign();
		homePage.selectUserActions();
		// homePage.selectUsersegmentation();
		homePage.selectUserActionsFromList("AUTO_TEST_Searched");
		homePage.proceedToMessaging();
		homePage.enterMessageTitle("@Name");
		homePage.enterMessage("test");
		homePage.selectRichContent("Coupon");
		homePage.enterCouponCode("RAMRAM");
		homePage.selectRichContent("Image");
		homePage.enterImageURL("asdfasdf");
		homePage.selectActions();
		homePage.selectDefaultClickAction("Navigate to a screen");
		homePage.selectActionsandroidnavigation();
		homePage.selectAndroidnavigation("com.moengage.demoapp.DemoScreen");
		homePage.setAdditionalKeyValuepairs_androidnavigation("test");
		homePage.enableFallBackMessage();
		homePage.enterFallbackMessage("test");
		homePage.proceedToMessaging();
		homePage.dateSelector("02", "October 2018");
		homePage.minut_updater(50);
		homePage.am_pm_updater("AM");
		homePage.setConversionGoal_Tracks();
		homePage.setConversionGoal_goal_event();
		homePage.setConversionGoal_goal_event_list("AUTO_TEST_Searched");
		homePage.set_revenue();
		homePage.setRevenuecurrencylist("amount");
		homePage.selectCurrency();
		homePage.selectCurrency_list("US Dollar - USD");
		homePage.createCampBtn();
		homePage.createCamp();
	}

	@AfterSuite
	public void TeardownTest() {
		driver.quit();
	}
}
