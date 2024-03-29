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

//to create gist and can be called for edit and delete
WebUI.callTestCase(findTestCase('end to end test/Common/As a user, I can login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://gist.github.com/')

WebUI.setText(findTestObject('GistFeature/input_filename'), 'New File')

WebUI.setText(findTestObject('GistFeature/input_context'), 'Context')

WebUI.click(findTestObject('GistFeature/button_create_public_git'))

//to verify the text of our input is present
WebUI.verifyTextPresent('Context', false)

WebUI.verifyTextPresent('New File', false)

