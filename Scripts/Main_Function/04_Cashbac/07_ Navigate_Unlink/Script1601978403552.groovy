import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.waitForElementPresent(findTestObject('Cashbac/btnLink'), 10)

Mobile.tap(findTestObject('Cashbac/btnLink'), 10)

Mobile.waitForElementPresent(findTestObject('Cashbac/btnLinkYourCashbac'), 10)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Link Cashbac')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Link your Cashbac account with your MySF account')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Learn More')

Mobile.pressBack()

Mobile.tap(findTestObject('Cashbac/btnRedeem'), 10)

Mobile.tap(findTestObject('Cashbac/btnPointExchange'), 10)

Mobile.waitForElementPresent(findTestObject('Cashbac/btnLinkYourCashbac'), 10)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Link Cashbac')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Link your Cashbac account with your MySF account')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Learn More')

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Cashbac/txtCashbac'), 10)

Mobile.verifyElementNotVisible(findTestObject('Cashbac/txtPoinExchange'), 5)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('REDEEM')

