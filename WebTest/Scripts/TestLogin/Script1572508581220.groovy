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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://circus.qamania.org/login/')

WebUI.click(findTestObject('Object Repository/Page_Circus/div_Error text                             _ed19af'))

WebUI.setText(findTestObject('Page_Circus/input_Error text_username'), 'test')

WebUI.setEncryptedText(findTestObject('Page_Circus/input_Error text_password'), 'P9ET2sDE0SE=')

WebUI.click(findTestObject('Page_Circus/input_Error text_action'))

WebUI.setText(findTestObject('Object Repository/Page_Circus/input_Keyword_keyword'), 'elephants')

WebUI.click(findTestObject('Object Repository/Page_Circus/input_Keyword_defBtn'))

WebUI.setText(findTestObject('Object Repository/Page_Circus/input__105'), '1')

WebUI.click(findTestObject('Object Repository/Page_Circus/button_Book'))

WebUI.click(findTestObject('Object Repository/Page_Circus/a_cart'))

WebUI.click(findTestObject('Object Repository/Page_Circus/a_X'))

WebUI.click(findTestObject('Object Repository/Page_Circus/button_Cancel'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://circus.qamania.org/login/')

WebUI.click(findTestObject('Object Repository/Page_Circus/div_Error text                             _ed19af'))

WebUI.setText(findTestObject('Object Repository/Page_Circus/input_Error text_username'), 'test')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Circus/input_Error text_password'), 'P9ET2sDE0SE=')

WebUI.click(findTestObject('Object Repository/Page_Circus/input_Error text_action'))

WebUI.setText(findTestObject('Object Repository/Page_Circus/input_Keyword_keyword'), 'elephants')

WebUI.click(findTestObject('Object Repository/Page_Circus/input_Keyword_defBtn'))

WebUI.setText(findTestObject('Object Repository/Page_Circus/input__105'), '1')

WebUI.click(findTestObject('Object Repository/Page_Circus/button_Book'))

WebUI.click(findTestObject('Object Repository/Page_Circus/a_cart'))

WebUI.click(findTestObject('Object Repository/Page_Circus/a_X'))

WebUI.click(findTestObject('Object Repository/Page_Circus/button_Cancel'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://circus.qamania.org/login/')

WebUI.click(findTestObject('Object Repository/Page_Circus/div_Error text                             _ed19af'))

WebUI.setText(findTestObject('Object Repository/Page_Circus/input_Error text_username'), 'test')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Circus/input_Error text_password'), 'P9ET2sDE0SE=')

WebUI.sendKeys(findTestObject('Object Repository/Page_Circus/input_Error text_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Circus/a_cart'))

WebUI.click(findTestObject('Page_Circus/ticketsCount'))

WebUI.click(findTestObject('Page_Circus/ticketsCount'))

WebUI.click(findTestObject('Page_Circus/totalPrice'))

WebUI.click(findTestObject('Object Repository/Page_Circus/a_X'))

WebUI.click(findTestObject('Object Repository/Page_Circus/td_5'))

