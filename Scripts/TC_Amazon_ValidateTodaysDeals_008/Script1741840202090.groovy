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

WebUI.verifyElementPresent(findTestObject('Amazon_ValidateTodaysDeals_OR/Page_Online Shopping site in India Shop Onl_10c5f3/a_Todays Deals'), 
    10)

WebUI.click(findTestObject('Object Repository/Amazon_ValidateTodaysDeals_OR/Page_Online Shopping site in India Shop Onl_10c5f3/a_Todays Deals'))

WebUI.verifyElementPresent(findTestObject('Amazon_ValidateTodaysDeals_OR/Page_Amazon.in - Deals/span_OnePlus Nord 4 5G (Oasis Green, 8GB RA_43c881'), 
    10)

WebUI.click(findTestObject('Object Repository/Amazon_ValidateTodaysDeals_OR/Page_Amazon.in - Deals/span_OnePlus Nord 4 5G (Oasis Green, 8GB RA_43c881'))

WebUI.back()

WebUI.verifyElementPresent(findTestObject('Amazon_ValidateTodaysDeals_OR/Page_Amazon.in - Deals/span_Samsung Galaxy M16 5G (Thunder Black, _0bd95b'), 
    10)

WebUI.click(findTestObject('Object Repository/Amazon_ValidateTodaysDeals_OR/Page_Amazon.in - Deals/span_Samsung Galaxy M16 5G (Thunder Black, _0bd95b'))

WebUI.back()

WebUI.closeBrowser()

