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

Mobile.waitForElementPresent(findTestObject('SIM/inputFullName'), 10)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Tell Us About You')

Mobile.setText(findTestObject('SIM/inputFullName'), GlobalVariable.Fullname, 5)

Mobile.setText(findTestObject('SIM/InputEmail'), GlobalVariable.Email, 5)

Mobile.setText(findTestObject('SIM/InputConfirmEmail'), GlobalVariable.Email, 5)

Mobile.setText(findTestObject('SIM/InputMobileNumber'), GlobalVariable.mobileNumber, 5)

Mobile.tap(findTestObject('Main/btnContinue'), 10)

