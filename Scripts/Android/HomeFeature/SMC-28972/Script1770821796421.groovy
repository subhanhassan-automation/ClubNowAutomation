// ===== IMPORTS (REQUIRED) =====
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver
import org.openqa.selenium.Dimension
import com.kms.katalon.core.model.FailureHandling


// ===== START APPLICATION =====
Mobile.startApplication('D:\\ClubNow-Android.apk', true)

// ===== TAP NOTIFICATION BELL ICON =====
Mobile.tap(findTestObject('Object Repository/Test Cases/android.widget.Image - bell.5c155405e1574cd86d089a6a7cfb40d5'),
	0)

// ===== GENTLE SCROLL THROUGH NOTIFICATIONS =====
int gentleScrolls = 15   // number of small scroll steps

AppiumDriver driver = MobileDriverFactory.getDriver()
Dimension size = driver.manage().window().getSize()

// Middle of screen for safe swipe
int startX = size.width / 2
int startY = (int)(size.height * 0.55)  // start slightly lower
int endY   = (int)(size.height * 0.50)  // end slightly higher

for (int i = 0; i < gentleScrolls; i++) {
    Mobile.swipe(startX, startY, startX, endY)
    Mobile.delay(1)  // short pause between each micro-scroll
}

// ===== WAIT ON NOTIFICATION SCREEN =====
Mobile.delay(5)  // keep screen visible

// ===== CLOSE APPLICATION =====
Mobile.closeApplication()


