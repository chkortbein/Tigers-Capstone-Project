package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class LaptopPageObject extends Base {
	public LaptopPageObject() {
		PageFactory.initElements(driver,this);
	}
	
	//Background
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsNotebooks;
	
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsNotebooks;
	
	
	//Scenario 1
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBook;
	
	@FindBy(id = "button-cart")
	private WebElement addToCartButtonMacBook;
	
	@FindBy(xpath = "//a[text()='MacBook'])[3]")
	private WebElement MacBooksuccessMessage;
	
	@FindBy(xpath = "//button/span[text()='1 item(s) - $602.00']")
	private WebElement oneItem602;
	
	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement removeButton;
	
	@FindBy(xpath = "//button/span[text()=' 0 item(s) - $0.00']")
	private WebElement zeroItems;
	
	
	//Scenario 2
	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[7]/div/div[2]/div[2]/button[3]")
	private WebElement productComparisonButtonMacBook;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[8]/div/div[2]/div[2]/button[3]")
	private WebElement productComparisonButtonMacBookAir;
	
	@FindBy(xpath = "//div[contains(@class, 'alert-success') and contains(./a, 'MacBook Air')]/a[1]/text()")
	private WebElement productComparisonSuccessMacBookAir;
	
	
	//Scenario 3
	@FindBy(xpath = "//div[contains(@class, 'alert-success') and contains(./a, 'MacBook Air')]/a[2]/text()")
	private WebElement productComparisonSuccessLink;
	
	@FindBy(xpath = "//ul[@class='breadcrumb']/li[2]/a/text()")
	private WebElement productComparisonBreadcrumb;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[last()]/parent::*")
	private WebElement heartIconSonyVaio;
	
	@FindBy(xpath = "//div[contains(@class, 'alert-success') and contains(./a, 'login')]/a[1]/text()")
	private WebElement sonyVaioYouMustLoginLink;
	
	@FindBy(xpath = "//div[contains(@class, 'alert-success') and contains(./a, 'login')]/a[2]/text()")
	private WebElement sonyVaioCreateAnAccountLink;
	
	@FindBy(xpath = "//div[contains(@class, 'alert-success') and contains(./a, 'login')]/a[3]/text()")
	private WebElement sonyVaioSonyVaioLink;
	
	@FindBy(xpath = "//div[contains(@class, 'alert-success') and contains(./a, 'login')]/a[4]/text()")
	private WebElement sonyVaioWishListLink;
	
	
	//Scenario 4
	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement macBookPro;
	
	@FindBy(xpath = "//h2[text()='$2,000.00']")
	private WebElement priceTag2000;
	
	///////////////////////////////////////////////////////////////
	
	//Background
	public void clickonDesktopsTab() {
		Utils.hoverMouseOverElement(laptopsNotebooks);
	}
	
	public void clickOnShowAllLaptopsNotebooks() {
		showAllLaptopsNotebooks.click();
	}
	
	//Scenario 1
	public void clickOnMacBook() {
		macBook.click();
	}
	
	public void clickOnAddToCartButtonMacBook() {
		addToCartButtonMacBook.click();
	}
	
	public String successMessage() {
		String actualResult = "Success: You have added " + MacBooksuccessMessage.getText()+" to your shopping cart!";
		return actualResult;
	}
	
	public String verifyOneItem602() {
		String actualCartMessage = oneItem602.getText();
		return actualCartMessage;
	}
	
	public void clickOnCart() {
		oneItem602.click();
	}
	
	public void clickOnRemoveButton() {
		removeButton.click();
	}
	
	public String verifyZeroItems() {
		String actualCartMessage = zeroItems.getText();
		return actualCartMessage;
	}
	
	//Scenario 2
	public void clickOnProductComparisonMacBook() {
		productComparisonButtonMacBook.click();
	}
	
	public void clickOnProductComparisonMacBookAir() {
		productComparisonButtonMacBookAir.click();
	}
	 
	public String productComparisonSuccessMessage() {
		String actualResultComparisonSuccess = "Success: You have added " + productComparisonSuccessMacBookAir.getText()+" to your "+productComparisonSuccessLink.getText();
		return actualResultComparisonSuccess;
	}
	
	//Scenario 3
	public void clickOnProductComparisonLink() {
		productComparisonSuccessLink.click();
	}
	
	public String productComparisonBreadcrumbValidation() {
		String actualResultProductComparisonBreadcrumb = productComparisonBreadcrumb.getText();
		return actualResultProductComparisonBreadcrumb;
	}
	
	public void clickOnHeartIconSonyVaio() {
		heartIconSonyVaio.click();
	}
	
	public String sonyVaioWishListLoginMessage() {
		String actualResultSonyVaioWishListLoginMessage = "You must " + sonyVaioYouMustLoginLink.getText() + " or " + sonyVaioCreateAnAccountLink.getText() + " to save " + sonyVaioSonyVaioLink.getText() + " to your " + sonyVaioWishListLink.getText() + "!";
		return actualResultSonyVaioWishListLoginMessage;
	}
	
	//Scenario 4
	public void clickOnMacBookPro() {
		macBookPro.click();
	}
	
	public String verifyPriceTag2000() {
		String actualPriceTag = priceTag2000.getText();
		return actualPriceTag;
	}
	
	
}
