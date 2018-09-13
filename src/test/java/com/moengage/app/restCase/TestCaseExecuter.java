package com.moengage.app.restCase;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.moengage.utill.Log;
import com.moengage.utill.TestCaseExcelConstant;

public class TestCaseExecuter {
	public TestCaseExecuter(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebDriver driver;

	public void execute(Map<Integer, String> testData) throws Exception {
		String url = null;
		boolean login = false;
		String paymentMode = testData
				.get(TestCaseExcelConstant.COL_PAYMENT_MODE);
		String paymentType = testData
				.get(TestCaseExcelConstant.COL_PAYMENT_TYPE);
		try {
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
