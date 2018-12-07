import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.moengage.utill.Constant;

public class ScrollTest {
	public static WebDriver driver;

	public static void openBrowsers(String URL) {
		System.setProperty("webdriver.chrome.driver",
				Constant.MAC_CHROMEDRIVER_PATH);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(URL);

	}

	public static void main(String[] args) {
		openBrowsers("https://in.via.com/flight/search?returnType=one-way&destination=IDR&bdestination=IDR&destinationL=Indore&destinationCity=&destinationCN=&source=BLR&bsource=BLR&sourceL=Bangalore&sourceCity=&sourceCN=&month=2&day=4&year=2019&date=2/4/2019&numAdults=1&numChildren=0&numInfants=0&validation_result=&domesinter=international&livequote=-1&flightClass=ALL&travType=INTL&routingType=ALL&preferredCarrier=ALL&prefCarrier=0&isAjax=false");
		WebElement webElement = driver
				.findElement(By
						.xpath("//h4[contains(text(),'Download Via Mobile App & Get Amazing Discounts')]"));
		while (webElement.isDisplayed()) {
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView();", webElement);
		}

	}

}
