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
import java.text.DecimalFormat as DecimalFormat

String pulsa = Mobile.getText(findTestObject('Homepage/txtPulsa'), 10)

int number = Integer.parseInt(pulsa.replace('.', ''))

println(number)

Mobile.scrollToText('BUY')

Mobile.tap(findTestObject('Plan/btnBuy'), 10)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Plan/txtInternet'), 10)

Mobile.tap(findTestObject('Plan/txtDaily9K'), 10)

Mobile.tap(findTestObject('Plan/btnBuyNow'), 10)

Mobile.tap(findTestObject('Plan/btnPayment_Pulsa'), 10)

Mobile.tap(findTestObject('SIM/btnPay'), 10)

Mobile.waitForElementPresent(findTestObject('SIM/btnOK'), 20)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('We have received your payment. Your purchased item will be activated after you received the SMS notification')

Mobile.tap(findTestObject('SIM/btnOK'), 10)

Mobile.waitForElementPresent(findTestObject('Homepage/frameBanner'), 20)

Mobile.pressBack()

Mobile.scrollToText('Music')

Mobile.scrollToText('My Active Plan')

Mobile.tap(findTestObject('Homepage/txtMyActivePlan'), 10)

Mobile.waitForElementPresent(findTestObject('Plan/btnBuy'), 20)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Super 4G Unlimited Daily 9K')

Mobile.tap(findTestObject('Plan/btnDeactive'), 10)

Mobile.tap(findTestObject('Plan/btnConfirm'), 10)

Mobile.waitForElementPresent(findTestObject('Plan/btnBackMainScren'), 20)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Non aktif paket berhasil')

Mobile.tap(findTestObject('Plan/btnBackMainScren'), 10)

Mobile.waitForElementPresent(findTestObject('Homepage/frameBanner'), 20)

Mobile.pressBack()

int deduct = 9000

int Result = number - deduct

String balance = Integer.toString(Result)

println(balance)

String str = String.valueOf(balance)

Integer position = str.length() - 3

String Pulsa = (str.substring(0, position) + '.') + str.substring(position)

System.out.println(Pulsa)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'(Pulsa)

