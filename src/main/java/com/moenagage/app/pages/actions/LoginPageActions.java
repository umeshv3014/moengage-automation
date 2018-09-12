package com.moenagage.app.pages.actions;

import org.openqa.selenium.WebDriver;

import com.moengage.app.pages.LoginPage;

public class LoginPageActions extends LoginPage {
	public WebDriver driver;

	public LoginPageActions(WebDriver driver) {
		super(driver);
	}

}
