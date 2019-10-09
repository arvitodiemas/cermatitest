import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.cermati.com/gabung')

WebUI.click(findTestObject('Object Repository/Register Account/Page_Bandingkan Kartu Kredit Pinjaman Tabungan dan Promo Terbaik - Cermati/button_Nanti Saja'))

WebUI.setText(findTestObject('Object Repository/Register Account/Page_Bandingkan Kartu Kredit Pinjaman Tabungan dan Promo Terbaik - Cermati/input__email'), 
    'billytest123@email.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Register Account/Page_Bandingkan Kartu Kredit Pinjaman Tabungan dan Promo Terbaik - Cermati/input__password'), 
    'rkv+uyeJSgeLZ+whATs4iw==')

WebUI.setText(findTestObject('Object Repository/Register Account/Page_Bandingkan Kartu Kredit Pinjaman Tabungan dan Promo Terbaik - Cermati/input__firstName'), 
    'Billy')

WebUI.setText(findTestObject('Object Repository/Register Account/Page_Bandingkan Kartu Kredit Pinjaman Tabungan dan Promo Terbaik - Cermati/input__lastName'), 
    'Herrington')

WebUI.setText(findTestObject('Object Repository/Register Account/Page_Bandingkan Kartu Kredit Pinjaman Tabungan dan Promo Terbaik - Cermati/input__mobilePhone'), 
    '08123456789')

WebUI.setText(findTestObject('Object Repository/Register Account/Page_Bandingkan Kartu Kredit Pinjaman Tabungan dan Promo Terbaik - Cermati/input__residenceCity'), 
    'Yogyakarta')

WebUI.click(findTestObject('Object Repository/Register Account/Page_Bandingkan Kartu Kredit Pinjaman Tabungan dan Promo Terbaik - Cermati/div_KOTA YOGYAKARTA'))

WebUI.setText(findTestObject('Object Repository/Register Account/Page_Bandingkan Kartu Kredit Pinjaman Tabungan dan Promo Terbaik - Cermati/input__residenceCity'), 
    'KOTA YOGYAKARTA')

WebUI.click(findTestObject('Object Repository/Register Account/Page_Bandingkan Kartu Kredit Pinjaman Tabungan dan Promo Terbaik - Cermati/button_Daftar Akun'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Account/Page_Cermati Pinjaman Kartu Kredit Asuransi Tabungan Online Terbaik - Cermati/a_Billy'), 0)

WebUI.closeBrowser()

