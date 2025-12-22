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

WebUI.callTestCase(findTestCase('Web/Login/login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_NS - Login/a_Skip_dropdownMenuButton'))

WebUI.waitForPageLoad(2000)

WebUI.click(findTestObject('Object Repository/Page_NS - Login/button_DAC'))

WebUI.click(findTestObject('Object Repository/Page_NS - Login/button_DAC'))

WebUI.click(findTestObject('Object Repository/Page_NS - Login/span_DAC - GOLF'))

WebUI.click(findTestObject('Object Repository/Page_NS - Login/button_DAC - GOLF'))

WebUI.click(findTestObject('Object Repository/Page_NS - Login/span_DAC - FITNESS  MASSAGE'))

WebUI.click(findTestObject('Object Repository/Page_NS - Login/button_DAC - FITNESS  MASSAGE'))

WebUI.click(findTestObject('Object Repository/Page_NS - Login/a_DAC - TENNIS'))

WebUI.click(findTestObject('Object Repository/Page_NS - Login/div_Purchasing'))

WebUI.click(findTestObject('Object Repository/Page_NS - Create PO/a_Create PO'))

WebUI.setText(findTestObject('Object Repository/Page_NS - Create PO/input_Purchase Order_poNum'), 'abc')

WebUI.click(findTestObject('Object Repository/Page_NS - Create PO/a_Skip_dropdownMenuButton'))

WebUI.click(findTestObject('Object Repository/Page_NS - Create PO/div_Lockers'))

WebUI.click(findTestObject('Object Repository/Page_NS - Locker Revenue Report/a_Locker Revenue Report'))

WebUI.click(findTestObject('Object Repository/Page_NS - Locker Revenue Report/a_Skip_dropdownMenuButton'))

WebUI.click(findTestObject('Object Repository/Page_NS - Locker Revenue Report/span_Inventory'))

