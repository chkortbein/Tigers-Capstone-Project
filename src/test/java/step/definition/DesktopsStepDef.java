package step.definition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page.objects.DesktopsPageObject;
import utilities.Utils;

public class DesktopsStepDef extends Base {

	DesktopsPageObject desktopPage = new DesktopsPageObject();

	// syntax @Tag("exact words of step from scenario")
	// public void nameOfTheMethod(){}
	@Given("User is on Retail Website")
	public void user_is_on_Retail_website() {
		String expectedText = "TEST ENVIRONMENT";
		String actualText = desktopPage.getTestEnvironmentText();
		Assert.assertEquals(expectedText, actualText);
		logger.info("Text Test Environment was verified");
	}

	@When("User click on Desktops tab")
	public void user_click_on_Desktops_tab() {
		Utils.hardWait();
		desktopPage.clickonDesktopsTab();
		logger.info("user clicked on Desktops tab");
		Utils.takeScreenshotForStep();
	}

	@And("User click on Show all desktops")
	public void userClickOnShowAllDesktops() {
		Utils.hardWait();
		desktopPage.clickOnShowAllDesktops();
		logger.info("user_clicked_on_Show_all_desktops");
	}

	/*
	 * step 1: we need to store the element in a list step 2: we need to iterate
	 * through the list step 3: we need to write an assertion to validate each
	 * element (index) is present
	 */

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		List<WebElement> desktopsElements = desktopPage.desktopItems();
		for (WebElement element : desktopsElements) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("title") + " is present");
		}
		Utils.takeScreenshotForStep();
		Utils.hardWait();
	}

	@When("User click ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		desktopPage.clickOnHPLP3065Item();
		logger.info("user clicked on HPLP3065 Option");
	}

	@When("User select quantity {string}")
	public void user_select_quantity(String string) {
		desktopPage.selectQuantity(string);
		logger.info("user selected quantity " + string);
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktopPage.clickOnAddToCartButton();
		logger.info("user clicked add to cart button");
	}

	// Potential duplicate - check
	@Then("User should see a message {string}")
	public void user_should_see_a_message(String expectedSuccessMessage) {
		Assert.assertEquals(desktopPage.successMessage(), expectedSuccessMessage);
		logger.info(expectedSuccessMessage + " equals to " + desktopPage.successMessage());
		Utils.takeScreenshotForStep();
		Utils.hardWait();
	}

	@When("User click ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		desktopPage.clickOncanonEos5dCamera();
		logger.info("user successfully clicked add to cart button");
	}

	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		desktopPage.clickOnCanonSelectDropdown();
		desktopPage.clickOnCanonSelectRed();
		logger.info("user successfully selected red from dropdown");
	}

	@When("User selects quantity {string}")
	public void user_selects_quantity(String string) {
		desktopPage.selectQuantity(string);
		logger.info("user selected quantity " + string);
	}

	@When("User clicks add to Cart button")
	public void user_clicks_add_to_cart_button() {
		desktopPage.clickOnAddToCartButton();
		logger.info("user clicked add to cart button");
	}

	// Potential duplicate - check
	@Then("User should see a success message {string}")
	public void user_should_see_a_success_message(String expectedSuccessMessage) {
		Assert.assertEquals(desktopPage.successMessage(), expectedSuccessMessage);
		logger.info(expectedSuccessMessage + " equals to " + desktopPage.successMessage());
		Utils.takeScreenshotForStep();
		Utils.hardWait();
	}

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktopPage.clickOncanonEos5dCamera();
		logger.info("canon_eos_5d_item clicked successfully");
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopPage.clickOnwriteReviewLink();
		logger.info("write_a_review_link clicked successfully");
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> reviewInformation = dataTable.asMaps(String.class, String.class);
		desktopPage.enterYourName(reviewInformation.get(0).get("yourname"));
		desktopPage.enterYourReview(reviewInformation.get(0).get("yourreview"));
		desktopPage.selectRating(reviewInformation.get(0).get("Rating"));
		logger.info("Review form filled out successfully");
		Utils.hardWait();
	}

	@And("User clicks on Continue Button")
	public void user_clickon_continue_button_desktops() {
		desktopPage.clickOnContinueButtonDesktops();
		logger.info("Continue Button clicked successfully");
	}

	// Potential duplicate - check
	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) {
		System.out.println(desktopPage.reviewText() + " from print");
		logger.info("desktopPage.reviewText()");
	}

}
