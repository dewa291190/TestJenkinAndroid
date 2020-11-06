package com.mobile.keywords

import org.openqa.selenium.remote.DesiredCapabilities

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.appium.driver.AppiumDriverManager
import com.kms.katalon.core.mobile.driver.MobileDriverType
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import com.kms.katalon.core.webui.driver.DriverFactory
import io.appium.java_client.MobileDriver
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.AppiumDriver
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory



public class ApplicationBehavior {

	DesiredCapabilities dc = new DesiredCapabilities();

	@Keyword
	def startInstalledApplication(String mobileType, Map deviceInformation, String appPackage, String appActivity) {
		dc.setCapability("appPackage", appPackage);
		dc.setCapability("appActivity", appActivity);
		deviceInformation.each{ key, value ->
			dc.setCapability("${key}", "${value}");
		}
		if (mobileType == "Android"){
			AppiumDriverManager.createMobileDriver(MobileDriverType.ANDROID_DRIVER, dc, new URL("http://localhost:4723/wd/hub"));
		}
		else if (mobileType == "iOS") {
			AppiumDriverManager.createMobileDriver(MobileDriverType.IOS_DRIVER, dc, new URL("http://localhost:4723/wd/hub"));
		}
	}


	@Keyword
	def checkTextContains(String text) {
		AppiumDriver driver = MobileDriverFactory.getDriver()
		if(driver.getPageSource().contains(text)) {
			System.out.println("Text found");
		}
		else {
			Assert.fail("Text doesn't found");
		}
	}
}


