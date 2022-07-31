package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObj extends Base {
	public RetailPageObj() {
		PageFactory.initElements(driver,this);
	}
	
	// syntax for storing UI Element in POM Class using PageFactory implementation
	// @FindBy(locatorType="Locator")
	//AccessModifier WebElement NameOfElement;
	
	
	//Background
	@FindBy(id="logo")
	private WebElement isLogoPresent;
	
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myAccount;
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement clicksLogin;
	
	@FindBy(id="input-email")
	private WebElement inputEmail;
	
	@FindBy(id = "input-password")
	private WebElement passwordField;
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;

	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountPage;
	
	
	//First Scenario
	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement clicksRegisterAffiliateAccount;
	
	@FindBy(id="input-company")
	private WebElement inputCompany;
	
	@FindBy(id="input-website")
	private WebElement inputWebsite;
	
	@FindBy(id="input-tax")
	private WebElement inputTaxId;
	
	@FindBy(xpath = "//input[@type='radio']")
	private List <WebElement> paymentMethod;
	
	@FindBy(id="input-cheque")
	private WebElement inputChequeName;
	
	@FindBy(xpath="//input[@name='agree']")
	private WebElement inputAboutUs;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continueButton;
	
	@FindBy(xpath="//div[contains(@class, 'alert-success')]")
	private WebElement addAffiliateSuccess;
	
	//Second scenario
	@FindBy(xpath="//a[text()='Edit your affiliate information']")
	private WebElement editAffiliateInformation;
	
	@FindBy(id="input-bank-name")
	private WebElement inputBankName;		
	
	@FindBy(id="input-bank-branch-number")
	private WebElement inputBankBranchNumber;
	
	@FindBy(id="input-bank-swift-code")
	private WebElement inputBankSwiftCode;
	
	@FindBy(id="input-bank-account-name")
	private WebElement inputBankAccountName;
	
	@FindBy(id="input-bank-account-number")
	private WebElement inputBankAccountNumber;
	
	//@FindBy(id="input-paypal")
	//private WebElement inputPaypalEmail;
	
	@FindBy(xpath="//div[contains(@class, 'alert-success')]/text()")
	private WebElement updateAffiliateSuccess;
	
	//Third Scenario
	
	@FindBy(xpath="//a[text()='Edit your account information']")
	private WebElement editAccountInformation;
	
	@FindBy(id = "input-firstname")
	private WebElement firstNameField;
	
	@FindBy(id = "input-lastname")
	private WebElement lastnameField;
	
	@FindBy(id = "input-email")
	private WebElement emailField;
	
	@FindBy(id = "input-telephone")
	private WebElement telephoneField;
	
	@FindBy(xpath="//div[contains(@class, 'alert-success')]")
	private WebElement updateAccountSuccess;
	
	//Background
	
	public String getTestEnvironmentText() {
		String textFromUI = isLogoPresent.getText();
		return textFromUI;
	}
	
	public void clickOnMyAccountButton() {
		myAccount.click();
	}
	
	public void clicksOnLogin() {
		clicksLogin.click();
	}
	
	public void enterUserName(String email) {
		inputEmail.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public String getTextAfterLogin() {
		String myAccountText = myAccountPage.getText();
		return myAccountText;
	}
	
	//First Scenario
	
	public void clicksRegisterAffiliateAccount() {
		clicksRegisterAffiliateAccount.click();
	}
	
	public void enterCompany(String companyValue) {
		inputCompany.sendKeys(companyValue);
	}
	
	public void enterWebsite(String websiteValue) {
		inputWebsite.sendKeys(websiteValue);
	}
	
	public void enterTaxId(String taxIdValue) {
		inputTaxId.sendKeys(taxIdValue);
	}
	
	public void selectPaymentMethod(String paymentValue) {
		List<WebElement> paymentElements = paymentMethod;
		for(WebElement element:paymentElements) {
			if(element.getAttribute("value").equalsIgnoreCase(paymentValue.trim())) {
				element.click();
				break;
			}
		}
	}
	
	public void enterChequePayee(String chequeNameValue) {
		inputChequeName.sendKeys(chequeNameValue);
	}
	
	public void checkAboutUsCheckBox() {
		inputAboutUs.click();
	}
	
	public void clickOnContinueButton() {
		continueButton.click();
	}
	
	public String addAffiliateSuccessMessage() {
		String actualAddAffiliateSuccess = addAffiliateSuccess.getText();
		return actualAddAffiliateSuccess;
	}
	
	//Second Scenario
	
	public void clickOnEditAffiliateLink() {
		editAffiliateInformation.click();
	}
	
	public void enterBankName(String bankNameValue) {
		inputBankName.sendKeys(bankNameValue);
	}
	
	public void enterBankBranchNumber(String bankBranchNumberValue) {
		inputBankBranchNumber.sendKeys(bankBranchNumberValue);
	}
	
	public void enterBankSwiftCode(String bankSwiftCodeValue) {
		inputBankSwiftCode.sendKeys(bankSwiftCodeValue);
	}
	
	public void enterBankAccountName(String bankAccountNameValue) {
		inputBankAccountName.sendKeys(bankAccountNameValue);
	}
	
	public void enterBankAccountNumber(String bankAccountNumberValue) {
		inputBankAccountNumber.sendKeys(bankAccountNumberValue);
	}
	
	//public void enterPaypalEmail(String paypalEmailValue) {
		//inputPaypalEmail.sendKeys(paypalEmailValue);
	//}
	
	public String updateAffiliateSuccessMessage() {
		String actualUpdateAffiliateSuccess = updateAffiliateSuccess.getText();
		return actualUpdateAffiliateSuccess;
	}
	
	//Third Scenario
	
	public void clickOnEditAccountLink() {
		editAccountInformation.click();
	}
	
	public void enterFirstName(String firstname) {
		firstNameField.sendKeys(firstname);
	}
	
	public void enterLastName(String lastname) {
		lastnameField.sendKeys(lastname);
	}
	
	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}
	
	public void enterTelephone(String telephone) {
		telephoneField.sendKeys(telephone);
	}	
	
	public String updateAccountSuccessMessage() {
		String actualUpdateAccountSuccess = updateAccountSuccess.getText();
		return actualUpdateAccountSuccess;
	}
	
}
