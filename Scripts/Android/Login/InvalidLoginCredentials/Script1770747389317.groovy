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

assert true

Mobile.startApplication('D:\\Tools\\GIT\\CN30EURL.apk', true)

Mobile.tap(findTestObject('Object Repository/Loginn/android.webkit.WebView'), 0)

Mobile.tap(findTestObject('Object Repository/Loginn/android.widget.Button - Continue to Login'), 0)

Mobile.tap(findTestObject('Object Repository/Loginn/android.widget.EditText'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Loginn/android.widget.EditText (1)'), '67890')

Mobile.tap(findTestObject('Object Repository/Loginn/android.widget.EditText (2)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Loginn/android.widget.EditText (3)'), '142536789')

Mobile.tap(findTestObject('Object Repository/Loginn/android.widget.Button - Sign In'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Loginn/android.widget.TextView - Authentication failed. Please try again'), 
    'Authentication failed. Please try again.')

Mobile.closeApplication()

