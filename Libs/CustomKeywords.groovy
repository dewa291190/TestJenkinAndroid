
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import java.util.Map



def static "com.mobile.keywords.ApplicationBehavior.startInstalledApplication"(
    	String mobileType	
     , 	Map deviceInformation	
     , 	String appPackage	
     , 	String appActivity	) {
    (new com.mobile.keywords.ApplicationBehavior()).startInstalledApplication(
        	mobileType
         , 	deviceInformation
         , 	appPackage
         , 	appActivity)
}


def static "com.mobile.keywords.ApplicationBehavior.checkTextContains"(
    	String text	) {
    (new com.mobile.keywords.ApplicationBehavior()).checkTextContains(
        	text)
}


def static "com.mobile.keywords.action.scrollListToElementWithText"() {
    (new com.mobile.keywords.action()).scrollListToElementWithText()
}
