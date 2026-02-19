import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.util.KeywordUtil
import internal.GlobalVariable

KeywordUtil.logInfo("Applying mobile caps from Global Variables: " +
	"ignoreHiddenApiPolicyError=${GlobalVariable.ignoreHiddenApiPolicyError}, " +
	"PlatformName=${GlobalVariable.platformName}, " +
	"AutomationName=${GlobalVariable.automationName}, " +
	"AutoGrantPermissions=${GlobalVariable.autoGrantPermissions}, " +
	"DontStopAppOnReset=${GlobalVariable.dontStopAppOnReset}, " +
	"AdbExecTimeout=${GlobalVariable.adbExecTimeout}, " +
	"AndroidInstallTimeout=${GlobalVariable.androidInstallTimeout}, " +
	"Uiautomator2ServerLaunchTimeout=${GlobalVariable.uiautomator2ServerLaunchTimeout}, " +
	"NewCommandTimeout=${GlobalVariable.newCommandTimeout}, " +
	"AppWaitDuration=${GlobalVariable.appWaitDuration}, " +
	"app=${GlobalVariable.appPath}, " +
	"Uiautomator2ServerInstallTimeout=${GlobalVariable.uiautomator2ServerInstallTimeout}")

RunConfiguration.setMobileDriverPreferencesProperty('PlatformName', GlobalVariable.platformName)
RunConfiguration.setMobileDriverPreferencesProperty('AutomationName', GlobalVariable.automationName)
RunConfiguration.setMobileDriverPreferencesProperty('AutoGrantPermissions', GlobalVariable.autoGrantPermissions)
RunConfiguration.setMobileDriverPreferencesProperty('ignoreHiddenApiPolicyError', GlobalVariable.ignoreHiddenApiPolicyError)
RunConfiguration.setMobileDriverPreferencesProperty('DontStopAppOnReset', GlobalVariable.dontStopAppOnReset)
RunConfiguration.setMobileDriverPreferencesProperty('AdbExecTimeout', GlobalVariable.adbExecTimeout)
RunConfiguration.setMobileDriverPreferencesProperty('AndroidInstallTimeout', GlobalVariable.androidInstallTimeout)
RunConfiguration.setMobileDriverPreferencesProperty('Uiautomator2ServerInstallTimeout', GlobalVariable.uiautomator2ServerInstallTimeout)
RunConfiguration.setMobileDriverPreferencesProperty('Uiautomator2ServerLaunchTimeout', GlobalVariable.uiautomator2ServerLaunchTimeout)
RunConfiguration.setMobileDriverPreferencesProperty('AppWaitDuration', GlobalVariable.appWaitDuration)
RunConfiguration.setMobileDriverPreferencesProperty('NewCommandTimeout', GlobalVariable.newCommandTimeout)
RunConfiguration.setMobileDriverPreferencesProperty('app', GlobalVariable.appPath)


Mobile.startApplication(GlobalVariable.appPath, true)

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

    println('Logged in using Member Number') // Email Login
} else if (hintText.equalsIgnoreCase('Email Address')) {
    Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText (5)'), 'test@globalnorthstar.com')

    Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText (6)'), '123456')

    Mobile.tap(findTestObject('Object Repository/android.widget.Button - Sign In (1)'), 0)

    println('Logged in using Email')
} else {
    println('Unknown login type detected')
}

