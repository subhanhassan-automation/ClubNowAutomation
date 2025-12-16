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

WebUI.callTestCase(findTestCase('Login/login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_NS - Login/a_Skip_dropdownMenuButton'))

WebUI.click(findTestObject('Object Repository/Page_NS - Login/button_DAC'))

WebUI.click(findTestObject('Object Repository/Page_NS - Login/span_DAC'))

WebUI.click(findTestObject('Object Repository/Page_NS - Login/a_DAC'))

WebUI.click(findTestObject('Object Repository/Page_NS - Login/span_Tee Time'))

WebUI.click(findTestObject('Object Repository/Page_NS - Course Setup/a_Course Setup'))

WebUI.click(findTestObject('Object Repository/Page_NS - Course Setup/input__btn btn-primary btn-sm'))

WebUI.setText(findTestObject('Object Repository/Page_NS - Course Setup/input_Course Name_courseName'), 'testnew')

WebUI.click(findTestObject('Object Repository/Page_NS - Course Setup/i_Opening Time_fa fa-clock-o'))

WebUI.click(findTestObject('Object Repository/Page_NS - Course Setup/a_05'))

WebUI.click(findTestObject('Object Repository/Page_NS - Course Setup/a_SET'))

WebUI.click(findTestObject('Object Repository/Page_NS - Course Setup/i_Closing Time_fa fa-clock-o'))

WebUI.click(findTestObject('Object Repository/Page_NS - Course Setup/a_05'))

WebUI.click(findTestObject('Object Repository/Page_NS - Course Setup/a_50'))

WebUI.click(findTestObject('Object Repository/Page_NS - Course Setup/a_SET'))

WebUI.setText(findTestObject('Object Repository/Page_NS - Course Setup/input_mins_timeInterval'), '30')

WebUI.click(findTestObject('Object Repository/Page_NS - Course Setup/input_mins_timeInterval'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_NS - Course Setup/select_-- Select --Golf ShopGolfFitnessPool_57cd43'), 
    '75', true)

WebUI.doubleClick(findTestObject('Object Repository/Page_NS - Course Setup/strong_Course created successfully'))

WebUI.click(findTestObject('Object Repository/Page_NS - Course Setup/input_No Rates defined_buttonStatus'))

WebUI.setText(findTestObject('Object Repository/Page_NS - Course Setup/input_Rate Name_courseRateName'), 'testnewrate')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_NS - Course Setup/select_SundayMondayTuesdayWednesdayThursday_f29a2d'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Page_NS - Course Setup/span_Valid From_input-group-addon'))

WebUI.click(findTestObject('Object Repository/Page_NS - Course Setup/img'))

WebUI.setText(findTestObject('Object Repository/Page_NS - Course Setup/input_Valid From_rateValidityFromDate'), '12/06/2025')

WebUI.setText(findTestObject('Object Repository/Page_NS - Course Setup/input_Member_ysearchinput0chargeItemNameGre_022940'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_NS - Course Setup/input_Member_ysearchinput0chargeItemNameGre_022940'))

WebUI.doubleClick(findTestObject('Object Repository/Page_NS - Course Setup/input_Member_ysearchinput0chargeItemNameGre_022940'))

WebUI.setText(findTestObject('Object Repository/Page_NS - Course Setup/input_Member_ysearchinput0chargeItemNameGre_022940'), 
    'n')

WebUI.click(findTestObject('Object Repository/Page_NS - Course Setup/a_Nicklaus Cup'))

WebUI.setText(findTestObject('Object Repository/Page_NS - Course Setup/input_Guest_ysearchinput1chargeItemNameGree_09c205'), 
    'newguest')

WebUI.setText(findTestObject('Object Repository/Page_NS - Course Setup/input_Member_ysearchinput0chargeItemNameGre_ba6264'), 
    '.')

WebUI.click(findTestObject('Object Repository/Page_NS - Course Setup/a_1919'))

WebUI.setText(findTestObject('Object Repository/Page_NS - Course Setup/input_Guest_ysearchinput1chargeItemNameGree_a72fe8'), 
    '.')

WebUI.click(findTestObject('Object Repository/Page_NS - Course Setup/a_1919_1'))

WebUI.setText(findTestObject('Object Repository/Page_NS - Course Setup/input_Member_0chargeItemAmountGreenFee9Hole_1618b6'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Page_NS - Course Setup/input_Guest_1chargeItemAmountGreenFee9Holes_0de5aa'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Page_NS - Course Setup/input_Member_ysearchinput0chargeItemNameNoS_5c1ace'), 
    '.')

WebUI.click(findTestObject('Object Repository/Page_NS - Course Setup/a_Bag Storage (Monthly)'))

WebUI.setText(findTestObject('Object Repository/Page_NS - Course Setup/input_Guest_ysearchinput1chargeItemNameNoSh_804214'), 
    '.')

WebUI.click(findTestObject('Object Repository/Page_NS - Course Setup/a_Bag Storage (Monthly)_1'))

WebUI.setText(findTestObject('Object Repository/Page_NS - Course Setup/input_Member_0chargeItemAmountNoShowForMemb_ee1dfd'), 
    '12.00')

WebUI.setText(findTestObject('Object Repository/Page_NS - Course Setup/input_Guest_1chargeItemAmountNoShowForMembe_756295'), 
    '11')

WebUI.click(findTestObject('Object Repository/Page_NS - Course Setup/input_Guest_btn btn-primary btn-sm'))

WebUI.closeBrowser()

