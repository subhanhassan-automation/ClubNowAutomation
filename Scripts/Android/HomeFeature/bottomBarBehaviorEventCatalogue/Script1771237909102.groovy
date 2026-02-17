import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.ConditionType as ConditionType

// ----------------------------
// Step 1: Call Login
// ----------------------------
WebUI.callTestCase(findTestCase('Android/Login/Login Member'), [:], FailureHandling.STOP_ON_FAILURE)
Mobile.delay(5)  // Let dashboard load

// ----------------------------
// Step 2: Dynamic Menu Locator
// ----------------------------
def menuObject = new TestObject('dynamicMenu')
menuObject.addProperty('text', ConditionType.EQUALS, 'Menu')
menuObject.addProperty('class', ConditionType.EQUALS, 'android.widget.TextView')

Mobile.waitForElementPresent(menuObject, 30)
Mobile.verifyElementExist(menuObject, 10)
Mobile.verifyElementText(menuObject, 'Menu')
Mobile.tap(menuObject, 10)
Mobile.delay(3)  // drawer animation

// ----------------------------
// Step 3: Scroll to Events Catalogue
// ----------------------------
def eventsCatalogue = new TestObject('dynamicEventsCatalogue')
eventsCatalogue.addProperty('text', ConditionType.EQUALS, 'Events Catalogue')

boolean found = false
int maxSwipes = 15
int startX = 360
int startY = 1300
int endY = 400

for (int i = 0; i < maxSwipes; i++) {
    if (Mobile.verifyElementExist(eventsCatalogue, 2, FailureHandling.OPTIONAL)) {
        println('Events Catalogue found at swipe: ' + (i + 1))
        found = true
        break
    }
    Mobile.swipe(startX, startY, startX, endY)
    Mobile.delay(1)
}

if (!found) {
    try { Mobile.takeScreenshot(FailureHandling.OPTIONAL) } catch (Exception e) { println('Screenshot skipped: ' + e.message) }
    assert false : 'Events Catalogue not found after scrolling'
}

// ----------------------------
// Step 4: Tap Events Catalogue
// ----------------------------
Mobile.waitForElementPresent(eventsCatalogue, 10)
Mobile.tap(eventsCatalogue, 10)  // Tap directly

// ----------------------------
// Step 5: Verify Events List Screen
// ----------------------------
def eventsList = new TestObject('dynamicEventsList')
eventsList.addProperty('text', ConditionType.CONTAINS, 'Events List')

// Retry mechanism for slow load
int retries = 5
boolean foundList = false

for (int i = 0; i < retries; i++) {
    if (Mobile.waitForElementPresent(eventsList, 10, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementExist(eventsList, 5)
        Mobile.verifyElementText(eventsList, 'Events List', FailureHandling.OPTIONAL)
        println("Events List screen found after retry: " + (i + 1))
        foundList = true
        break
    } else {
        println("Events List not found, retry: " + (i + 1))
        Mobile.delay(3)
    }
}

if (!foundList) {
    try { Mobile.takeScreenshot(FailureHandling.OPTIONAL) } catch (Exception e) { println("Screenshot skipped: " + e.message) }
    assert false : "Events List screen not found after retries"
}

// ----------------------------
// Step 6: Scroll to a specific event
// ----------------------------
def keikiSoft = new TestObject('dynamicKeikiSoft')
keikiSoft.addProperty('text', ConditionType.CONTAINS, 'Keiki Soft Tennis 7-10yrs')
keikiSoft.addProperty('class', ConditionType.EQUALS, 'android.widget.TextView')

boolean foundEvent = false
for (int i = 0; i < 10; i++) {
    if (Mobile.verifyElementExist(keikiSoft, 2, FailureHandling.OPTIONAL)) {
        foundEvent = true
        println('Keiki Soft Tennis found at swipe: ' + (i + 1))
        break
    }
    Mobile.swipe(startX, startY, startX, endY)
    Mobile.delay(1)
}

if (!foundEvent) {
    try { Mobile.takeScreenshot(FailureHandling.OPTIONAL) } catch (Exception e) { println('Screenshot skipped: ' + e.message) }
    println('Keiki Soft Tennis event not found')
}

// ----------------------------
// Step 7: Verify bottom results indicator (dynamic)
// ----------------------------
def resultsIndicator = new TestObject('dynamicResultsIndicator')
resultsIndicator.addProperty('text', ConditionType.CONTAINS, 'results')

// Retry mechanism
int retriesResults = 5
boolean foundResults = false

for (int i = 0; i < retriesResults; i++) {
    try { Mobile.scrollToText('results', FailureHandling.OPTIONAL) } catch(Exception e) { println("Scroll skipped: ${e.message}") }

    if (Mobile.waitForElementPresent(resultsIndicator, 5, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementExist(resultsIndicator, 5)
        // Read actual text dynamically
        def actualText = Mobile.getText(resultsIndicator, 5, FailureHandling.OPTIONAL)
        println("Bottom results indicator found: '${actualText}' at retry: " + (i + 1))
        foundResults = true
        break
    } else {
        println("Bottom results indicator not found, retry: " + (i + 1))
        Mobile.delay(2)
    }
}

if (!foundResults) {
    try { Mobile.takeScreenshot(FailureHandling.OPTIONAL) } catch (Exception e) { println("Screenshot skipped: " + e.message) }
    assert false : "Bottom results indicator not found after retries"
}

// ----------------------------
// Step 8: Close Application
// ----------------------------
Mobile.closeApplication()
