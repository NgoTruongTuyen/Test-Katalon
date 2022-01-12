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

WebUI.click(findTestObject('Object Repository/CreateUser_6/Page_Moodle Site/a_Log in'))

WebUI.setText(findTestObject('Object Repository/CreateUser_6/Page_Moodle Site Log in to the site/input_Username_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/CreateUser_6/Page_Moodle Site Log in to the site/input_Password_password'), 
    'YaaZ55zPeD2b3ZDZXEM02A==')

WebUI.click(findTestObject('Object Repository/CreateUser_6/Page_Moodle Site Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/CreateUser_6/Page_Dashboard/a_Site administration'))

WebUI.click(findTestObject('Object Repository/CreateUser_6/Page_Moodle Administration Search/a_Users'))

WebUI.click(findTestObject('Object Repository/CreateUser_6/Page_Moodle Administration Search/a_Add a new user'))

WebUI.setText(findTestObject('Object Repository/CreateUser_6/Page_Moodle Administration Users Accounts A_0fbd97/input_Username_username'), 
    'hhgiap2413')

WebUI.click(findTestObject('Object Repository/CreateUser_6/Page_Moodle Administration Users Accounts A_0fbd97/i_Click to enter text_icon fa fa-pencil fa-fw'))

WebUI.setEncryptedText(findTestObject('Object Repository/CreateUser_6/Page_Moodle Administration Users Accounts A_0fbd97/input_New password_newpassword'), 
    'YaaZ55zPeD2b3ZDZXEM02A==')

WebUI.setText(findTestObject('Object Repository/CreateUser_6/Page_Moodle Administration Users Accounts A_0fbd97/input_First name_firstname'), 
    'Hoang Huu')

WebUI.setText(findTestObject('Object Repository/CreateUser_6/Page_Moodle Administration Users Accounts A_0fbd97/input_Surname_lastname'), 
    'Giap')

WebUI.setText(findTestObject('Object Repository/CreateUser_6/Page_Moodle Administration Users Accounts A_0fbd97/input_Email address_email'), 
    'hoanghuugiap241@gmail.com')

WebUI.click(findTestObject('Object Repository/CreateUser_6/Page_Moodle Administration Users Accounts A_0fbd97/input_Address_submitbutton'))

WebUI.click(findTestObject('Object Repository/CreateUser_6/Page_Moodle Administration Users Accounts A_0fbd97/div_This email address is already registered'))

WebUI.closeBrowser()

