import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('D:\\APK\\ClubNow-Android.apk', true)

Mobile.tap(findTestObject('Object Repository/Test Cases/android.webkit.WebView (7)'), 0)

Mobile.tap(findTestObject('Object Repository/Test Cases/android.widget.Button - Continue to Login (9)'), 0)

Mobile.tap(findTestObject('Object Repository/Test Cases/android.view.View - Login to your Account user icon Email Address lock icon Password toggle password visibility Forgot Password Sign In help icon Need Help Try Login Instructions Are you a New Member Sign me Please'), 
    0)

Mobile.tap(findTestObject('Object Repository/Test Cases/android.widget.Button - Sign In (3)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Test Cases/android.widget.TextView - Email Address is required'), 
    'Email Address is required')

Mobile.verifyElementText(findTestObject('Object Repository/Test Cases/android.widget.TextView - Password is required (1)'), 
    'Password is required')

Mobile.closeApplication()

