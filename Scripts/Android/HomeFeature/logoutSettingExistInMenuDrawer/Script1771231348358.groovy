import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FailureHandling

// ----------------------------
// Step 1: Login
// ----------------------------
WebUI.callTestCase(findTestCase('Android/Login/Login Member'), [:], FailureHandling.STOP_ON_FAILURE)

// Real device stability wait
WebUI.delay(7)

// ----------------------------
// Step 2: Open Menu Drawer
// ----------------------------
Mobile.waitForElementPresent(
    findTestObject('Object Repository/viewMenuDrawer/android.widget.TextView - Menu (15)'), 
    30
)

Mobile.tap(
    findTestObject('Object Repository/viewMenuDrawer/android.widget.TextView - Menu (15)'), 
    10
)

// Wait for drawer animation (VERY IMPORTANT)
Mobile.delay(4)
Mobile.takeScreenshot()

// ----------------------------
// Step 3: BEST FIX — ANDROID SCROLLABLE (Drawer Safe)
// ----------------------------
boolean poaFound = false

try {
    // This scrolls inside ANY scrollable container (drawer included)
    Mobile.scrollToText('POA Credit Card', FailureHandling.OPTIONAL)

    if (Mobile.verifyElementExist(
        findTestObject('Object Repository/viewMenuDrawer/android.widget.TextView - POA Credit Card (3)'), 
        5, 
        FailureHandling.OPTIONAL)) {
        
        poaFound = true
        println("POA Credit Card found using Android native scroll")
    }

} catch (Exception e) {
    println("Native scroll failed: " + e.getMessage())
}

// ----------------------------
// Step 4: FALLBACK — Precise Drawer Swipe (LEFT SIDE ONLY)
// ----------------------------
if (!poaFound) {

    def poaObject = findTestObject(
        'Object Repository/viewMenuDrawer/android.widget.TextView - POA Credit Card (3)'
    )

    int maxSwipe = 15

    // IMPORTANT: Drawer is on LEFT side, not center
    int startX = 150
    int endX = 150
    int startY = 1300
    int endY = 350

    for (int i = 0; i < maxSwipe; i++) {

        if (Mobile.verifyElementExist(poaObject, 2, FailureHandling.OPTIONAL)) {
            poaFound = true
            println("POA Credit Card found at swipe attempt: " + (i + 1))
            break
        }

        // Swipe inside drawer area only
        Mobile.swipe(startX, startY, endX, endY)
        Mobile.delay(1)
    }
}

// ----------------------------
// Step 5: HARD DEBUG CHECK (Prevents False Failures)
// ----------------------------
if (!poaFound) {
    Mobile.takeScreenshot()
    println("DEBUG: Possible reasons ->")
    println("1. POA menu not available for this login role")
    println("2. Wrong TestObject locator")
    println("3. Text mismatch (e.g., 'POA Card' vs 'POA Credit Card')")
    
    assert false : "POA Credit Card menu not found after proper drawer scrolling"
}

// ----------------------------
// Step 6: Verify POA Credit Card Text
// ----------------------------
def poaObject = findTestObject(
    'Object Repository/viewMenuDrawer/android.widget.TextView - POA Credit Card (3)'
)

Mobile.waitForElementPresent(poaObject, 20)
Mobile.verifyElementText(poaObject, 'POA Credit Card')

// ----------------------------
// Step 7: Verify Settings Exists
// ----------------------------
Mobile.waitForElementPresent(
    findTestObject('Object Repository/viewMenuDrawer/android.widget.TextView - Settings'), 
    20
)

Mobile.verifyElementText(
    findTestObject('Object Repository/viewMenuDrawer/android.widget.TextView - Settings'), 
    'Settings'
)

// ----------------------------
// Step 8: Close App
// ----------------------------
Mobile.closeApplication()
