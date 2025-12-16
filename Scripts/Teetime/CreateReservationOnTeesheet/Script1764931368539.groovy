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

WebUI.click(findTestObject('Object Repository/Page_NS - Login/span_Tee Time'))

WebUI.click(findTestObject('Object Repository/Page_NS - Tee Sheet/a_Tee Sheet'))

WebUI.click(findTestObject('Object Repository/Page_NS - Tee Sheet/td_Players_000cId5011td2'))

WebUI.setText(findTestObject('Object Repository/Page_NS - Tee Sheet/input_Bill To Player_ysearchinputmemberNumber11'), '.')

WebUI.click(findTestObject('Object Repository/Page_NS - Tee Sheet/a_,cx c,  dcds,cdscsdcsd 110th Texas Amateu_f858da'))

WebUI.click(findTestObject('Object Repository/Page_NS - Tee Sheet/input_Player 9_saveButton'))

WebUI.click(findTestObject('Object Repository/Page_NS - Tee Sheet/div_Create Lottery Requests_TransparentBlock'))

