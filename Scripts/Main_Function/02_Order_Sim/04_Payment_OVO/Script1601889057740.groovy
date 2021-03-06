import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

Mobile.tap(findTestObject('SIM/btnPay_PaymentOVO'), 10)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Enter your registered OVO number')

Mobile.setText(findTestObject('SIM/InputOVONumber'), OVO_Number, 5)

Mobile.tap(findTestObject('SIM/btnPay'), 10)

Mobile.waitForElementPresent(findTestObject('SIM/btnCheckPayment'), 10)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Payment Method')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('See Payment Instruction')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('CHECK PAYMENT STATUS')

Mobile.tap(findTestObject('SIM/btnSeePaymentIntruction'), 10)

Mobile.waitForElementPresent(findTestObject('SIM/txtPaymentInstruction'), 10)

Mobile.verifyElementVisible(findTestObject('SIM/FramePaymentIntruction'), 10)

Mobile.tap(findTestObject('SIM/btnBack'), 10)

Mobile.tap(findTestObject('SIM/btnCheckPayment'), 10)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Your Order Details')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Order ID')

def myDeviceId = RunConfiguration.getExecutionProperties().drivers.system.Mobile.deviceId.toLowerCase()

println(myDeviceId)

if (myDeviceId == '192.168.1.6:5555') {
    Mobile.openNotifications()

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('OVO')

    Mobile.tap(findTestObject('SIM/3rdParty_OVO/notifOVO'), 10)

    Mobile.tap(findTestObject('SIM/3rdParty_OVO/btnCancel'), 10)

    Mobile.setText(findTestObject('SIM/3rdParty_OVO/inputPIN'), '141507', 3)

    Mobile.waitForElementPresent(findTestObject('SIM/3rdParty_OVO/txtMYSF'), 10, FailureHandling.STOP_ON_FAILURE)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Konfirmasi Pembayaran')

    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('96.000')

    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Lihat Detail')

    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('OVO Cash')

    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('OVO Points')
} else if (myDeviceId == 'RR8N205YN6V') {
    Mobile.openNotifications()

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('OVO')

    Mobile.tap(findTestObject('SIM/3rdParty_OVO/notifOVO'), 10)

    Mobile.tap(findTestObject('SIM/3rdParty_OVO/btnCancel'), 10)

    Mobile.setText(findTestObject('SIM/3rdParty_OVO/inputPIN'), '141507', 3)

    Mobile.waitForElementPresent(findTestObject('SIM/3rdParty_OVO/txtMYSF'), 10, FailureHandling.STOP_ON_FAILURE)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Konfirmasi Pembayaran')

    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('96.000')

    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Lihat Detail')

    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('OVO Cash')

    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('OVO Points')
} else {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)
}

