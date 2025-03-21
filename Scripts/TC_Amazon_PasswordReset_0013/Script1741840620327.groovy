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

WebUI.mouseOver(findTestObject('Amazon_PasswordReset_OR/Page_Online Shopping site in India Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in/span_Account  Lists'))

WebUI.click(findTestObject('Object Repository/Amazon_PasswordReset_OR/Page_Online Shopping site in India Shop Onl_10c5f3/span_Sign in'))

WebUI.setText(findTestObject('Object Repository/Amazon_PasswordReset_OR/Page_/input_IN 91_email'), '8765257308')

WebUI.click(findTestObject('Object Repository/Amazon_PasswordReset_OR/Page_/input_Passkey error_a-button-input'))

WebUI.click(findTestObject('Object Repository/Amazon_PasswordReset_OR/Page_Amazon Sign In/a_Forgot password'))

WebUI.click(findTestObject('Object Repository/Amazon_PasswordReset_OR/Page_Amazon Password Assistance/input_Wrong or Invalid email address or mob_77ed40'))

WebUI.setText(findTestObject('Object Repository/Amazon_PasswordReset_OR/Page_Amazon/input_For your security, we have sent the c_992114'), 
    '362491')

WebUI.click(findTestObject('Object Repository/Amazon_PasswordReset_OR/Page_Amazon/input_Please wait  32  seconds before reque_171295'))

WebUI.setEncryptedText(findTestObject('Object Repository/Amazon_PasswordReset_OR/Page_Amazon/input_New password_password'), 
    'FJEEn2Q6rEqImg+RR4ytGA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Amazon_PasswordReset_OR/Page_Amazon/input_Password again_passwordCheck'), 
    'FJEEn2Q6rEqImg+RR4ytGA==')

WebUI.click(findTestObject('Object Repository/Amazon_PasswordReset_OR/Page_Amazon/input_Type your password again_continue'))

WebUI.mouseOver(findTestObject('Amazon_PasswordReset_OR/Page_Online Shopping site in India Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in/span_Account  Lists'))

WebUI.click(findTestObject('Object Repository/Amazon_PasswordReset_OR/Page_Online Shopping site in India Shop Onl_10c5f3/span_Sign Out'))

WebUI.closeBrowser()

