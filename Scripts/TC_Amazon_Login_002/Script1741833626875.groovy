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

WebUI.mouseOver(findTestObject('Amazon_Login_OR/Page_Online Shopping site in India Shop Onl_10c5f3/span_Account  Lists'))

WebUI.click(findTestObject('Object Repository/Amazon_Login_OR/Page_Online Shopping site in India Shop Onl_10c5f3/span_Sign in'))

WebUI.setText(findTestObject('Object Repository/Amazon_Login_OR/Page_/input_IN 91_email'), '8765257308')

WebUI.click(findTestObject('Object Repository/Amazon_Login_OR/Page_/input_Passkey error_a-button-input'))

WebUI.setEncryptedText(findTestObject('Object Repository/Amazon_Login_OR/Page_Amazon Sign In/input_Forgot password_password'), 
    'FJEEn2Q6rEqImg+RR4ytGA==')

WebUI.click(findTestObject('Amazon_Login_OR/Page_Amazon Sign In/input_Enter your password_signInSubmit'))

WebUI.mouseOver(findTestObject('Amazon_Login_OR/Page_Online Shopping site in India Shop Onl_10c5f3/span_Account  Lists'))

WebUI.click(findTestObject('Object Repository/Amazon_Login_OR/Page_Online Shopping site in India Shop Onl_10c5f3/span_Sign Out'))

WebUI.closeBrowser()

