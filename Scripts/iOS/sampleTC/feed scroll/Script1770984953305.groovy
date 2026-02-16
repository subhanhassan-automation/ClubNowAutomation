import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver
import org.openqa.selenium.Dimension
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

// Start app without reinstall
Mobile.startApplication('/Users/muhammadali/Downloads/nsplus.app', false)

// Tap your Feeds button
Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - FeedsInactive'), 10)

// Get Appium driver and screen size
AppiumDriver driver = MobileDriverFactory.getDriver()
Dimension size = driver.manage().window().getSize()

// Calculate swipe coordinates dynamically
int startX = size.width / 2
int startY = (int)(size.height * 0.7)  // start near bottom
int endY   = (int)(size.height * 0.3)  // end near top

// Single swipe (scroll)
Mobile.swipe(startX, startY, startX, endY)



// Close app
//Mobile.closeApplication()
