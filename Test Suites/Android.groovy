import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.SetUp
import com.kms.katalon.core.annotation.SetupTestCase
import com.kms.katalon.core.annotation.TearDown
import com.kms.katalon.core.annotation.TearDownTestCase
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver
import org.openqa.selenium.Dimension
import com.kms.katalon.core.model.FailureHandling

// ===== START APPLICATION =====
Mobile.startApplication('D:\\ClubNow-Android.apk', true)

// ===== TAP MENU =====
Mobile.tap(findTestObject('Object Repository/Test Cases/android.widget.ImageView (5)'), 10)

// ===== SCROLL UNTIL FOUND =====
boolean found = false
int maxScroll = 5

AppiumDriver driver = MobileDriverFactory.getDriver()
Dimension size = driver.manage().window().getSize()

int startX = size.width / 2
int startY = (int)(size.height * 0.8)
int endY   = (int)(size.height * 0.2)

for (int i = 0; i < maxScroll; i++) {

	if (Mobile.verifyElementExist(findTestObject('Object Repository/Test Cases/Profile Element'), 2, FailureHandling.OPTIONAL)) {
		found = true
		break
	}

	Mobile.swipe(startX, startY, startX, endY)
	Mobile.delay(2)
}

// ===== TAP IF FOUND =====
if (found) {
	Mobile.tap(findTestObject('Object Repository/Test Cases/Profile Element'), 10)
	println("Profile found and tapped")
} else {
	println("Element not found after scrolling")
}

// ===== CLOSE APP =====
Mobile.closeApplication()

/**
 * Some methods below are samples for using SetUp/TearDown in a test suite.
 */

/**
 * Setup test suite environment.
 */
@SetUp(skipped = true) // Please change skipped to be false to activate this method.
def setUp() {
	// Put your code here.
}

/**
 * Clean test suites environment.
 */
@TearDown(skipped = true) // Please change skipped to be false to activate this method.
def tearDown() {
	// Put your code here.
}

/**
 * Run before each test case starts.
 */
@SetupTestCase(skipped = true) // Please change skipped to be false to activate this method.
def setupTestCase() {
	// Put your code here.
}

/**
 * Run after each test case ends.
 */
@TearDownTestCase(skipped = true) // Please change skipped to be false to activate this method.
def tearDownTestCase() {
	// Put your code here.
}

// ===== START APPLICATION =====
Mobile.startApplication('D:\\ClubNow-Android.apk', true)

// ===== TAP MENU =====
Mobile.tap(findTestObject('Object Repository/Test Cases/android.widget.ImageView (5)'), 10)

// ===== SCROLL UNTIL FOUND =====
boolean found = false
int maxScroll = 5

AppiumDriver driver = MobileDriverFactory.getDriver()
Dimension size = driver.manage().window().getSize()

int startX = size.width / 2
int startY = (int)(size.height * 0.8)
int endY   = (int)(size.height * 0.2)

for (int i = 0; i < maxScroll; i++) {

	if (Mobile.verifyElementExist(findTestObject('Object Repository/Test Cases/Profile Element'), 2, FailureHandling.OPTIONAL)) {
		found = true
		break
	}

	Mobile.swipe(startX, startY, startX, endY)
	Mobile.delay(2)
}

// ===== TAP IF FOUND =====
if (found) {
	Mobile.tap(findTestObject('Object Repository/Test Cases/Profile Element'), 10)
	println("Profile found and tapped")
} else {
	println("Element not found after scrolling")
}
/**
 * References:
 * Groovy tutorial page: http://docs.groovy-lang.org/next/html/documentation/
 */