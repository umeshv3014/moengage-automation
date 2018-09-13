package com.moenagage.app.pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.moengage.app.pages.HomePage;

public class HomePageActions extends HomePage {
	public WebDriver driver;

	public HomePageActions(WebDriver driver) {
		super(driver);
	}

	public void clickToOpenCampaignsList() {
		Campaigns.click();
	}

	public void enterUserActionsList(String value) {
		enterUserActionsinputBox.sendKeys(value);
	}

	public void selectUserActionsFromList(String value) {
		enterUserActionsList(value);
		for (int i = 0; i < selectUserActionsList.size(); i++) {
			WebElement list = selectUserActionsList.get(i);
			if (list.getText().equals(value)) {
				list.click();
				break;
			}
		}
	}

	public void selectUsersegmentation() {
		segmentation.click();
	}

	public void choosePlatformToRunCampaign() {
		choosePlatform.click();
	}

	public void selectCreateCampaigns() {
		CreateCampaigns.click();
	}

	public void NameTheCampaign(String nameOfCamoaign) {
		NameTheCampaign.sendKeys(nameOfCamoaign);
	}

	public void SelectGenralCreate() {
		CreateCampaignsButton.click();
	}

	public void proceedToMessaging() {
		Next.click();
	}

	public void enterMessageTitle(String message) {
		messageTitle.sendKeys(message);
		messageTitle.sendKeys(Keys.ENTER);
	}

	public void selectMessageTitle_Name_list(String value) {
		for (int i = 0; i < selectMessageTitle_Name.size(); i++) {
			WebElement list = selectMessageTitle_Name.get(i);
			if (list.getText().equals(value)) {
				list.click();
				break;
			}
			System.out.println(list.getText());
		}
	}

	public void selectUserActions() {
		userActions.click();
	}

	public void enterMessage(String message) {
		enterMessage.sendKeys(message);
	}

	public void selectRichContent(String text) {
		richContent.click();
		Select select = new Select(selectContent);
		select.selectByVisibleText(text);
	}

	public void enterCouponCode(String message) {
		couponCode.sendKeys(message);
	}

	public void enterImageURL(String url) {
		image.sendKeys(url);
	}

	public void enableFallBackMessage() {
		enableFallBackButton.click();
	}

	public void selectActions() {
		actions.click();
	}

	public void selectDefaultClickAction(String action) {
		Select select = new Select(defaultClickAction);
		select.selectByVisibleText(action);// Navigate to a screen
	}

	public void selectActionsandroidnavigation() {
		androidnavigation_div.click();
	}

	public void selectAndroidnavigation(String action) {
		for (int i = 0; i < androidnavigation.size(); i++) {
			WebElement list = androidnavigation.get(i);
			if (list.getText().equals(action)) {
				list.click();
				break;
			}
			System.out.println(list.getText());
		}
	}

	public void setAdditionalKeyValuepairs_androidnavigation(String value1) {
		for (int i = 2; i <= 3; i++) {
			WebElement xpath = driver.findElement(By
					.xpath(".//*[@id='androidnavigation']/div[2]/div[" + i
							+ "]/div[4]/button"));
			xpath.click();
		}
		for (int i = 0; i < androidnavigation_AddtionalKey.size(); i++) {
			WebElement list = androidnavigation_AddtionalKey.get(i);
			list.sendKeys(value1);
		}
	}

	public void enterFallbackMessage(String message) {
		Actions actions = new Actions(driver);
		actions.moveToElement(fallBackMessage);
		actions.click();
		actions.sendKeys(message);
		actions.build().perform();
		// fallBackMessage.sendKeys(message);
	}

	public void enterSchedulingGoalsDate(String message) {
		scheduling_Goals_date.sendKeys(message);
	}

	// select the data
	public void dateSelector(String date, String Month_Year)
			throws InterruptedException {
		scheduling_Goals_date.click();
		String str = month_year.getText();

		if (str.equals(Month_Year)) {
			System.out.println("month selected");
		} else {
			for (int i = 1; i < 12; i++) {
				next_month.click();
				Thread.sleep(1000);
				if (month_year.getText().equals(Month_Year)) {
					WebElement we = driver
							.findElement(By
									.xpath("//table[@role='grid']//tr/td[@aria-disabled='false']/button/span[contains(text(),'"
											+ date + "')]"));
					we.click();
					System.out.println("month and date selected");
					break;
				}
			}
		}

	}

	public void minut_updater(int min) {
		for (int i = 1; i <= min; i++) {
			update_Min.click();
		}
	}

	public void am_pm_updater(String am_pm) {
		am_pm_text.getText();
		if (am_pm.equals(am_pm_text.getText())) {
			System.out.println(am_pm + "selected ");
		} else {
			am_pm_text.click();
		}
	}

	// Set Conversion Goal(s)

	public void setConversionGoal_Tracks() {
		tracks.click();
	}

	public void setConversionGoal_goal_event() {
		goal_event.click();
	}

	public void setConversionGoal_goal_event_list(String value) {
		for (int i = 0; i < goal_event_list.size(); i++) {
			WebElement list = goal_event_list.get(i);
			if (list.getText().equals(value)) {
				list.click();
				break;
			}
			System.out.println(list.getText());
		}
	}

	public void set_revenue() {
		Set_revenue.click();
	}

	public void setRevenuecurrencylist(String value) {
		for (int i = 0; i < Set_Revenue_currency_list.size(); i++) {
			WebElement list = Set_Revenue_currency_list.get(i);
			if (list.getText().equals(value)) {
				list.click();
				break;
			}
			System.out.println(list.getText());
		}
	}

	public void selectCurrency() {
		selectCurrency.click();
	}

	public void selectCurrency_list(String value) {
		for (int i = 0; i < selectCurrency_list.size(); i++) {
			WebElement list = selectCurrency_list.get(i);
			if (list.getText().equals(value)) {
				list.click();
				break;
			}
			System.out.println(list.getText());
		}
	}

	public void createCampBtn() {
		createCampButton.click();
	}

	public void createCamp() {
		createCamp.click();
	}
}
