// ===== IMPORTS =====
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver
import org.openqa.selenium.Dimension


// ===== START APPLICATION =====
Mobile.startApplication('D:\\ClubNow-Android.apk', true)


// ===== TAP NOTIFICATION BELL ICON =====
Mobile.tap(findTestObject('Object Repository/Test Cases/android.widget.Image - bell.5c155405e1574cd86d089a6a7cfb40d5'), 0)


// ===== LIGHT/SAFE SCROLL THROUGH NOTIFICATIONS =====
int smallScrolls = 10   // number of small scroll steps
AppiumDriver driver = MobileDriverFactory.getDriver()
Dimension size = driver.manage().window().getSize()

int startX = size.width / 2
int scrollStartY = (int)(size.height * 0.6)
int scrollEndY   = (int)(size.height * 0.55)  // VERY small distance

for (int i = 0; i < smallScrolls; i++) {
    Mobile.swipe(startX, scrollStartY, startX, scrollEndY)
    Mobile.delay(1)  // tiny pause between swipes
}

// ===== WAIT ON NOTIFICATION SCREEN =====
Mobile.delay(5)  // keep notifications visible

// ===== CLOSE APPLICATION =====
Mobile.closeApplication()
