package com.juaracoding.pageobjecttwo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.pageobjecttwo.drivers.DriverSingleton;
import com.juaracoding.pageobjecttwo.pages.PostTestNineteen;

public class TestPostTestNineteen {

	public static WebDriver driver;
	private PostTestNineteen postTestNineteen;

	@BeforeClass
	public void setUp() {
		DriverSingleton.getInstace("Chrome");
		driver = DriverSingleton.getDriver();

		String url = "https://shop.demoqa.com/my-account/";
		driver.get(url);

	}

	@BeforeMethod
	public void pageObjectTwo() {
		postTestNineteen = new PostTestNineteen();
	}

	@Test
	public void testPostTestNineteen() {

		delay(3);
		scroll(700);
		postTestNineteen.usernameReg();
		postTestNineteen.emailReg();
		postTestNineteen.passwordReg();
		postTestNineteen.regist();
		System.out.println("You have successfully Registered a New Account.");

		delay(3);
		postTestNineteen.usernameLogin();
		postTestNineteen.passwordLogin();
		postTestNineteen.btnLogin();
		System.out.println("Your newly created account is successfully logged in.");

		delay(3);
		postTestNineteen.btnOrder();
		System.out.println("You're entering your order page.");
		postTestNineteen.btnBrowse();
		System.out.println("Do you wish to browse to other products?");
		postTestNineteen.search();
		postTestNineteen.searchInput();
		System.out.println("You're successfully search of your keyword");

		delay(3);
		postTestNineteen.compareOne();
		System.out.println("You have added a product to compare list.");
		delay(3);
		postTestNineteen.closeWindow();

		delay(3);
		postTestNineteen.clickProductTitle();
		System.out.println("You are looking on Product detail page.");

		scroll(700);

		delay(3);
		postTestNineteen.compareTwo();
		System.out.println("You have added product 2 to compare list.");

		delay(3);
		driver.switchTo().frame(driver.findElement(By.cssSelector("#cboxLoadedContent > iframe")));

		delay(3);
		postTestNineteen.selectProduct();
		System.out.println("You have selected a product detail.");
		
		delay(3);
		scroll(700);
		postTestNineteen.addCart();
		System.out.println("You have added a product to a cart.");
		postTestNineteen.viewCart();
		System.out.println("You viewed your cart.");
		
		scroll(700);
		postTestNineteen.proceedCheckout();
		System.out.println("You proceed your cart to Check out.");
		delay(3);
		
		scroll(700);
		postTestNineteen.firstName();
		postTestNineteen.lastName();
		postTestNineteen.companyName();
		scroll(300);
		
		delay(3);
//		postTestNineteen.selectIndo();
		
		delay(3);
		postTestNineteen.houseNumber();
		postTestNineteen.suiteUnit();
		postTestNineteen.townCity();
		
		delay(3);
		postTestNineteen.selectProvice();
		postTestNineteen.inputProvince();
		
		delay(3);
		postTestNineteen.inputPostcode();
		postTestNineteen.inputPhone();
		postTestNineteen.inputNote();
		System.out.println("You have successfully entered you billing detail.");
		
		delay(3);
		scroll(-300);
		postTestNineteen.agreeBox();
		
		delay(3);
		postTestNineteen.btnPlacedOrder();
		System.out.println("Congratulation! your order was successfully created.");
	
		delay(5);

	}

	@AfterClass
	public void closeBrowser() {
		delay(3);
		driver.quit();
	}

	static void delay(int detik) {
		try {
			Thread.sleep(1000 * detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void scroll(int vertical) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + vertical + ")");
	}
}
