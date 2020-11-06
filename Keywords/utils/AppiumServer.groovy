package utils

import io.appium.java_client.service.local.AppiumDriverLocalService

public class AppiumServer {
	AppiumDriverLocalService appiumService;
	public AppiumServer() {
		appiumService = AppiumDriverLocalService.buildDefaultService();
	}
	public void startAppiumServer() {
		appiumService.start();
	}

	public void stopAppiumServer() {
		appiumService.stop();
	}
}
