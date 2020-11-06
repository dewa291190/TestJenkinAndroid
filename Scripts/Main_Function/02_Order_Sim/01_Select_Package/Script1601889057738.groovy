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

Mobile.waitForElementPresent(findTestObject('Main/btnContinue'), 10)

Mobile.tap(findTestObject('SIM/txtPowerUp12GB'), 10)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Select Your Package')

not_run: CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Limited time only! - Extra 1GB bonus will be added to your plan.')

Info_paketTitle = Mobile.getText(findTestObject('SIM/txtPowerUp12GB'), 10)

Info_paketCost = Mobile.getText(findTestObject('SIM/txtPowerUp12GBCost'), 10)

Info_paketDuration = Mobile.getText(findTestObject('SIM/txtPowerUp12GBDuration'), 10)

GlobalVariable.Info_paketTitle = Info_paketTitle

GlobalVariable.Info_paketCost = Info_paketCost

GlobalVariable.Info_paketDuration = Info_paketDuration

Mobile.tap(findTestObject('Main/btnContinue'), 10)

Mobile.waitForElementPresent(findTestObject('SIM/txtAddOn4GB'), 10)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Get Your Add-on')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Skip for now')

Mobile.tap(findTestObject('SIM/txtAddOn4GB'), 10)

Info_addOn = Mobile.getText(findTestObject('SIM/txtAddOn4GB'), 10)

GlobalVariable.Info_addOn = Info_addOn

Mobile.tap(findTestObject('Main/btnContinue'), 10)

