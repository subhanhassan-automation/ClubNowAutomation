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
import java.util.Random as Random

Random rand = new Random()

int randomNumber = rand.nextInt(1000 // Generates a random integer between 0 (inclusive) and 1000 (exclusive)
    )

String randomName = namePayType + String.valueOf(randomNumber // Convert to String if needed for UI input
    )

WebUI.callTestCase(findTestCase('Web/Login/login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(200)

WebUI.click(findTestObject('Object Repository/Page_NS - Login/a_Skip_dropdownMenuButton'))

WebUI.click(findTestObject('Object Repository/Page_NS - Login/a_Skip_dropdownMenuButton'))

WebUI.click(findTestObject('Object Repository/Page_NS - Login/button_DAC'))

WebUI.click(findTestObject('Object Repository/Page_NS - Login/a_DAC'))

WebUI.click(findTestObject('Object Repository/Page_NS - Login/span_Accounts Payable'))

WebUI.click(findTestObject('Object Repository/Page_NS - Payment Types/a_Payment Types'))

WebUI.click(findTestObject('Object Repository/Page_NS - Payment Types/input__Save'))

WebUI.setText(findTestObject('Object Repository/Page_NS - Payment Types/input_Name_paymentTypeName'), randomName)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_NS - Payment Types/select_Non Check  P-Card          ACH      _a57d4e'), 
    'CheckType', true)

WebUI.click(findTestObject('Object Repository/Page_NS - Payment Types/input__Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NS - Payment Types/p_Payment Type Added Successfully'), 
    0)

WebUI.closeBrowser()

