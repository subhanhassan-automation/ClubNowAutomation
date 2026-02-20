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

Mobile.startApplication('/Users/sibisoft/Downloads/ClubNowLive.ipa', true)

Mobile.tap(findTestObject('Object Repository/iOS/Login/SMC-7154-InactiveMember/XCUIElementTypeButton - Continue to Login'), 
    0)

Mobile.sendKeys(findTestObject('Object Repository/iOS/Login/SMC-7154-InactiveMember/XCUIElementTypeTextField - Member Number'), 
    '10009-2')

Mobile.sendKeys(findTestObject('Object Repository/iOS/Login/SMC-7154-InactiveMember/XCUIElementTypeSecureTextField - Password'), 
    '123456')

Mobile.tap(findTestObject('Object Repository/iOS/Login/SMC-7154-InactiveMember/XCUIElementTypeButton - Sign In'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/iOS/Login/SMC-7154-InactiveMember/XCUIElementTypeStaticText - You are not allowed to login. Please contact support'), 
    'You are not allowed to login. Please contact support.')

Mobile.closeApplication()

