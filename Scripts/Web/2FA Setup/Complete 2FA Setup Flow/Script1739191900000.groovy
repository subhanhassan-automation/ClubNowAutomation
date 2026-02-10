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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.comment('Starting Complete 2FA Setup Flow')

// Step 1: Verify 2FA setup page is displayed
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NS - 2FA Setup/text_ScanQRCode'), 10)

// Step 2: Verify QR code is visible
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_NS - 2FA Setup/img_QRCode_2FA'))

// Step 3: Verify authenticator instructions
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NS - 2FA Setup/text_AuthenticatorInstructions'), 10)

WebUI.comment('QR code and instructions verified. User would scan QR code with authenticator app.')

// Step 4: Wait for user to scan QR code (in automated testing, we would skip to verification code entry)
WebUI.delay(2)

// Step 5: Verify verification code input field is present
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NS - 2FA Setup/input_VerificationCode'), 10, 
    FailureHandling.CONTINUE_ON_FAILURE)

// Step 6: Enter verification code (in real test, this would come from test data or authenticator)
// For demonstration purposes, using a placeholder code
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NS - 2FA Setup/input_VerificationCode'), 5, 
    FailureHandling.OPTIONAL)) {
    
    WebUI.comment('Entering verification code from authenticator app')
    
    // In a real scenario, you would generate or retrieve the actual TOTP code
    // For now, this is a placeholder that demonstrates the flow
    WebUI.setText(findTestObject('Object Repository/Page_NS - 2FA Setup/input_VerificationCode'), '123456', 
        FailureHandling.CONTINUE_ON_FAILURE)
    
    // Step 7: Verify Continue/Submit button is present and clickable
    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NS - 2FA Setup/button_Continue'), 10, 
        FailureHandling.CONTINUE_ON_FAILURE)
    
    WebUI.verifyElementClickable(findTestObject('Object Repository/Page_NS - 2FA Setup/button_Continue'), 
        FailureHandling.CONTINUE_ON_FAILURE)
    
    // Step 8: Click Continue button to complete setup
    WebUI.comment('Clicking Continue button to complete 2FA setup')
    
    WebUI.click(findTestObject('Object Repository/Page_NS - 2FA Setup/button_Continue'), 
        FailureHandling.CONTINUE_ON_FAILURE)
    
    WebUI.delay(2)
}

WebUI.comment('2FA Setup Flow completed')

// Note: In production tests, you would verify success message or navigation to next page
// and potentially test the manual configuration option as an alternative flow
