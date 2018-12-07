package com.moengage.app.testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.moengage.utill.PageHandler;

public class Todomvc extends PageHandler {
	@Test
	public void setup() {
		openBrowsers("http://todomvc.com/examples/angularjs/#/");
		WebElement we = driver.findElement(By
				.xpath("//input[@placeholder='What needs to be done?']"));

		we.sendKeys("umseh");
		we.sendKeys(Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//label[@class='ng-binding']")));

		WebElement weToDoList = driver.findElement(By
				.xpath("//label[@class='ng-binding']"));
		System.out.println(weToDoList.getText());
		WebElement weToDoCheckBox = driver.findElement(By
				.xpath("//input[@ng-model='todo.completed']"));
		weToDoCheckBox.click();
		WebElement weComplete = driver.findElement(By
				.xpath("//a[contains(text(),'Completed')]"));
		weComplete.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//button[text()='Clear completed']")));

		WebElement weClearCompleted = driver.findElement(By
				.xpath("//button[text()='Clear completed']"));
		weClearCompleted.click();

	}
}
