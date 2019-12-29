package book
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class cartQty {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Main page of the shop is opened")
	def Main_page_of_the_shop_is_opened() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('http://circus.qamania.org/login/')
	}

	@And("User is logged in")
	def User_is_logged_in() {
		WebUI.setText(findTestObject('Page_Circus/input_Error text_username'), 'test')
		WebUI.setEncryptedText(findTestObject('Page_Circus/input_Error text_password'), 'P9ET2sDE0SE=')
		WebUI.click(findTestObject('Page_Circus/input_Error text_action'))
	}

	@Given("I search for keyword (.*)")
	def I_verify_the_status_in_step(String keyword) {
		WebUI.setText(findTestObject('Object Repository/Page_Circus/input_Keyword_keyword'), keyword)
		WebUI.click(findTestObject('Object Repository/Page_Circus/input_Keyword_defBtn'))
	}

	@And("I enter (.*) into Tickets to buy field")
	def I_enter_quantity_into_Tickets_to_buy_field(String quantity) {
		WebUI.setText(findTestObject('Object Repository/Page_Circus/input__105'), quantity)
	}

	@And("I press Book")
	def I_press_book() {
		WebUI.click(findTestObject('Object Repository/Page_Circus/button_Book'))
	}

	@When("I visit Cart page")
	def I_visit_cart_page() {
		WebUI.click(findTestObject('Object Repository/Page_Circus/a_cart'))
	}

	@Then("Total tickets to buy equals (.*)")
	def Total_tickets_to_buy_equals_quantity(String quantity) {
		String actualValue = findTestObject('Object Repository/Page_Circus/ticketsCount').findPropertyValue("text")
		WebUI.verifyEqual(quantity, actualValue)
	}

	@And("I verify the (.*)")
	def I_get_the_totalPrice(String totalPrice) {
		String actualTotalPrice = findTestObject('Object Repository/Page_Circus/totalPrice').findPropertyValue("text")
		WebUI.verifyqual(totalPrice, actualTotalPrice)
	}
}