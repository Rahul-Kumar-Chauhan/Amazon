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

WebUI.mouseOver(findTestObject('Amazon_ValidatingPlacingAOrder_OR/Page_Online Shopping site in India Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in/span_Account  Lists'))

WebUI.click(findTestObject('Object Repository/Amazon_ValidatingPlacingAOrder_OR/Page_Online Shopping site in India Shop Onl_10c5f3/span_Sign in'))

WebUI.setText(findTestObject('Object Repository/Amazon_ValidatingPlacingAOrder_OR/Page_Amazon Sign In/input_Email or mobile phone number_email'), 
    '8765257308')

WebUI.click(findTestObject('Object Repository/Amazon_ValidatingPlacingAOrder_OR/Page_Amazon Sign In/input_Wrong or Invalid email address or mob_77ed40'))

WebUI.setEncryptedText(findTestObject('Object Repository/Amazon_ValidatingPlacingAOrder_OR/Page_Amazon Sign In/input_Forgot password_password'), 
    'FJEEn2Q6rEqImg+RR4ytGA==')

WebUI.click(findTestObject('Object Repository/Amazon_ValidatingPlacingAOrder_OR/Page_Amazon Sign In/input_Enter your password_signInSubmit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Amazon_ValidatingPlacingAOrder_OR/Page_Online Shopping site in India Shop Onl_10c5f3/select_All Categories        Alexa Skills  _59be89'), 
    'search-alias=stripbooks', true)

WebUI.setText(findTestObject('Object Repository/Amazon_ValidatingPlacingAOrder_OR/Page_Online Shopping site in India Shop Onl_10c5f3/input_Search Amazon.in_field-keywords'), 
    'dopamine detox')

WebUI.click(findTestObject('Object Repository/Amazon_ValidatingPlacingAOrder_OR/Page_Online Shopping site in India Shop Onl_10c5f3/input_Search Amazon.in_nav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/Amazon_ValidatingPlacingAOrder_OR/Page_Amazon.in  dopamine detox/span_Dopamine Detox  A Short Guide to Remov_c6ee6f'))

WebUI.newTab('')

WebUI.navigateToUrl('https://www.amazon.in/Dopamine-Detox-Remove-Distractions-Things/dp/8183286011/ref=sr_1_1_sspa?crid=1NU2R28DY0SN5&dib=eyJ2IjoiMSJ9.YlGXE17O7k5aD2j4Kse9dOSJ0N5NmLO1i3qBLQNxIDfJYZEHqbqj3kGhtwcpYEN9RrFVJJ17D6-iO1SPsqYGi2cSvfvv1bOON8PdQ87NhmEsDhoJeS4KxPFboF5AZnchLEZZ6eYkuhwfyVNKKEjsyWipGIJ0L3wQmXjQucrdYVYiFymPWHjnVxGqbGPHE9SipEJ0nGX_bmynZWyTY1bq83kLyHVkJer-g52uH8cZX9k.2KlSeObW9l2Re9dkleNDSQ4dcbGH390I33e_YlEZG-0&dib_tag=se&keywords=dopamine+detox&qid=1741834765&s=books&sprefix=dopamine+detox%2Cstripbooks%2C1352&sr=1-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1')

WebUI.click(findTestObject('Object Repository/Amazon_ValidatingPlacingAOrder_OR/Page_Dopamine Detox  A Short Guide to Remov_eec2f1/input_Quantity_submit.buy-now'))

WebUI.click(findTestObject('Object Repository/Amazon_ValidatingPlacingAOrder_OR/Page_Place Your Order - Amazon Checkout/a_Change'))

WebUI.click(findTestObject('Object Repository/Amazon_ValidatingPlacingAOrder_OR/Page_Place Your Order - Amazon Checkout/i_Delivery addresses (2)_a-icon a-icon-radio'))

WebUI.click(findTestObject('Object Repository/Amazon_ValidatingPlacingAOrder_OR/Page_Place Your Order - Amazon Checkout/input__a-button-input'))

WebUI.click(findTestObject('Object Repository/Amazon_ValidatingPlacingAOrder_OR/Page_Place Your Order - Amazon Checkout/a_Change_1'))

WebUI.click(findTestObject('Object Repository/Amazon_ValidatingPlacingAOrder_OR/Page_Place Your Order - Amazon Checkout/input_Why_ppw-instrumentRowSelection'))

WebUI.click(findTestObject('Object Repository/Amazon_ValidatingPlacingAOrder_OR/Page_Place Your Order - Amazon Checkout/input_Convenience fee of 7 will apply. To a_ce1589'))

WebUI.click(findTestObject('Object Repository/Amazon_ValidatingPlacingAOrder_OR/Page_Place Your Order - Amazon Checkout/input_Add gift options_placeYourOrder1'))

WebUI.mouseOver(findTestObject('Amazon_ValidatingPlacingAOrder_OR/Page_Online Shopping site in India Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in/span_Account  Lists'))

WebUI.click(findTestObject('Object Repository/Amazon_ValidatingPlacingAOrder_OR/Page_Place Your Order - Amazon Checkout/span_Sign Out'))

WebUI.closeBrowser()

