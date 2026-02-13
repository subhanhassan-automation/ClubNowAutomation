import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject as TestObject

// Login
WebUI.callTestCase(findTestCase('Android/Login/Login Member'), [:], FailureHandling.STOP_ON_FAILURE)

// Open Menu Drawer
Mobile.tap(findTestObject('Object Repository/viewMenuDrawer/android.widget.TextView - Menu (12)'), 10)

// Wait for Drawer container
Mobile.waitForElementPresent(findTestObject('Object Repository/viewMenuDrawer/android.view.View (17)'), 30)

// POA Credit Card object
TestObject poaObj = findTestObject('Object Repository/viewMenuDrawer/android.widget.TextView - POA Credit Card')

boolean isFound = false

// Manual scroll (Max 8 swipes)
for (int i = 0; i < 8; i++) {

    if (Mobile.waitForElementPresent(poaObj, 2, FailureHandling.OPTIONAL)) {
        isFound = true
        break
    }

    // Swipe up (adjusted for 720x1600 device)
    Mobile.swipe(350, 1300, 350, 500)
}

// Assert element found (instead of scrollToText crash)
assert isFound : "POA Credit Card not found after scrolling"

// Tap Settings AFTER scrolling (your flow)
Mobile.tap(findTestObject('Object Repository/viewMenuDrawer/android.widget.Button - Settings (1)'), 10)

// Wait for next screen
Mobile.waitForElementPresent(findTestObject('Object Repository/viewMenuDrawer/android.view.View (18)'), 20)

// Assertion
Mobile.verifyElementExist(findTestObject('Object Repository/viewMenuDrawer/android.view.View (18)'), 10)

// Close app
Mobile.closeApplication()
