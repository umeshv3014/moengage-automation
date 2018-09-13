package com.moengage.app.restCase;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.moenagage.app.pages.actions.HomePageActions;
import com.moengage.utill.Log;
import com.moengage.utill.TestCaseExcelConstant;

public class TestCaseExecuter {
	HomePageActions homePageAction;
	public TestCaseExecuter(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebDriver driver;

	public void execute(Map<Integer, String> testData) throws Exception {
		String url = null;
		boolean login = false;
		String nameOfCamoagin = testData
				.get(TestCaseExcelConstant.NameTheCampaign);
		String userAction = testData
				.get(TestCaseExcelConstant.SelectUserAction);
		try {
			homePageAction = new HomePageActions(driver);
			homePageAction.clickToOpenCampaignsList();
		} catch (Exception e) {

			Log.error(driver, e.getMessage());
			Assert.fail("failed");
		} finally {
			if (driver != null) {
			}
			driver.close();
			driver.quit();
		}
	}
}
