package com.moengage.app;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.moengage.utill.Constant;
import com.moengage.utill.PageHandler;

public class testClass {
	static WebDriver driver;
	PageHandler pageHandler;

	public void openBrowser(String browserName, String Url) {
		browserName.equalsIgnoreCase("chrome");
		String osName = System.getProperty("os.name");
		if (StringUtils.containsIgnoreCase(osName, "windows")) {
			System.setProperty("webdriver.chrome.driver",
					Constant.WINDOWS_CHROMEDRIVER_PATH);
		} else if (StringUtils.containsIgnoreCase(osName, "mac")) {
			System.setProperty("webdriver.chrome.driver",
					Constant.MAC_CHROMEDRIVER_PATH);
		}
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		// options.addArguments("window-size=1400,800");
		// options.addArguments("headless");
		options.setExperimentalOption("prefs", prefs);
		// options.addArguments("--disable-extensions");
		options.addArguments("--dns-prefetch-disable");

		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.get(Url);

	}
	
	public void login(String userid, String password, WebDriver driver){
		driver.findElement(By.id("signin-email")).sendKeys(userid);
		driver.findElement(By.id("signin-password")).sendKeys(password);
		driver.findElement(By.xpath("//form[@name='signinForm']//button[@type='submit']")).click();
	}
public void createCampigns(){
	driver.findElement(By.xpath("")).click();
	driver.findElement(By.xpath("")).click();
	driver.findElement(By.xpath("")).click();
	driver.findElement(By.xpath("")).sendKeys("");
	driver.findElement(By.xpath("")).click();
	//target audience
	
	driver.findElement(By.xpath("")).click();  //select form list target audience user bhevaiour AUTO_TEST_Searched.
	driver.findElement(By.xpath("")).click();//next button
	
	//messaging section
	driver.findElement(By.xpath("")).sendKeys("@");
	driver.findElement(By.xpath("")).click();
	//click on enable fallBackMessage
	driver.findElement(By.xpath("")).click();
	//Fill Message title and message under fallback
	driver.findElement(By.xpath("")).sendKeys("text");
	driver.findElement(By.xpath("")).sendKeys("text");
	driver.findElement(By.xpath("")).sendKeys("text");
	//next
	driver.findElement(By.xpath("")).click();
	
}
	public static void main(String[] args) {
		testClass tc = new testClass();
		tc.openBrowser("chrome", "https://app.moengage.com/v3/auth/#/");
		tc.login("moeautouser@gmail.com", "dosalike1!", driver);
	}

}
