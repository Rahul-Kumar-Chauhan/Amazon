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

WebUI.mouseOver(findTestObject('Object Repository/Amazon_NewUserRegistration_OR/Page_Online Shopping site in India Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in/span_Account  Lists_nav-icon nav-arrow'))

WebUI.click(findTestObject('Amazon_NewUserRegistration_OR/Page_Online Shopping site in India Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in/a_Start here'))

WebUI.setText(findTestObject('Amazon_NewUserRegistration_OR/Page_Amazon Registration/input_Your name_customerName'), 'kim smith')

WebUI.delay(5)

WebUI.setText(findTestObject('Amazon_NewUserRegistration_OR/Page_Amazon Registration/input_IN 91_email'), '7586749895')

WebUI.delay(5)

WebUI.setEncryptedText(findTestObject('Amazon_NewUserRegistration_OR/Page_Amazon Registration/input_Password_password'), 
    'k/7Oj5LYQEE=')

WebUI.delay(5)

WebUI.click(findTestObject('Amazon_NewUserRegistration_OR/Page_Amazon Registration/input_Passwords must be at least 6 characters_continue'))

WebUI.delay(5)

WebUI.setText(findTestObject('Amazon_NewUserRegistration_OR/Page_Authentication required/input_Enter OTP_code'), '234567')

WebUI.delay(20)

WebUI.click(findTestObject('Amazon_NewUserRegistration_OR/Page_Authentication required/input_Please enter the verification code_a-button-input'))

WebUI.delay(10)

