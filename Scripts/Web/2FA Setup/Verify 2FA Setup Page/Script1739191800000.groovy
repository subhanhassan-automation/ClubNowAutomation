import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Navigate to 2FA setup page (assuming user is already logged in or this is accessed from settings)
// In a real scenario, you would navigate from login or user settings
WebUI.comment('Verifying 2FA Setup Page Elements')

// Verify "Scan the QR code" heading is present
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NS - 2FA Setup/text_ScanQRCode'), 10, 
    FailureHandling.CONTINUE_ON_FAILURE)

// Verify QR code image is displayed
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NS - 2FA Setup/img_QRCode_2FA'), 10, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_NS - 2FA Setup/img_QRCode_2FA'), 
    FailureHandling.CONTINUE_ON_FAILURE)

// Verify authenticator instructions text
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NS - 2FA Setup/text_AuthenticatorInstructions'), 10, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_NS - 2FA Setup/text_AuthenticatorInstructions'), 
    'Use an authenticator app or browser extension to scan', FailureHandling.OPTIONAL)

// Verify "Unable to scan" text is present
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NS - 2FA Setup/text_UnableToScan'), 10, 
    FailureHandling.CONTINUE_ON_FAILURE)

// Verify manual configuration link is present
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NS - 2FA Setup/link_ManualConfiguration'), 10, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_NS - 2FA Setup/link_ManualConfiguration'), 
    FailureHandling.CONTINUE_ON_FAILURE)

// Optional: Click manual configuration link to verify setup key display
WebUI.comment('Clicking manual configuration link to view setup key')

WebUI.click(findTestObject('Object Repository/Page_NS - 2FA Setup/link_ManualConfiguration'), 
    FailureHandling.OPTIONAL)

// Wait for setup key to be displayed
WebUI.delay(2)

// Verify setup key is displayed after clicking manual configuration
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NS - 2FA Setup/text_SetupKey'), 10, 
    FailureHandling.OPTIONAL)

WebUI.comment('2FA Setup Page verification completed successfully')
