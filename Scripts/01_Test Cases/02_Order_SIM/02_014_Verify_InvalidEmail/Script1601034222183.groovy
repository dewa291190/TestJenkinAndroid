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

//def appPath = PathUtil.relativeToAbsolutePath(GlobalVariable.G_AndroidApp, RunConfiguration.getProjectDir())
//Mobile.startApplication(appPath, false)
WebUI.callTestCase(findTestCase('Main_Function/01_Setup/01_Setup'), [('appPackage') : 'com.smartfren', ('appActivity') : 'com.smartfren.SplashActivity'
        , ('deviceInformation') : [('platformVersion') : '11', ('deviceId') : 'emulator-5554', ('platformName') : 'Android']], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Landing_Page/btnBuyEsim'), 10)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('SIGN IN')

Mobile.tap(findTestObject('Landing_Page/btnBuyEsim'), 10)

Mobile.tap(findTestObject('Main/btnContinue'), 10)

WebUI.callTestCase(findTestCase('Main_Function/02_Order_Sim/01_Select_Package'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Main_Function/02_Order_Sim/02_Select_Number'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('SIM/inputFullName'), 10)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Tell Us About You')

Mobile.setText(findTestObject('SIM/inputFullName'), GlobalVariable.Fullname, 5)

Mobile.setText(findTestObject('SIM/InputEmail'), 'random.@mail.net', 5)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Please use a valid email address format (john.doe@gmail.com)')

Mobile.clearText(findTestObject('SIM/InputEmail'), 10)

Mobile.setText(findTestObject('SIM/InputEmail'), 'random@mail.net', 5)

Mobile.setText(findTestObject('SIM/InputConfirmEmail'), 'random2@mail.net', 5)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Please check, your email doesn\'t match')

Mobile.closeApplication()

