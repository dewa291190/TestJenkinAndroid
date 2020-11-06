import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

Mobile.tap(findTestObject('Landing_Page/btnSignIn'), 10)

Mobile.waitForElementPresent(findTestObject('SIgnIn/inputEmail'), 10)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Don\'t have an account yet?')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Forgot email or number?')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Forgot password?')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Sign Up')

Mobile.setText(findTestObject('SIgnIn/inputEmail'), 'mysfqa@gmail.com', 10)

Mobile.setText(findTestObject('SIgnIn/inputPassw'), 'Test1234', 10)

Mobile.tap(findTestObject('Landing_Page/btnSignIn'), 10)

Mobile.waitForElementPresent(findTestObject('Main/btnAllow'), 10)

Mobile.tap(findTestObject('Main/btnAllow'), 10)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Homepage/frameBanner'), 20)

Mobile.pressBack()

//if (Mobile.verifyElementVisible(findTestObject('SIM/btnOK'), 10, FailureHandling.OPTIONAL)) {
//	Mobile.tap(findTestObject('SIM/btnOK'), 10)
//} else {
//	Mobile.delay(1)
//}
Mobile.verifyElementVisible(findTestObject('Homepage/txtMyActivePlan'), 10)

