package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {

	public HomePageObject() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//button[span[text()='Currency']]")
	private WebElement currency;
	
	@FindBy(xpath = "//button[@name='EUR'])")
	private WebElement euro;
	
	@FindBy(xpath = "//button[contains(text(),'€')]")
	private WebElement currencyChangeToEuro;
	
	@FindBy(xpath = "//button/span[text()='0 item(s) - 0.00€']")
	private WebElement shoppingCartButton;
	
	@FindBy(xpath = "//p[text()='Your shopping cart is empty!']")
	private WebElement emptyShoppingCartMessage;	
	
	public void clickOnCurrency() {
		currency.click();
	}
	
	public void clickOnEuro() {
		euro.click();
	}
	
	public String shoppingCartText() {
		String actualText = currencyChangeToEuro.getText();
		return actualText;
	}
	
	public void clickOnShoppingCartButton() {
		shoppingCartButton.click();
	}
	
	public String emptyShoppingCartMessage() {
		String actualText = emptyShoppingCartMessage.getText();
		return actualText;
	}
}
