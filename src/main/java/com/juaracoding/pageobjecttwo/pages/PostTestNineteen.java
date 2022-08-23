package com.juaracoding.pageobjecttwo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.pageobjecttwo.drivers.DriverSingleton;

public class PostTestNineteen {
	private WebDriver driver;

	public PostTestNineteen() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='reg_username']")
	private WebElement userRegist;

	@FindBy(xpath = "//input[@id='reg_email']")
	private WebElement emailRegist;

	@FindBy(xpath = "//input[@id='reg_password']")
	private WebElement passwordRegist;

	@FindBy(xpath = "//button[@name='register']")
	private WebElement btnRegist;

	// Login
	@FindBy(xpath = "//input[@id='user_login']")
	private WebElement usernameLogin;

	@FindBy(xpath = "//input[@id='user_pass']")
	private WebElement passwordLogin;

	@FindBy(xpath = "//input[@id='wp-submit']")
	private WebElement btnLogin;

	@FindBy(xpath = "//a[normalize-space()='Orders']")
	private WebElement btnOrder;

	@FindBy(xpath = "//a[@class='woocommerce-Button button']")
	private WebElement btnBrowse;

	@FindBy(xpath = "//a[@class='noo-search']")
	private WebElement btnSearch;

	@FindBy(xpath = "//input[@type='search']")
	private WebElement searchInput;

	@FindBy(xpath = "//div[@class='noo-product-inner']//a[normalize-space()='black lux graphic t-shirt']")
	private WebElement scrollBlack;

	@FindBy(css = ".compare.button[href='https://shop.demoqa.com?action=yith-woocompare-add-product&id=1485']")
	private WebElement compareOne;

	@FindBy(xpath = "//*[@id=\"cboxClose\"]")
	private WebElement closeWindow;

	@FindBy(xpath = "//a[normalize-space()='black ribbed short sleeve lettuce hem midi dress']")
	private WebElement clickProductTitle;

	@FindBy(xpath = "//div[@class='summary entry-summary']//a[@class='compare button'][normalize-space()='Compare']")
	private WebElement compareTwo;

	@FindBy(css = "a[aria-label='Select options for “black ribbed short sleeve lettuce hem midi dress”']")
	private WebElement selectProduct;

	@FindBy(xpath = "//select[@id='pa_color']")
	private WebElement selectColor;

	@FindBy(xpath = "//select[@id='pa_size']")
	private WebElement selectSize;

	@FindBy(xpath = "//button[normalize-space()='Add to cart']")
	private WebElement btnAddToCart;

	@FindBy(xpath = "//a[@class='button wc-forward']")
	private WebElement viewCart;

	@FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
	private WebElement proceedCheckout;

	@FindBy(xpath = "//input[@id='billing_first_name']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@id='billing_last_name']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@id='billing_company']")
	private WebElement companyName;

	@FindBy(css = "#billing_address_1")
	private WebElement houseNumber;

	@FindBy(xpath = "//input[@id='billing_address_2']")
	private WebElement suiteUnit;

	@FindBy(xpath = "//input[@id='billing_city']")
	private WebElement townCity;

	@FindBy(css = "#select2-billing_state-container")
	private WebElement selectProvice;

	@FindBy(xpath = "//input[@role='combobox']")
	private WebElement inputProvince;

	@FindBy(xpath = "//input[@id='billing_postcode']")
	private WebElement inputPostcode;

	@FindBy(xpath = "//input[@id='billing_phone']")
	private WebElement inputPhone;
	
	@FindBy(xpath = "//textarea[@id='order_comments']")
	private WebElement inputNote;
	
	@FindBy(xpath = "//input[@id='terms']")
	private WebElement agreeBox;
	
	@FindBy(xpath = "//button[@id='place_order']")
	private WebElement btnPlacedOrder;

// Replace
	public void usernameReg() {
		userRegist.sendKeys("BabaNa118");
	}

	public void emailReg() {
		emailRegist.sendKeys("BabaNa118@gmail.com");
	}

	public void passwordReg() {
		passwordRegist.sendKeys("BabaNa@123456");
	}

	public void regist() {
		btnRegist.click();
	}
	
	public void usernameLogin() {
		usernameLogin.sendKeys("BabaNa118");
	}

	public void passwordLogin() {
		passwordLogin.sendKeys("BabaNa@123456");
	}

	public void btnLogin() {
		btnLogin.click();
	}

	public void btnOrder() {
		btnOrder.click();
	}

	public void btnBrowse() {
		btnBrowse.click();
	}

	public void search() {
		btnSearch.click();
	}

	public void searchInput() {
		searchInput.sendKeys("black" + "\n");
	}

	public void compareOne() {
		compareOne.click();
	}

	public void closeWindow() {
		closeWindow.click();

	}

	public void clickProductTitle() {
		clickProductTitle.click();
	}

	public void compareTwo() {
		compareTwo.click();
	}

	public void selectProduct() {
		selectProduct.click();

	}

	public void addCart() {
		Select select = new Select(selectColor);
		select.selectByValue("black");
		delay(3);
		selectColor.click();

		Select selectOne = new Select(selectSize);
		selectOne.selectByValue("medium");
		delay(3);
		selectSize.click();
		btnAddToCart.click();
	}

	public void viewCart() {
		viewCart.click();
	}

	public void proceedCheckout() {
		proceedCheckout.click();
	}

	public void firstName() {
		firstName.sendKeys("BabaNa");
	}

	public void lastName() {
		lastName.sendKeys("QA Engineer");

	}

	public void companyName() {
		companyName.sendKeys("PT Juara Coding Oke");
	}

	public void houseNumber() {
		houseNumber.sendKeys("110A");
	}

	public void suiteUnit() {
		suiteUnit.sendKeys("Block ABC");
	}

	public void townCity() {
		townCity.sendKeys("Delhi");
	}

	public void selectProvice() {
		selectProvice.click();

	}

	public void inputProvince() {
		inputProvince.sendKeys("Del" + "\n");
	}
	
	public void inputPostcode() {
		inputPostcode.sendKeys("110002");
	}
	
	public void inputPhone() {
		inputPhone.sendKeys("0878123456");
	}
	
	public void inputNote() {
		inputNote.sendKeys("Extra bubble wrap, please!");
	}
	
	public void agreeBox() {
		agreeBox.click();
	}
	
	public void btnPlacedOrder() {
		btnPlacedOrder.click();
	}
	
	static void delay(int detik) {
		try {
			Thread.sleep(1000 * detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
