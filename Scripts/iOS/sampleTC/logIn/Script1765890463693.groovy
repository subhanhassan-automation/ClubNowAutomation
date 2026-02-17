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

Mobile.startApplication('/Users/muhammadali/Downloads/nsplus.app', false)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeTextField - LandingViewController.txtFieldClubName'), 0)
Mobile.sendKeys(findTestObject('Object Repository/XCUIElementTypeTextField - LandingViewController.txtFieldClubName'), 'aqdas')

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - LandingViewController.connectBtn'), 0)
Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Continue to Login'), 0)

// 🔹 Get placeholder or value of first login field
String fieldType = Mobile.getAttribute(
    findTestObject('Object Repository/XCUIElementTypeTextField - Member Number'),
    'value',
    5
)

println('Field Type Found: ' + fieldType)

// 🔹 Condition logic
if (fieldType.equalsIgnoreCase('Member Number')) {

    Mobile.sendKeys(findTestObject('Object Repository/XCUIElementTypeTextField - Member Number'), '10124')

    Mobile.sendKeys(findTestObject('Object Repository/XCUIElementTypeSecureTextField - Password'), '123456')

    Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Sign In'), 0)

    println('Logged in using Member Number')

} else if (fieldType.equalsIgnoreCase('Email Address')) {

    Mobile.sendKeys(findTestObject('Object Repository/XCUIElementTypeTextField - Member Number'), 'test@globalnorthstar.com')

    Mobile.sendKeys(findTestObject('Object Repository/XCUIElementTypeSecureTextField - Password'), '123456')

    Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Sign In'), 0)

    println('Logged in using Email')

} else {

    println('Unknown login type detected')
}

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Allow'), 0)

Mobile.closeApplication()


