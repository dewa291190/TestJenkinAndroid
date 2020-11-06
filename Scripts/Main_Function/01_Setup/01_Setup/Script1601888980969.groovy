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

Map deviceInformation = [('platformName') : 'Android']

//def appPath = PathUtil.relativeToAbsolutePath(GlobalVariable.G_AndroidApp, RunConfiguration.getProjectDir())
//Mobile.startApplication(appPath, false)
CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

String version = Mobile.getDeviceOSVersion()

println(version)

if (version.contains('8')) {
    Mobile.waitForElementPresent(findTestObject('Main/btnAllow'), 20)

    Mobile.tap(findTestObject('Main/btnAllow'), 10)

    Mobile.waitForElementPresent(findTestObject('Main/btnArrowWelcome'), 20)

    Mobile.tap(findTestObject('Main/btnArrowWelcome'), 10)
} else {
   Mobile.waitForElementPresent(findTestObject('Main/btnArrowWelcome'), 20)

   Mobile.tap(findTestObject('Main/btnArrowWelcome'), 10)

   Mobile.waitForElementPresent(findTestObject('Main/framePermissionController'), 20)

   Mobile.tap(findTestObject('Main/framePermissionController'), 10)
}



//def myDeviceId = RunConfiguration.getExecutionProperties().drivers.system.Mobile.deviceId.toLowerCase()
//
//println(myDeviceId)


