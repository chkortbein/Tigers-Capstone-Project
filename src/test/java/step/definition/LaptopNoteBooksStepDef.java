package step.definition;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page.objects.LaptopPageObject;
import utilities.Utils;


public class LaptopNoteBooksStepDef extends Base {
	LaptopPageObject laptopPage = new LaptopPageObject();

	//syntax @Tag("exact words of step from scenario")
	//		public void nameOfTheMethod(){}
	
	//Background
	@When("User click on Laptop & NoteBook tab")
	public void user_click_on_laptop_tab() {
		laptopPage.clickonDesktopsTab();
		logger.info("Laptop & NoteBook tab was clicked successfully");
	}
	
	@And("User click on Show all Laptop & NoteBook option")
	public void user_click_on_show_all_laptops() {
		laptopPage.clickOnShowAllLaptopsNotebooks();
		logger.info("Show all Laptop & NoteBook option was clicked successfully");
	}
	
	//Scenario 1	
	
	@And("User click on MacBook item")
	public void user_click_on_macbook_item() {
		laptopPage.clickOnMacBook();
		logger.info("MacBook item was clicked successfully");
	}
	
	@And("User clicks add to Cart button Mac book")
	public void user_clicks_add_to_cart_button_mac_book() {
		laptopPage.clickOnAddToCartButtonMacBook();
		logger.info("MacBook 'Add to Cart' button was clicked successfully");
	}
	
	@Then("User should observe a message 'Success: You have added MacBook to your shopping cart!'")
	public void user_should_see_success_message(String expectedSuccessMessage) {
		Assert.assertEquals(laptopPage.successMessage(), expectedSuccessMessage);
		logger.info(expectedSuccessMessage + " equals to "+laptopPage.successMessage() );
		Utils.takeScreenshotForStep();
		Utils.hardWait();
	}
	
	@And("User should see 1 items- 602.00 showed to the cart")
	public void user_should_see_602_in_cart(String string) {
		System.out.println(laptopPage.verifyOneItem602() + " from print");
		logger.info("'$602.00' is present in cart");
	}
	
	@And("User click on cart option")
	public void user_click_on_cart_option() {
		laptopPage.clickOnCart();
		
	}
	
	@And("user click on red X button to remove the item from cart")
	public void user_click_on_red_x() {
		laptopPage.clickOnRemoveButton();
		logger.info("red X button clicked successfully");
	}
	
	@Then("item should be removed and cart should show 0 items")
	public void item_sb_removed_and_cart_show_0() {
		laptopPage.verifyZeroItems();
		logger.info("Cart is empty");
	}
	
	//Scenario 2
	
	@And("User click on product comparison icon on 'MacBook'")
	public void user_click_product_comparison_icon_macbook() {
		laptopPage.clickOnProductComparisonMacBook();
		logger.info("Product comparison icon on 'MacBook' clicked successfully");
	}
	
	@And("User click on product comparison icon on 'MacBook Air'")
	public void user_click_on_product_comparison_icon_macbook_air() {
		laptopPage.clickOnProductComparisonMacBookAir();
		logger.info("Product comparison icon on 'MacBook Air' clicked successfully");
	}
			
	@Then("User should observe a message 'Success: You have added MacBook Air to your product comparison!'")
	public void user_should_see_product_comparison_success_message(String expectedProdCompSuccessMessage) {
		Assert.assertEquals(laptopPage.productComparisonSuccessMessage(), expectedProdCompSuccessMessage);
		logger.info(expectedProdCompSuccessMessage + " equals to "+laptopPage.productComparisonSuccessMessage() );
		Utils.takeScreenshotForStep();
		Utils.hardWait();
	}
	
	//Scenario 3	
	
	@And("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptopPage.clickOnProductComparisonLink();
		logger.info("Product comparison link clicked successfully");
	}
	
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart(String expectedBreadcrumb) {
		Assert.assertEquals(laptopPage.productComparisonBreadcrumbValidation(), expectedBreadcrumb);
		logger.info(expectedBreadcrumb + " equals to "+laptopPage.productComparisonBreadcrumbValidation() );
		Utils.takeScreenshotForStep();
		Utils.hardWait();
	}
	
	@And("User click on heart icon to add 'Sony VaIO' laptop to wish list")
	public void User_click_on_heart_icon_to_add_Sony_VaIO_laptop_to_wish_list() {
		laptopPage.clickOnHeartIconSonyVaio();
		logger.info("heart icon to add 'Sony VaIO' laptop to wish list clicked successfully");
	}

	@Then("User should get a message 'You must login or create an account to save Sony VAIO to your wish list!'")
	public void Message_You_must_login_or_create_an_account_to_save_Sony_VAIO_to_your_wish_list(String expectedSonyVaioWishListLoginMessage) {
		Assert.assertEquals(laptopPage.sonyVaioWishListLoginMessage(), expectedSonyVaioWishListLoginMessage);
		logger.info(expectedSonyVaioWishListLoginMessage + " equals to "+laptopPage.sonyVaioWishListLoginMessage() );
		Utils.takeScreenshotForStep();
		Utils.hardWait();
	}
	
	//Scenario 4	
	
	@And("User click on 'MacBook Pro' item")
	public void user_click_on_macbook_pro_item() {
		laptopPage.clickOnMacBookPro();
		logger.info("'MacBook Pro' item clicked successfully");
	}
	
	@Then("User should see '$2,000.00' price tag is present on UI")
	public void user_should_see_2000_dollar_price_tag(String string) {
		System.out.println(laptopPage.verifyPriceTag2000() + " from print");
		logger.info("'$2,000.00' price tag is present on UI");
	}
	
}
