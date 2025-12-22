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

WebUI.waitForPageLoad(2000, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_NS - Login/a_Skip_dropdownMenuButton'))

WebUI.click(findTestObject('Object Repository/Page_NS - Login/a_Skip_dropdownMenuButton'))

WebUI.click(findTestObject('Object Repository/Page_NS - Login/button_DAC'))

WebUI.click(findTestObject('Object Repository/Page_NS - Login/a_DAC'))

WebUI.click(findTestObject('Object Repository/Page_NS - Login/div_Tee Time'))

WebUI.click(findTestObject('Object Repository/Page_NS - Tee Sheet Template Setup/a_Tee Sheet Template Setup'))

WebUI.click(findTestObject('Object Repository/Page_NS - Tee Sheet Template Setup/input__btn btn-primary btn-sm'))

WebUI.setText(findTestObject('Object Repository/Page_NS - Tee Sheet Template Setup/input_Name_templateName'), 'shotgun12')

WebUI.setText(findTestObject('Object Repository/Page_NS - Tee Sheet Template Setup/input_(mins)_timeInterval'), '03')

WebUI.setText(findTestObject('Object Repository/Page_NS - Tee Sheet Template Setup/input_(mins)_alternateTimeInterval'), 
    '0')

WebUI.click(findTestObject('Object Repository/Page_NS - Tee Sheet Template Setup/input_(mins)_alternateTimeInterval'))

WebUI.click(findTestObject('Object Repository/Page_NS - Tee Sheet Template Setup/td_Alternate Time Interval (mins)'))

WebUI.setText(findTestObject('Object Repository/Page_NS - Tee Sheet Template Setup/input_(mins)_alternateTimeInterval'), 
    '45')

WebUI.click(findTestObject('Object Repository/Page_NS - Tee Sheet Template Setup/img'))

WebUI.click(findTestObject('Object Repository/Page_NS - Tee Sheet Template Setup/a_03'))

WebUI.click(findTestObject('Object Repository/Page_NS - Tee Sheet Template Setup/a_03'))

WebUI.click(findTestObject('Object Repository/Page_NS - Tee Sheet Template Setup/a_SET'))

WebUI.click(findTestObject('Object Repository/Page_NS - Tee Sheet Template Setup/span_End Time_input-group-addon'))

WebUI.click(findTestObject('Object Repository/Page_NS - Tee Sheet Template Setup/img_1'))

WebUI.click(findTestObject('Object Repository/Page_NS - Tee Sheet Template Setup/a_PM'))

WebUI.click(findTestObject('Object Repository/Page_NS - Tee Sheet Template Setup/a_01'))

WebUI.click(findTestObject('Object Repository/Page_NS - Tee Sheet Template Setup/a_SET'))

WebUI.click(findTestObject('Object Repository/Page_NS - Tee Sheet Template Setup/input_Courses_btn btn-success btn-sm'))

WebUI.click(findTestObject('Object Repository/Page_NS - Tee Sheet Template Setup/td_null'))

WebUI.click(findTestObject('Object Repository/Page_NS - Tee Sheet Template Setup/td_null'))

WebUI.rightClick(findTestObject('Object Repository/Page_NS - Tee Sheet Template Setup/td_null'))

WebUI.click(findTestObject('Object Repository/Page_NS - Tee Sheet Template Setup/td_Shotgun'))

WebUI.click(findTestObject('Object Repository/Page_NS - Tee Sheet Template Setup/input_Tees_ATeamAll'))

WebUI.click(findTestObject('Object Repository/Page_NS - Tee Sheet Template Setup/input_Block slots after shotgun time upto_s_0db333'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_NS - Tee Sheet Template Setup/select_DraftActiveInactive'), 
    'Active', true)

WebUI.click(findTestObject('Page_NS - Tee Sheet Template Setup/span_Changes saved successfully'))

