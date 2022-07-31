package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import page.objects.RetailPageObj;
import utilities.Utils;

public class RetailStepDefinition extends Base {
	RetailPageObj retailPage = new RetailPageObj();
	
	//Background
	
	@Given("User is on Retail website")
	public void user_is_on_Retail_website() {
		String expectedText = "TEST ENVIRONMENT";
		String actualText = retailPage.getTestEnvironmentText();
		Assert.assertEquals(expectedText, actualText);
		logger.info("Text Test Environment was verified");
	}
	
	@And("User click on MyAccount")
	public void user_click_on_MyAccount() {
		retailPage.clickOnMyAccountButton();
		logger.info("My Account button was clicked successfully");
	}
	
	@When("User click on Login")
	public void user_click_on_Login() {
		retailPage.clicksOnLogin();
		logger.info("Login link was clicked successfully");
	}
	
	@And("User enter username 'userName' and password 'password'")
	public void user_enter_username_and_password() {
		retailPage.enterUserName("tigerstekschool9@gmail.com");
		retailPage.enterPassword("tigers!1!2");
		logger.info("Email and password were entered successfully");
	}
	
	@And("User click on Login button")
	public void user_click_on_Login_button() {
		retailPage.clickOnLoginButton();
		logger.info("Login button was clicked successfully");
	}
	
	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_MyAccount_dashboard() {
		String expectedText = "My Account";
		String ActualText = retailPage.getTextAfterLogin();
		Assert.assertEquals(expectedText, ActualText);
		logger.info("My Account text was verified successfully");
	}
	
	//First Scenario
	
	@When("User click on 'Register for an Affiliate Account' link")
	public void user_click_on_register_for_an_afficliate_account_link() {
		retailPage.clicksRegisterAffiliateAccount();
		logger.info("Register for an Affiliate Account link clicked successfully");
	}
	
	@And("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailPage.enterCompany(data.get(0).get("company"));
		retailPage.enterWebsite(data.get(0).get("website"));
		retailPage.enterTaxId(data.get(0).get("taxID"));
		retailPage.selectPaymentMethod(data.get(0).get("paymentMethod"));
		retailPage.enterChequePayee(data.get(0).get("payeeName"));
		Utils.takeScreenshotForStep();
		logger.info("Affiliate form is filled out successfully");
	}
	
	@And("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retailPage.checkAboutUsCheckBox();
		logger.info("About us check box clicked successfully");
	}
	
	@And("User clicks on Continue button")
	public void user_click_on_continue_button_cheque() {
		retailPage.clickOnContinueButton();
		logger.info("Continue button clicked successfully");
	}
	
	@Then("User should see a Success Message")
	public void user_should_see_a_success_message() {
		String expectedText = "Success: Your account has been successfully updated.";
		String ActualText = retailPage.addAffiliateSuccessMessage();
		Assert.assertEquals(expectedText, ActualText);
		logger.info("Success: Your account has been successfully updated.");
	}
	
	//Second Scenario
	@When("User click on 'Edit your affiliate information' link")
	public void user_click_on_edit_your_affiliate_information_link() {
		retailPage.clickOnEditAffiliateLink();
		logger.info("'Edit your affiliate information' link clicked successfully");
	}
	
	@And("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retailPage.selectPaymentMethod("bank");
		logger.info("Bank Transfer radio button clicked successfully");
	}
	
	@And("User fill Bank information with below information")
	public void user_click_on_bank_transfer_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailPage.enterBankName(data.get(0).get("bankName"));
		retailPage.enterBankBranchNumber(data.get(0).get("abaNumber"));
		retailPage.enterBankSwiftCode(data.get(0).get("swiftCode"));
		retailPage.enterBankAccountName(data.get(0).get("accountName"));
		retailPage.enterBankAccountNumber(data.get(0).get("accountNumber"));
		Utils.takeScreenshotForStep();
		logger.info("Bank account form is filled-out successfully");
	}
	
	@And("User click on Continue button")
	public void user_click_on_continue_button_bank_transfer() {
		retailPage.clickOnContinueButton();
		logger.info("Continue button clicked successfully");
	}
	
	@Then("User should see a success message")
	public void user_should_see_a_success_message_update() {
		String expectedText = "Success: Your account has been successfully updated.";
		String ActualText = retailPage.updateAffiliateSuccessMessage();
		Assert.assertEquals(expectedText, ActualText);
		logger.info("Success: Your account has been successfully updated.");
	}
	
	//Third Scenario
	@When("User click on 'Edit your account information' link")
	public void user_click_on_edit_your_account_information_link() {
		retailPage.clickOnEditAccountLink();
		logger.info("'Edit your account information' link clicked successfully");
	}
	
	@And("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailPage.enterFirstName(data.get(0).get("firstname"));
		retailPage.enterLastName(data.get(0).get("lastname"));
		retailPage.enterEmail(data.get(0).get("email"));
		retailPage.enterTelephone(data.get(0).get("telephone"));
		Utils.takeScreenshotForStep();
		logger.info("Edit Account Information form is filled-out successfully");
	}
	
	@And("User click on continue button")
	public void user_click_on_continue_button_edit_account() {
		retailPage.clickOnContinueButton();
		logger.info("Continue button clicked successfully");
	}
	
	@Then("User should observe a success message 'Success: Your account has been successfully updated.'")
	public void user_should_see_a_success_message2() {
		String expectedText = "Success: Your account has been successfully updated.";
		String ActualText = retailPage.updateAccountSuccessMessage();
		Assert.assertEquals(expectedText, ActualText);
		logger.info("Success: Your account has been successfully updated.");
	}
	
	
	
}
