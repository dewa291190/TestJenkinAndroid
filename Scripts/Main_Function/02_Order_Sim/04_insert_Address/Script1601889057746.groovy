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

Mobile.waitForElementPresent(findTestObject('SIM/txtDeliveryAddress'), 10)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Enter City or District')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Enter the city or ditrict above so we can find your location')

Mobile.setText(findTestObject('SIM/inputFullName'), 'Depok', 0)

Mobile.tap(findTestObject('SIM/txtBekasiBarat'), 10, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Postal Code')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Detailed Address')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Delivery Method')

Mobile.tap(findTestObject('SIM/txtPostalCodeValue'), 10, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('SIM/InputDetailAddress'), 'Kalibata City', 0)

'Get Device Height and Store in device_height variable'
device_Height = Mobile.getDeviceHeight()

'Get Width Height and Store in device_Width variable'
device_Width = Mobile.getDeviceWidth()

'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
int startX = device_Width / 2

'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
int endX = startX

'Storing the startY value'
int startY = device_Height * 0.30

'Storing the endY value'
int endY = device_Height * 0.70

'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

//
//
//'Swipe Vertical from bottom to top'
//
//Mobile.swipe(startX, startY, endX, endY)
Mobile.tap(findTestObject('SIM/txtDeliveryMethode'), 10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('SIM/box_SelectNumber'), 10)

Mobile.tap(findTestObject('Main/btnContinue'), 10)

