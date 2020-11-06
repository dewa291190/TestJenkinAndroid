package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object G_AndroidApp
     
    /**
     * <p></p>
     */
    public static Object G_ShortTimeOut
     
    /**
     * <p></p>
     */
    public static Object Fullname
     
    /**
     * <p></p>
     */
    public static Object Email
     
    /**
     * <p></p>
     */
    public static Object mobileNumber
     
    /**
     * <p></p>
     */
    public static Object NIK
     
    /**
     * <p></p>
     */
    public static Object KK
     
    /**
     * <p></p>
     */
    public static Object Info_paketTitle
     
    /**
     * <p></p>
     */
    public static Object Info_paketCost
     
    /**
     * <p></p>
     */
    public static Object Info_paketDuration
     
    /**
     * <p></p>
     */
    public static Object Phone_number
     
    /**
     * <p></p>
     */
    public static Object Info_addOn
     
    /**
     * <p></p>
     */
    public static Object deviceId
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            G_AndroidApp = selectedVariables['G_AndroidApp']
            G_ShortTimeOut = selectedVariables['G_ShortTimeOut']
            Fullname = selectedVariables['Fullname']
            Email = selectedVariables['Email']
            mobileNumber = selectedVariables['mobileNumber']
            NIK = selectedVariables['NIK']
            KK = selectedVariables['KK']
            Info_paketTitle = selectedVariables['Info_paketTitle']
            Info_paketCost = selectedVariables['Info_paketCost']
            Info_paketDuration = selectedVariables['Info_paketDuration']
            Phone_number = selectedVariables['Phone_number']
            Info_addOn = selectedVariables['Info_addOn']
            deviceId = selectedVariables['deviceId']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
