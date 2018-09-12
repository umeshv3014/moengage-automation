package com.moenagage.app.pages.actions;

import org.openqa.selenium.WebDriver;

import com.moengage.app.pages.HomePage;

public class HomePageActions extends HomePage {
	public WebDriver driver;

	public HomePageActions(WebDriver driver) {
		super(driver);
	}

}
