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

WebUI.selectOptionByValue(findTestObject('Object Repository/Amazon_ViewingProductDetails_OR/Page_Online Shopping site in India Shop Onl_10c5f3/select_All Categories        Alexa Skills  _59be89'), 
    'search-alias=stripbooks', true)

WebUI.setText(findTestObject('Object Repository/Amazon_ViewingProductDetails_OR/Page_Online Shopping site in India Shop Onl_10c5f3/input_Search Amazon.in_field-keywords'), 
    'Aptitude')

WebUI.click(findTestObject('Object Repository/Amazon_ViewingProductDetails_OR/Page_Online Shopping site in India Shop Onl_10c5f3/input_Search Amazon.in_nav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/Amazon_ViewingProductDetails_OR/Page_Amazon.in  Aptitude/div_on first order_puisg-col-inner'))

WebUI.click(findTestObject('Object Repository/Amazon_ViewingProductDetails_OR/Page_Amazon.in  Aptitude/span_UPPSC-AE 2024 Prelims Exam 2000 Practi_fecf42'))

WebUI.newTab('')

WebUI.navigateToUrl('https://www.amazon.in/UPPSC-AE-2024-Practice-Engineering-Paperback/dp/9362028069/ref=sr_1_6?crid=3E7SMJVNABN4H&dib=eyJ2IjoiMSJ9.q9R2pNdba2EM9noVju8kjoEYb7fv8iiUwRCAW4uDFIxhs-8Q36PXq6XaV3juRZrNCqbiqT6QjaQKYq1oxFEIxrFQWBjbpWB3v_wvgnq48v4aEZrqsRbV0ydC4y4Obf4-uOBcYWJ2u_5yLqzO8HcCsiClnHkWW4YlIaSmAQICpIex9E2besamcwl1wZY3zGpqV2uK1nlHMUSMBXRt8cwD5DqyfxwgpnLU4Noaa5XUmuY.Dspud0z2eDz95IivUJqtIqasoR5G8Sn_cByuZXPW_rc&dib_tag=se&keywords=Aptitude&qid=1741832270&s=books&sprefix=aptitude%2Cstripbooks%2C530&sr=1-6')

WebUI.closeBrowser()

