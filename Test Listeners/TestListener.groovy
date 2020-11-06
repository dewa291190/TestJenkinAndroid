import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.context.TestSuiteContext

import io.appium.java_client.service.local.AppiumDriverLocalService
import utils.AppiumServer

class Listeners {
	
	AppiumServer appiumServer = new AppiumServer();
	
	/**
	 * Executes before every test suite starts.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	@BeforeTestCase
	def sampleBeforeTestSuite(TestSuiteContext testSuiteContext) {
		appiumServer.startAppiumServer();
	}

	/**
	 * Executes after every test suite ends.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	@AfterTestCase
	def sampleAfterTestSuite(TestSuiteContext testSuiteContext) {
		appiumServer.stopAppiumServer();
	}
}