package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePageObject;
import utilities.Utils;

public class HomePageSteps extends Base {
	
	HomePageObject homePage = new HomePageObject();
	
	//syntax @Tag("exact words of step from scenario")
	//		public void nameOfTheMethod(){}	
	
	@When("User click on Currency")
	public void user_click_on_currency() {
		homePage.clickOnCurrency();
		logger.info("Currency dropdown clicked successfully");
	}
	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePage.clickOnEuro();
		logger.info("Euro chosen successfully");
	}
	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		System.out.println(homePage.shoppingCartText() + " from print");
		logger.info("Currency changes to Euro successfully");
	}
	
	@When ("User click on shopping cart")
		public void user_click_on_shopping_cart() {
		homePage.clickOnShoppingCartButton();
		logger.info("shopping cart clicked successfully");
	}
	
	@Then ("'Your shopping cart is empty!' message should display")
	public void your_shopping_cart_is_empty(String expectedSuccessMessage) {
		Assert.assertEquals(homePage.emptyShoppingCartMessage(), expectedSuccessMessage);
		logger.info(expectedSuccessMessage + " equals to "+homePage.emptyShoppingCartMessage() );
		Utils.takeScreenshotForStep();
		Utils.hardWait();
	}

}
