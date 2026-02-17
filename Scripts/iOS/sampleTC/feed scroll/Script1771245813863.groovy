import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import org.openqa.selenium.Dimension as Dimension
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

// Start app without reinstall
Mobile.startApplication('/Users/muhammadali/Downloads/nsplus.app', false)

WebUI.callTestCase(findTestCase('Android/Login/Login Member'), [:], FailureHandling.STOP_ON_FAILURE)

// Tap your Feeds button
Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - FeedsInactive'), 10)

// Get Appium driver and screen size
AppiumDriver driver = MobileDriverFactory.getDriver()

Dimension size = driver.manage().window().getSize()

// Calculate swipe coordinates dynamically
int startX = size.width / 2

int startY = ((size.height * 0.7 // start near bottom
    ) as int)

int endY = ((size.height * 0.3 // end near top
    ) as int)

// Single swipe (scroll)
Mobile.swipe(startX, startY, startX, endY)

