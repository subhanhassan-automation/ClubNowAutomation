import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver
import org.openqa.selenium.Dimension
import com.kms.katalon.core.model.FailureHandling

// start app
Mobile.startApplication('D:\\ClubNow-Android.apk', true)

// navigate to Events Catalogue (your existing steps)
Mobile.tap(findTestObject('Object Repository/Test Cases/android.widget.ImageView (8)'), 0)
Mobile.tap(findTestObject('Object Repository/Test Cases/android.widget.Button - Settings'), 0)
Mobile.tap(findTestObject('Object Repository/Test Cases/android.widget.TextView - Clubs'), 0)
Mobile.pressBack()
Mobile.pressBack()
Mobile.tap(findTestObject('Object Repository/Test Cases/android.widget.ImageView (8)'), 0)

// wait screen to load
Mobile.delay(3)

// get screen size
AppiumDriver driver = MobileDriverFactory.getDriver()
Dimension size = driver.manage().window().getSize()

int startX = size.width / 2
int startY = (int)(size.height * 0.8)
int endY   = (int)(size.height * 0.2)

// scroll screen once (or repeat if needed)
Mobile.swipe(startX, startY, startX, endY)
Mobile.delay(2)

// verify bottom bar is hidden
Mobile.verifyElementNotVisible(findTestObject('Object Repository/Test Cases/BottomBar'), 10)

// close app
Mobile.closeApplication()
