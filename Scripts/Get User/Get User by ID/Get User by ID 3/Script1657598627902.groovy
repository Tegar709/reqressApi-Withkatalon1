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
import groovy.json.JsonSlurper as JsonSlurper

Response = WS.sendRequest(findTestObject('Get User/Get User by ID/Get User by ID 3'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'data.id', 3)

WS.verifyElementPropertyValue(Response, 'data.email', 'emma.wong@reqres.in')

WS.verifyElementPropertyValue(Response, 'data.first_name', 'Emma')

WS.verifyElementPropertyValue(Response, 'data.last_name', 'Wong')

WS.verifyElementPropertyValue(Response, 'data.avatar', 'https://reqres.in/img/faces/3-image.jpg')

WS.verifyElementPropertyValue(Response, 'support.url', 'https://reqres.in/#support-heading')

WS.verifyElementPropertyValue(Response, 'support.text', 'To keep ReqRes free, contributions towards server costs are appreciated!')

