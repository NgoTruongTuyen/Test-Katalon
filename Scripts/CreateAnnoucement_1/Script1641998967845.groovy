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

WebUI.navigateToUrl('http://localhost:81/')

WebUI.click(findTestObject('Object Repository/CreateAnnoucement_1/Page_Moodle Site/a_Log in'))

WebUI.setText(findTestObject('Object Repository/CreateAnnoucement_1/Page_Moodle Site Log in to the site/input_Username_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/CreateAnnoucement_1/Page_Moodle Site Log in to the site/input_Password_password'), 
    'YaaZ55zPeD2b3ZDZXEM02A==')

WebUI.click(findTestObject('Object Repository/CreateAnnoucement_1/Page_Moodle Site Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/CreateAnnoucement_1/Page_Dashboard/a_My courses'))

WebUI.click(findTestObject('Object Repository/CreateAnnoucement_1/Page_My courses/span_Java 3'))

WebUI.click(findTestObject('Object Repository/CreateAnnoucement_1/Page_Course Java 3/a_Announcements  Forum'))

WebUI.click(findTestObject('Object Repository/CreateAnnoucement_1/Page_Announcements/a_Add discussion topic'))

WebUI.setText(findTestObject('Object Repository/CreateAnnoucement_1/Page_Announcements/input_Subject_subject'), 'New Post Here')

WebUI.setText(findTestObject('Object Repository/CreateAnnoucement_1/Page_Announcements/div_New post description'), '<p dir="ltr" style="text-align: left;">New post description</p>')

WebUI.click(findTestObject('Object Repository/CreateAnnoucement_1/Page_Announcements/input_Rich text editor_submitbutton'))

WebUI.click(findTestObject('Object Repository/CreateAnnoucement_1/Page_Announcements/p_Your post was successfully added'))

WebUI.closeBrowser()

