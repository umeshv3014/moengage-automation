package com.moengage.app.testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.moengage.utill.PageHandler;
import com.moengage.utill.TestDataFileHandler;

public class selectBus extends PageHandler {
	public TestDataFileHandler testdata;

	@BeforeMethod
	public void setup() {
		String urlToRun = "https://in.via.com";
		openBrowsers(urlToRun);
	}
	@Test(retryAnalyzer = retryFailTestCase.retryTryAnalyser.class)
	public void test() {
	WebElement we =	driver.findElement(By.xpath("//*"));
		System.out.println(we.getText());
	}

}
