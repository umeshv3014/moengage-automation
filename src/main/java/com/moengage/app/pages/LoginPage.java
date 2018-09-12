package com.moengage.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.moengage.utill.PageHandler;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "signin-email")
	static WebElement signinEmail;

	@FindBy(id = "signin-password")
	static WebElement signinPassword;

	@FindBy(xpath = "//form[@name='signinForm']//button[@type='submit']")
	static WebElement signinButton;

	public static void enterEmail(String emailId) {
		signinEmail.sendKeys(emailId);
		;
	}

	public static void enterPassword(String password) {
		signinPassword.sendKeys(password);
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
