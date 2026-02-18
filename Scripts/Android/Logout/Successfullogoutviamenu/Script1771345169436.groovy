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

// Call Login Test Case
WebUI.callTestCase(findTestCase('Android/Login/Login Member'), [:], FailureHandling.STOP_ON_FAILURE)

// Wait & verify Home screen
Mobile.waitForElementPresent(findTestObject('Object Repository/Successfullogoutviamenu/android.widget.TextView - Home'), 30)
Mobile.verifyElementVisible(findTestObject('Object Repository/Successfullogoutviamenu/android.widget.TextView - Home'), 10)

// Open menu
Mobile.tap(findTestObject('Object Repository/Successfullogoutviamenu/android.widget.ImageView'), 10)

// Scroll to Logout option
Mobile.scrollToText('Logout')

// Tap Logout
Mobile.tap(findTestObject('Object Repository/Successfullogoutviamenu/android.widget.Button - Logout'), 10)

// Wait for confirmation alert
Mobile.waitForElementVisible(findTestObject('Object Repository/Successfullogoutviamenu/android.widget.TextView - Alert'), 10)

// Confirm logout
Mobile.tap(findTestObject('Object Repository/Successfullogoutviamenu/android.widget.Button - Yes'), 10)

// Wait & verify Sign In screen
Mobile.waitForElementVisible(findTestObject('Object Repository/Successfullogoutviamenu/android.widget.Button - Sign In'), 20)
Mobile.verifyElementVisible(findTestObject('Object Repository/Successfullogoutviamenu/android.widget.Button - Sign In'), 5)

// Close application
Mobile.closeApplication()
