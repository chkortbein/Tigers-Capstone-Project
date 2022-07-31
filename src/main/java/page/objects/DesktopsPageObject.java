package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class DesktopsPageObject extends Base {
	public DesktopsPageObject() {
		PageFactory.initElements(driver,this);
	}
	
	// syntax for storing UI Element in POM Class using PageFactory implementation
	// @FindBy(locatorType="Locator")
	//AccessModifier WebElement NameOfElement;
	
	@FindBy(id="logo")
	private WebElement isLogoPresent;
	
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktops;
	
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;
	
	@FindBy(tagName = "img")
	private List <WebElement> items; //driver.FindElements
	
	@FindBy(xpath = "//a[text()='HP LP3065']")
	private WebElement hpLP3065;
	
	@FindBy(id = "input-quantity")
	private WebElement quantityInput;
	
	@FindBy(id = "button-cart")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//a[text()='HP LP3065'])[3]")
	private WebElement HPLPsuccessMessage;
	
	//re-use code from Canon review below to find Canon EOS 5D Camera link for adding to cart
	
	@FindBy(id = "input-option226")
	private WebElement canonSelectDropdown;
	
	@FindBy(xpath = "//select[@id='input-option226']/option[2]")
	private WebElement canonSelectRed;
	
	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement canonEos5dCamera;
	
	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement writeReviewLink;
	
	@FindBy(id = "input-name")
	private WebElement yourNameField;
	
	@FindBy(id="input-review")
	private WebElement yourReviewField;
	
	@FindBy(xpath = "//input[@type='radio']")
	private List <WebElement> rating;
	
	@FindBy(id="button-review")
	private WebElement reviewContinueButton;
	
	@FindBy(xpath = "//*[@id=\"form-review\"]/div[2]/text()")
	private String reviewSubmissionMessage;
	
	public String getTestEnvironmentText() {
		String textFromUI = isLogoPresent.getText();
		return textFromUI;
	}
	
	public void clickonDesktopsTab() {
		Utils.hoverMouseOverElement(desktops);
	}
	
	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}
	
	public List<WebElement> desktopItems() {
		List<WebElement> itemsDesk = items;
		return itemsDesk;
	}
	
	public void clickOnHPLP3065Item() {
		hpLP3065.click();
	}
	
	public void selectQuantity(String quantityValue) {
		quantityInput.clear();
		quantityInput.sendKeys(quantityValue);
	}
	
	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}
	
	public String successMessage() {
		String actualResult = "Success: You have added " + HPLPsuccessMessage.getText()+" to your shopping cart!";
		return actualResult;
	}
	
	public void clickOnCanonSelectDropdown() {
		canonSelectDropdown.click();
	}
	
	public void clickOnCanonSelectRed() {
		canonSelectRed.click();
	}
	
	public void clickOncanonEos5dCamera() {
		canonEos5dCamera.click();
	}
	
	public void clickOnwriteReviewLink() {
		writeReviewLink.click();
	}
	
	public void enterYourName(String nameValue) {
		yourNameField.sendKeys(nameValue);
	}
	
	public void enterYourReview(String reviewValue) {
		yourReviewField.sendKeys(reviewValue);
	}	
	
	public void selectRating(String ratingValue) {
		List<WebElement> ratingElements = rating;
		for(WebElement element:ratingElements) {
			if(element.getAttribute("value").equalsIgnoreCase(ratingValue.trim())) {
				element.click();
				break;
			}
		}
	}
	
	public void clickOnContinueButtonDesktops() {
	reviewContinueButton.click();
	}
	
	public String reviewText() {
		return reviewSubmissionMessage;
	}
	
	// syntax for method
	// accessModifier returnType method name
}
