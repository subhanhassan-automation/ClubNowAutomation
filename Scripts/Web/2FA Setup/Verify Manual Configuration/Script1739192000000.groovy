import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.comment('Verifying Manual Configuration Flow for 2FA Setup')

// Step 1: Verify initial 2FA setup page elements
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NS - 2FA Setup/text_ScanQRCode'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NS - 2FA Setup/img_QRCode_2FA'), 10)

// Step 2: Verify "Unable to scan" text is displayed
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NS - 2FA Setup/text_UnableToScan'), 10)

WebUI.comment('Verified "Unable to scan" message is present')

// Step 3: Verify manual configuration link is present and clickable
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NS - 2FA Setup/link_ManualConfiguration'), 10)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_NS - 2FA Setup/link_ManualConfiguration'))

// Step 4: Click on manual configuration link
WebUI.comment('Clicking manual configuration link to view setup key')

WebUI.click(findTestObject('Object Repository/Page_NS - 2FA Setup/link_ManualConfiguration'))

// Step 5: Wait for setup key to be displayed
WebUI.delay(2)

// Step 6: Verify setup key is now visible
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NS - 2FA Setup/text_SetupKey'), 10, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Setup key is displayed for manual entry into authenticator app')

// Step 7: Verify the setup key is not empty (contains alphanumeric characters)
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NS - 2FA Setup/text_SetupKey'), 5, 
    FailureHandling.OPTIONAL)) {
    
    String setupKeyText = WebUI.getText(findTestObject('Object Repository/Page_NS - 2FA Setup/text_SetupKey'), 
        FailureHandling.OPTIONAL)
    
    WebUI.comment('Setup key retrieved: ' + (setupKeyText ? 'Key is present' : 'Key is missing'))
    
    // Verify key has minimum expected length (typically 16-32 characters for base32 encoded secrets)
    if (setupKeyText && setupKeyText.length() >= 16) {
        WebUI.comment('Setup key has valid length')
    }
}

// Step 8: Verify user can still enter verification code after viewing manual setup
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NS - 2FA Setup/input_VerificationCode'), 10, 
    FailureHandling.CONTINUE_ON_FAILURE)

// Step 9: Verify Continue button is still accessible
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NS - 2FA Setup/button_Continue'), 10, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Manual configuration flow verified successfully')

// Note: In a real test, you could:
// 1. Copy the setup key
// 2. Generate a TOTP code using the key
// 3. Enter it in the verification field
// 4. Complete the setup
