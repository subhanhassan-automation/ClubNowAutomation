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

WebUI.click(findTestObject('Object Repository/Page_NS - Login/span_Login'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Object Repository/Page_NS - Login/a_Skip_dropdownMenuButton'))

WebUI.click(findTestObject('Object Repository/Page_NS - Login/a_Skip_dropdownMenuButton'))

WebUI.click(findTestObject('Object Repository/Page_NS - Login/button_DAC'))

WebUI.click(findTestObject('Object Repository/Page_NS - Login/a_DAC'))

WebUI.click(findTestObject('Object Repository/Page_NS - Login/span_Events'))

WebUI.click(findTestObject('Object Repository/Page_NS - Event/a_Event'))

WebUI.setText(findTestObject('Object Repository/Page_NS - Event/input__name'), 'Test vent 1256')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_NS - Event/select_---------Select---------Automation20_6c780c'), 
    '77', true)

WebUI.verifyAlertNotPresent(0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_NS - Event/select_paymentTypesArr0  0-0Member ChargeCa_a1d782'), 
    '52', true)

WebUI.setText(findTestObject('Object Repository/Page_NS - Event/input__eventDate'), '.')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_NS - Event/select_paymentTypesArr0  0-0Member ChargeCa_a1d782'), 
    '93', true)

WebUI.click(findTestObject('Object Repository/Page_NS - Event/input_Payment Types_saveBtn'))

WebUI.click(findTestObject('Page_NS - Test vent 1256/input_Capacity_eventSeatingsImg'))

WebUI.click(findTestObject('Object Repository/Page_NS - Event/img'))

WebUI.click(findTestObject('Object Repository/Page_NS - Event/a_PM'))

WebUI.click(findTestObject('Object Repository/Page_NS - Event/span_POS Update Automation 263_ui-icon ui-i_e8fffa'))

WebUI.click(findTestObject('Object Repository/Page_NS - Event/img_1'))

WebUI.click(findTestObject('Object Repository/Page_NS - Event/a_08'))

WebUI.click(findTestObject('Object Repository/Page_NS - Event/a_PM'))

WebUI.click(findTestObject('Object Repository/Page_NS - Event/span_POS Update Automation 263_ui-icon ui-i_e8fffa'))

WebUI.setText(findTestObject('Object Repository/Page_NS - Event/input_Minimum Threshold_minimumThreshold'), '1')

WebUI.setText(findTestObject('Object Repository/Page_NS - Event/input__capacity63'), '010')

WebUI.click(findTestObject('Object Repository/Page_NS - Event/input_POS Update Automation 263_eventSeatin_88bdde'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NS - Event/div_Event seating saved successfully'), 0)

WebUI.click(findTestObject('Page_NS - Test vent 1256/EventSessionDialogueCloseBtn'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NS - Event/span_Event seating has been saved successfully'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_NS - Event/select_----------------Select--------------_7e1b51'), 
    '1', true)

WebUI.acceptAlert()

not_run: WebUI.click(findTestObject('Object Repository/Page_NS - Event/input_Payment Types_saveBtn'))

WebUI.click(findTestObject('Object Repository/Page_NS - Event/a_Guideline'))

WebUI.click(findTestObject('Object Repository/Page_NS - Event/input_Allow Child_allowDifferentSessionForEachDay'))

not_run: WebUI.click(findTestObject('Object Repository/Page_NS - Event/input_Payment Types_saveBtn'))

WebUI.click(findTestObject('Object Repository/Page_NS - Event/input_Allow Member To Create Reservation Fo_a8476e'))

WebUI.click(findTestObject('Object Repository/Page_NS - Event/input_Uncle_allowGuest'))

WebUI.click(findTestObject('Object Repository/Page_NS - Event/input_Allow Child_allowDifferentSessionForEachDay'))

WebUI.click(findTestObject('Object Repository/Page_NS - Event/input_Allow different timings for each day__13ef44'))

WebUI.click(findTestObject('Object Repository/Page_NS - Event/input_Select Default Passed Days_saveEventG_61f121'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NS - Event/div_Event guidelines saved successfully'), 
    0)

