package com.moengage.app.testCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.moengage.utill.PageHandler;

public class BookMyShow extends PageHandler {
	

	@BeforeMethod
	public void setup() {
		String urlToRun = "https://in.bookmyshow.com";
		openBrowsers(urlToRun);
	}
	
	@Test
	public void test(){
		String city = "Bengaluru";
		driver.findElement(By.xpath("//*[@id='inp_RegionSearch_top']")).sendKeys(city);
		List<WebElement> cityList = driver.findElements(By.xpath("//div[@class='tt-dataset tt-dataset-result']/div"));
		for (int i = 0; i < cityList.size(); i++) {
			WebElement list = cityList.get(i);
			if (list.getText().equals(city)) {
				list.click();
				break;
			}
		}
		WebElement movieLink = driver.findElement(By.xpath("//div[@class='primary-nav']//ul/li/a[text()='Movies']"));
		clickWithExpelicityWait(driver, movieLink, 10);
		driver.close();
		driver.quit();
	}
}
