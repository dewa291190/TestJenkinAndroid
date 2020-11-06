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

Mobile.tap(findTestObject('SIM/btnPay_PaymentSmartgift'), 10)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Enter Gift card number')

Random random = new Random()

int number = 10 + random.nextInt(30)

println(number)

Mobile.setText(findTestObject('SIM/InputOVONumber'), Smartgift_Number + number, 5)

Mobile.tap(findTestObject('SIM/btnPay'), 10)

if (Mobile.verifyElementVisible(findTestObject('SIM/btnOK'), 5, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('SIM/btnOK'), 10)

    Mobile.clearText(findTestObject('SIM/InputOVONumber'), 10)

    Random random2 = new Random()

    int number2 = 10 + random2.nextInt(30)

    Mobile.setText(findTestObject('SIM/InputOVONumber'), Smartgift_Number + number2, 5)

    Mobile.tap(findTestObject('SIM/btnPay'), 10)
} else {
    Mobile.delay(1)
}

if (Mobile.verifyElementVisible(findTestObject('SIM/btnOK'), 5, FailureHandling.OPTIONAL)) {

    Mobile.tap(findTestObject('SIM/btnOK'), 10)

    Mobile.clearText(findTestObject('SIM/InputOVONumber'), 10)

    Random random3 = new Random()

    int number3 = 10 + random3.nextInt(30)

    Mobile.setText(findTestObject('SIM/InputOVONumber'), Smartgift_Number + number3, 5)

    Mobile.tap(findTestObject('SIM/btnPay'), 10)
} else {
    Mobile.delay(1)
}

Mobile.waitForElementPresent(findTestObject('SIM/txtTrackOrder'), 10)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('Payment Success')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('JNE')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('TRACK ORDER')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.checkTextContains'('COPY')

Mobile.waitForElementPresent(findTestObject('SIM/txtTrackOrder'), 10)

