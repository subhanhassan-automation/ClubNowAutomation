import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling

Mobile.startApplication('D:\\ClubNow-Android.apk', true)

Mobile.tap(findTestObject('Object Repository/Test Cases/android.webkit.WebView (6)'), 0)

Mobile.tap(findTestObject('Object Repository/Test Cases/android.widget.Button - Continue to Login (7)'), 0)

// Get hint text from first input field
String hintText = Mobile.getAttribute(findTestObject('Object Repository/android.widget.EditText (5)'), 'hint', 5)

println('Hint Found: ' + hintText)

if (hintText.equalsIgnoreCase('Member Number')) {
    // Member Number Login
    Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText (5)'), '10124')

    Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText (6)'), '123456')

    Mobile.tap(findTestObject('Object Repository/android.widget.Button - Sign In (1)'), 0)

    println('Logged in using Member Number' // Email Login
        )
} else if (hintText.equalsIgnoreCase('Email Address')) {
    Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText (5)'), 'test@globalnorthstar.com')

    Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText (6)'), '123456')

    Mobile.tap(findTestObject('Object Repository/android.widget.Button - Sign In (1)'), 0)

    println('Logged in using Email')
} else {
    println('Unknown login type detected')
}

