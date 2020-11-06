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

Random random = new Random()

int number = 100 + random.nextInt(30)

int result = number - 2

String number2 = String.valueOf(number)

String result2 = String.valueOf(result)

Mobile.waitForElementPresent(findTestObject('Cashbac/btnExchange'), 10)

Mobile.tap(findTestObject('Cashbac/btnExchange'), 10)

Mobile.waitForElementPresent(findTestObject('Cashbac/txtCashbac'), 10)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Point Exchange')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('My SmartPoin')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Exchange History')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Balance')

Mobile.tap(findTestObject('Cashbac/txtCashbac'), 10)

Mobile.waitForElementPresent(findTestObject('Cashbac/btnExchange'), 10)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Cashbac')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('SmartPoin')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Balance')

Mobile.setText(findTestObject('Cashbac/inputTop'), number2, 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'(result2)

Mobile.tap(findTestObject('Cashbac/btnExchange'), 10)

Mobile.tap(findTestObject('Cashbac/btnCONTINUE'), 10)

Mobile.waitForElementPresent(findTestObject('Cashbac/btnDONE'), 10)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Exchange Successful')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('You\'ve got')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'(result2)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('SmartPoin')

Mobile.tap(findTestObject('Cashbac/btnDONE'), 10)

Mobile.waitForElementPresent(findTestObject('Cashbac/txtCashbac'), 10)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Point Exchange')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Syncing data in process')

Mobile.tap(findTestObject('Cashbac/txtPoinExchange'), 10)

Mobile.waitForElementPresent(findTestObject('Cashbac/txtExchangeHistory'), 10)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Point Exchange')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'(result2)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'(number2)

