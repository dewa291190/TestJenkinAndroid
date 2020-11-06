package com.mobile.keywords
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.TouchAction
import org.openqa.selenium.WebElement

class action {
	AppiumDriver driver;

	action() {
		this.driver = MobileDriverFactory.getDriver()
	}

	private scrollEntireList() {
		// very specific to android and the type of element that makes up your dropdowns
		ArrayList listElement = driver.findElementsByClassName("android.widget.TextView")
		TouchAction touchAction = new TouchAction(driver)
		def bottomElement = listElement[listElement.size() - 1]
		def topElement = listElement[0]
		// Press and scroll from the last element in the list all the way to the top
		touchAction.press(bottomElement).moveTo(topElement).release().perform();
	}

	@Keyword
	def boolean scrollListToElementWithText() {
		MobileElement elementToClick = (MobileElement) driver
		String text = "your text"
		WebElement el = driver.findElement(MobileBy
							.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().scrollIntoView("
									+ "new UiSelector().text(\""+text+"\"));"));
		
		WebElement abc = driver.findElement(By.xpath("//android.widget.TextView[@text='Delivery Method']"));
		
		
		int x = abc.getLocation().getX();
		int y = abc.getLocation().getY();
		
		TouchAction action = new TouchAction(driver);
		action.press(x,y).moveTo(x+90,y).release().perform();
		
//		boolean isElementFound = false;
//		while (isElementFound == false) {
//			// very specific to android and the type of element that makes up your dropdowns
//			ArrayList listElement = driver.findElementsByClassName("android.widget.TextView")
//			for (int i = 0; i<listElement.size(); i++) {
//				String textItem = ((MobileElement)listElement[i]).getText()
//				if (textItem == elementText) {
//					isElementFound = true;
//					return true;
//				}
//			}
//			scrollEntireList()
//		}
	}}