import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

WebUI.callTestCase(findTestCase('Android/Login/Login Member'), [:], FailureHandling.STOP_ON_FAILURE)

// Open menu
Mobile.tap(findTestObject('Object Repository/viewMenuDrawer/android.widget.TextView - Menu (13)'), 10)

// Wait menu drawer fully load
Mobile.waitForElementPresent(findTestObject('Object Repository/viewMenuDrawer/android.view.View (19)'), 30)

// Scroll safely (do not fail test if not found immediately)
Mobile.scrollToText('POA Credit Card', FailureHandling.OPTIONAL)

// Wait for POA element
TestObject poa = findTestObject('Object Repository/viewMenuDrawer/android.widget.TextView - POA Credit Card (1)')

Mobile.waitForElementPresent(poa, 30)

// ASSERT TEXT (Correct Way)
String poaText = Mobile.getText(poa, 10)

Mobile.verifyEqual(poaText, 'POA Credit Card')

// Continue flow
Mobile.tap(findTestObject('Object Repository/viewMenuDrawer/android.widget.Button - Logout (1)'), 10)

// Verify popup text
Mobile.verifyElementText(findTestObject('Object Repository/viewMenuDrawer/android.widget.TextView - Are you sure you want to log out'), 
    'Are you sure you want to log out?')

Mobile.tap(findTestObject('Object Repository/viewMenuDrawer/android.widget.Button - Yes'), 10)

Mobile.verifyElementText(findTestObject('Object Repository/viewMenuDrawer/android.widget.TextView - Forgot Password'), 'Forgot Password?')

Mobile.closeApplication()

