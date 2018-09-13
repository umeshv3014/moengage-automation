package com.moenagage.app.pages.actions;

import org.openqa.selenium.WebDriver;

import com.moengage.app.pages.LoginPage;

public class LoginPageActions extends LoginPage {

	public LoginPageActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void enterPassword(String password) {
		signinPassword.sendKeys(password);
	}

	public static void enterEmail(String emailId) {
		signinEmail.sendKeys(emailId);
	}

	public static void clickLoginBtn() {
		signinButton.click();
	}

	public void loginToMoengage(String emailID, String password) {
		enterEmail(emailID);
		enterPassword(password);
		clickLoginBtn();
	}
}
