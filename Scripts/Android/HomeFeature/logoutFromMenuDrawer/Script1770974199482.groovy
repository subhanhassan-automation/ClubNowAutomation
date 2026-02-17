import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

// ----------------------------
// Step 1: Login
// ----------------------------
WebUI.callTestCase(findTestCase('Android/Login/Login Member'), [:], FailureHandling.STOP_ON_FAILURE)

// Wait for dashboard to load (VERY IMPORTANT for real device)
Mobile.delay(7)

// ----------------------------
// Step 2: Open Menu Drawer (Stable)
// ----------------------------
Mobile.waitForElementPresent(findTestObject('Object Repository/viewMenuDrawer/android.widget.TextView - Menu (14)'), 30)
Mobile.tap(findTestObject('Object Repository/viewMenuDrawer/android.widget.TextView - Menu (14)'), 10)

// Wait for drawer animation to complete
Mobile.delay(3)
Mobile.waitForElementPresent(findTestObject('Object Repository/viewMenuDrawer/android.view.View (23)'), 30)

// Screenshot for debugging
Mobile.takeScreenshot()

// ----------------------------
// Step 3: Smart Scroll Until Logout Found (Improved)
// ----------------------------
boolean logoutFound = false
int maxSwipe = 12   // Increased loop iteration (was 5)

// Device: 720x1600 -> keep swipe inside drawer safely
int startX = 360
int startY = 1300
int endX = 360
int endY = 500

for (int i = 0; i < maxSwipe; i++) {

    // Check if Logout button is visible (PRIMARY TARGET)
    if (Mobile.verifyElementExist(
            findTestObject('Object Repository/viewMenuDrawer/android.widget.Button - Logout (2)'), 
            2, 
            FailureHandling.OPTIONAL)) {
        
        logoutFound = true
        println("Logout button found at swipe attempt: " + i)
        break
    }

    // Swipe inside menu drawer (slow + stable)
    Mobile.swipe(startX, startY, endX, endY)
    Mobile.delay(2)
}

// Fail test if Logout not found after scroll attempts
if (!logoutFound) {
    Mobile.takeScreenshot()
    assert false : "Logout button not found after scrolling the menu drawer"
}

// ----------------------------
// Step 4: Tap Logout (Now Guaranteed Visible)
// ----------------------------
Mobile.waitForElementPresent(
    findTestObject('Object Repository/viewMenuDrawer/android.widget.Button - Logout (2)'), 
    20)

Mobile.tap(
    findTestObject('Object Repository/viewMenuDrawer/android.widget.Button - Logout (2)'), 
    10)

// ----------------------------
// Step 5: Verify Alert Popup
// ----------------------------
Mobile.waitForElementPresent(
    findTestObject('Object Repository/viewMenuDrawer/android.widget.TextView - Alert'), 
    20)

Mobile.verifyElementText(
    findTestObject('Object Repository/viewMenuDrawer/android.widget.TextView - Alert'), 
    'Alert!')

// ----------------------------
// Step 6: Confirm Logout
// ----------------------------
Mobile.tap(
    findTestObject('Object Repository/viewMenuDrawer/android.widget.Button - Yes (1)'), 
    10)

// ----------------------------
// Step 7: Verify Back to Login Screen
// ----------------------------
Mobile.waitForElementPresent(
    findTestObject('Object Repository/viewMenuDrawer/android.widget.TextView - Login to your Account'), 
    30)

Mobile.verifyElementText(
    findTestObject('Object Repository/viewMenuDrawer/android.widget.Button - Sign In'), 
    'Sign In')

// ----------------------------
// Step 8: Close App
// ----------------------------
Mobile.closeApplication()
