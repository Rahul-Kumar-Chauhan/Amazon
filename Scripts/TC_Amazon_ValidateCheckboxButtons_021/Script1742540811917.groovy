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

WebUI.navigateToUrl('https://www.amazon.in/')

WebUI.selectOptionByValue(findTestObject('Object Repository/Amazon_ValidateCheckboxButtons/Page_Online Shopping site in India Shop Onl_10c5f3/select_All Categories        Alexa Skills  _a62561'), 
    'search-alias=stripbooks', true)

WebUI.setText(findTestObject('Object Repository/Amazon_ValidateCheckboxButtons/Page_Book Store Online  Buy Books Online at_0a68ca/input_Search Amazon.in_field-keywords'), 
    'da vinci code')

WebUI.click(findTestObject('Amazon_ValidateCheckboxButtons/Page_Book Store Online  Buy Books Online at_0a68ca/input_Search Amazon.in_nav-search-submit-button'))

WebUI.click(findTestObject('Amazon_ValidateCheckboxButtons/Page_Amazon.in  da vinci code/i_Format_a-icon a-icon-checkbox'))

checked = WebUI.verifyElementChecked(findTestObject('Object Repository/Amazon_ValidateCheckboxButtons/Page_Amazon.in  da vinci code/i_Format_a-icon a-icon-checkbox'), 10)

WebUI.delay(3)

if (checked == true) {
    System.out.println('Element Checkeck')
} else {
    System.out.println('Element not Checkeck')
}

unchecked=WebUI.verifyElementNotChecked(findTestObject('Object Repository/Amazon_ValidateCheckboxButtons/Page_Amazon.in  da vinci code/i_Paperback_a-icon a-icon-checkbox'), 10)
WebUI.delay(3)

if (unchecked == true) {
    System.out.println('Element not Checkeck')
} else {
    System.out.println('Element Checkeck')
}

WebUI.closeBrowser()

