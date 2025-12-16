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

not_run: WebUI.click(findTestObject('Object Repository/Page_NS - Login/a_Skip_dropdownMenuButton'))

WebUI.click(findTestObject('Object Repository/Page_NS - Login/button_DAC'))

WebUI.click(findTestObject('Object Repository/Page_NS - Login/a_DAC'))

WebUI.click(findTestObject('Object Repository/Page_NS - Login/span_Accounts Payable'))

WebUI.click(findTestObject('Object Repository/Page_NS - Create Invoice/a_Create Invoice'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NS - Create Invoice/span_Vendor'), 0)

WebUI.setText(findTestObject('Object Repository/Page_NS - Create Invoice/input__form-control input-sm ysearchinput u_527412'), 
    '.')

WebUI.click(findTestObject('Object Repository/Page_NS - Create Invoice/td_1691-10-S Tennis Supply  Dink'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_NS - Create Invoice/select_SelectNet10THNET30NET10NET60NET90NET_5d3fb5'), 
    'Net', true)

WebUI.setText(findTestObject('Object Repository/Page_NS - Create Invoice/input__gwt-TextBox form-control input-sm'), '323232')

WebUI.setText(findTestObject('Object Repository/Page_NS - Create Invoice/input__gwt-TextBox form-control input-sm_2'), '20')

WebUI.click(findTestObject('Object Repository/Page_NS - Create Invoice/td_Accounts Payable - Trade_hovering'))

WebUI.setText(findTestObject('Object Repository/Page_NS - Create Invoice/input_Show Allocated Items_gwt-SuggestBox'), '.')

WebUI.click(findTestObject('Object Repository/Page_NS - Create Invoice/td_00-d1005-operating - inwood natl bank'))

WebUI.click(findTestObject('Object Repository/Page_NS - Create Invoice/div_Balance 0.00'))

WebUI.click(findTestObject('Object Repository/Page_NS - Create Invoice/div_Balance 0.00'))

WebUI.click(findTestObject('Object Repository/Page_NS - Create Invoice/button_Save As Draft'))

