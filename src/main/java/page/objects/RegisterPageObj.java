package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class RegisterPageObj extends Base{
	
	public RegisterPageObj() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="logo")
	private WebElement isLogoPresent;
	
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myAccount;
	
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement registerLink;
	@FindBy(id = "input-firstname")
	private WebElement firstNameField;
	@FindBy(id = "input-lastname")
	private WebElement lastnameField;
	@FindBy(id = "input-email")
	private WebElement emailField;
	@FindBy(id = "input-telephone")
	private WebElement telephoneField;
	@FindBy(id = "input-password")
	private WebElement passwordField;
	@FindBy(id = "input-confirm")
	private WebElement confirmPassField;
	@FindBy(xpath = "//input[@value='1' and @name='newsletter']")
	private WebElement yesNewsLetter;
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement privacyPolicyCheckBox;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	@FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
	private WebElement accountCreatedMessage;
	
	
	public String getTestEnvironmentText() {
		String textFromUI = isLogoPresent.getText();
		return textFromUI;
	}
	
	public void clickOnMyAccountButton() {
		myAccount.click();
	}	
	
	public void clickOnRegisterLink() {
		registerLink.click();
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
	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}
	public void enterconfirmPassword(String confirmPass) {
		confirmPassField.sendKeys(confirmPass);
	}
	public void clickOnYesRadioBttn() {
		Utils.clickOnRadioButton(yesNewsLetter);
	}
	public void clickOnPrivacyPolicyCheckBox() {
		Utils.clickOnCheckBoxButton(privacyPolicyCheckBox);
	}
	public void clickOnContinueBttn() {
		continueButton.click();
	}
	public String getAccountCreatedMssgFromUI() {
		String actualMessage = accountCreatedMessage.getText();
		return actualMessage;
	}

}
