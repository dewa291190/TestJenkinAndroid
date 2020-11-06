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

Mobile.tap(findTestObject('SIM/btnPay_PaymentGopay'), 10)

Mobile.tap(findTestObject('SIM/btnPay'), 10)

if (Mobile.verifyElementVisible(findTestObject('TopUp/btnLanjut_Webview'), 4, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('TopUp/btnLanjut_Webview'), 20)

    Mobile.tap(findTestObject('TopUp/btnPayGopay_Webview'), 10)

    Mobile.tap(findTestObject('SIM/btnPayWebview'), 10)

    Mobile.verifyElementVisible(findTestObject('SIM/txtGopayPaymentSuccess'), 10)

    Mobile.pressBack()

    Mobile.pressBack()

    Mobile.pressBack()

    Mobile.pressBack()
} else {
    Mobile.delay(1)
}

Mobile.waitForElementPresent(findTestObject('SIM/btnCheckPayment'), 10)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('GoPay')

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

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Buy Add On')

