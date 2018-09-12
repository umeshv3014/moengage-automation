package com.moengage.utill;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageHandler {
	public WebDriver driver;
	public WebDriverWait wait;

	public void openBrowsers(String URL) {
		System.setProperty("webdriver.chrome.driver",
				Constant.MAC_CHROMEDRIVER_PATH);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(URL);

	}

	public static void selectFromDropDown(WebElement options, String value) {
	    Select dropDown = new Select(options);
	    dropDown.selectByVisibleText(value);
	  }
	
	public void selectOptionWithText(String textToSelect, String xpath) {
		try {
			WebElement autoOptions = driver.findElement(By.xpath(xpath));
			wait.until(ExpectedConditions.visibilityOf(autoOptions));

			List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
			for(WebElement option : optionsToSelect){
		        if(option.getText().equals(textToSelect)) {
		        	System.out.println("Trying to select: "+textToSelect);
		            option.click();
		            break;
		        }
		    }
			
		} catch (NoSuchElementException e) {
			System.out.println(e.getStackTrace());
		}
		catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
}
