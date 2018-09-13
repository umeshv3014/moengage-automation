package com.moengage.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.moengage.utill.PageHandler;

public class LoginPage extends PageHandler {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "signin-email")
	public static WebElement signinEmail;

	@FindBy(id = "signin-password")
	public static WebElement signinPassword;

	@FindBy(xpath = "//form[@name='signinForm']//button[@type='submit']")
	public static WebElement signinButton;

}