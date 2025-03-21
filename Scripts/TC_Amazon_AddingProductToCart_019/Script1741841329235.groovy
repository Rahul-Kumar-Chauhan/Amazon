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

WebUI.mouseOver(findTestObject('Amazon_AddingProductToCart_OR/Page_Online Shopping site in India Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in/span_Account  Lists'))

WebUI.click(findTestObject('Object Repository/Amazon_AddingProductToCart_OR/Page_Online Shopping site in India Shop Onl_10c5f3/span_Sign in'))

WebUI.setText(findTestObject('Object Repository/Amazon_AddingProductToCart_OR/Page_/input_IN 91_email'), '8765257308')

WebUI.click(findTestObject('Object Repository/Amazon_AddingProductToCart_OR/Page_/input_Passkey error_a-button-input'))

WebUI.setEncryptedText(findTestObject('Object Repository/Amazon_AddingProductToCart_OR/Page_Amazon Sign In/input_Forgot password_password'), 
    'FJEEn2Q6rEqImg+RR4ytGA==')

WebUI.click(findTestObject('Object Repository/Amazon_AddingProductToCart_OR/Page_Amazon Sign In/input_Enter your password_signInSubmit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Amazon_AddingProductToCart_OR/Page_Online Shopping site in India Shop Onl_10c5f3/select_All Categories        Alexa Skills  _59be89'), 
    'search-alias=stripbooks', true)

WebUI.setText(findTestObject('Object Repository/Amazon_AddingProductToCart_OR/Page_Online Shopping site in India Shop Onl_10c5f3/input_Search Amazon.in_field-keywords'), 
    'software testing')

WebUI.click(findTestObject('Object Repository/Amazon_AddingProductToCart_OR/Page_Online Shopping site in India Shop Onl_10c5f3/input_Search Amazon.in_nav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/Amazon_AddingProductToCart_OR/Page_Amazon.in  software testing/span_Advanced Software Testing Volume 1 Gui_5701cf'))

WebUI.newTab('')

WebUI.navigateToUrl('https://www.amazon.in/Advanced-Software-Testing-Certification-Analyst/dp/1937538680/ref=sr_1_7?crid=3C9UEFVQMDVAN&dib=eyJ2IjoiMSJ9.MIfdFpyMpVXo7yYfgX7ijiLk2Lx89hMQNzqK0U0QL9T7sP1HPz_YJ7Z-a2PiUtZ-AfTN0QmGi-vj1FKLeS9LXSiGYwyZ0R8MNTLbtMZ_lzwPA1UQfEHpvYCrhkOmcyzrqeBQL6GCtnjdF4NZQBcsZ71bFzCxetoumYS6xILM7nreJtvvGdgCHu5jSHm5aLhOFcecsA7xwcnDjiBLDYJhdJspg06G2IaM_xvgFxv3RVY.27TUwnvpPPS0xw27mhLJTDEyT3S43Os6xoliM_7Xo-s&dib_tag=se&keywords=software+testing&qid=1741830651&s=books&sprefix=software+testing%2Cstripbooks%2C313&sr=1-7')

WebUI.click(findTestObject('Object Repository/Amazon_AddingProductToCart_OR/Page_Advanced Software Testing Volume 1 Gui_ed1630/input_Quantity_submit.add-to-cart'))

WebUI.mouseOver(findTestObject('Amazon_AddingProductToCart_OR/Page_Online Shopping site in India Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in/span_Account  Lists'))

WebUI.click(findTestObject('Object Repository/Amazon_AddingProductToCart_OR/Page_Amazon.in Shopping Cart/span_Sign Out'))

WebUI.closeBrowser()

