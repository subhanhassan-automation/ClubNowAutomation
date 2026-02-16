// ===== IMPORTS (REQUIRED) =====
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver
import org.openqa.selenium.Dimension
import com.kms.katalon.core.model.FailureHandling


// ===== START APPLICATION =====
Mobile.startApplication('D:\\ClubNow-Android.apk', true)


// ===== OPEN MENU (CHANGE OBJECT IF NEEDED) =====
Mobile.tap(findTestObject('Object Repository/Test Cases/android.widget.ImageView (5)'), 10)


// ===== DYNAMIC SCROLL UNTIL TEXT FOUND =====
String targetText = "Profile"   // ⭐ CHANGE TEXT YOU WANT

boolean found = false
int maxScroll = 5

AppiumDriver driver = MobileDriverFactory.getDriver()
Dimension size = driver.manage().window().getSize()

int startX = size.width / 2
int startY = (int)(size.height * 0.8)
int endY   = (int)(size.height * 0.2)

for (int i = 0; i < maxScroll; i++) {

    if (Mobile.verifyElementExist(findTestObject('Object Repository/Test Cases/Profile Element'), 2, FailureHandling.OPTIONAL)) {
        found = true
        break
    }

    Mobile.swipe(startX, startY, startX, endY)
    Mobile.delay(2)
}


// ===== TAP ELEMENT AFTER FOUND =====
if (found) {
    Mobile.tap(findTestObject('Object Repository/Test Cases/Profile Element'), 10)
} else {
    println("Element not found after scrolling")
}


// ===== CLOSE APP =====
Mobile.closeApplication()
