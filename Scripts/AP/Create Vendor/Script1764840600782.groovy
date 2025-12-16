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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://nexusautomation1.sibisoft.com:9071/AR1-C4/')

WebUI.setText(findTestObject('Object Repository/Page_NS - Login/input_Username_userID'), 'su')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_NS - Login/input_Password_password'), 'tnxfd3Ayf5cFAWdo8VDxjg==')

WebUI.click(findTestObject('Object Repository/Page_NS - Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_NS - Login/a_Skip_dropdownMenuButton'))

WebUI.click(findTestObject('Object Repository/Page_NS - Login/button_DAC'))

WebUI.click(findTestObject('Object Repository/Page_NS - Login/a_DAC'))

WebUI.click(findTestObject('Object Repository/Page_NS - Login/span_Accounts Payable'))

WebUI.click(findTestObject('Object Repository/Page_NS - Create Vendor/a_Create Vendor'))

WebUI.setText(findTestObject('Object Repository/Page_NS - Create Vendor/input_Name_vendorName'), 'Test Vendor')

WebUI.click(findTestObject('Object Repository/Page_NS - Create Vendor/div_Name For 1099 Form Type'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_NS - Create Vendor/select_---Select---Net10THNET30NET10NET60NE_cb3d8e'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_NS - Create Vendor/select_Please selectNAForm 1099-MISCForm 10_29a578'), 
    '19', true)

WebUI.click(findTestObject('Object Repository/Page_NS - Create Vendor/input_User Sites_selectAllSites'))

WebUI.click(findTestObject('Object Repository/Page_NS - Create Vendor/input_Country_Save2'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NS - Create Vendor/div_Successfully Saved Vendor Information'), 
    0)

