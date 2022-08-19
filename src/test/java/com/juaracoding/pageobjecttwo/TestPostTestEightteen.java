package com.juaracoding.pageobjecttwo;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.pageobjecttwo.drivers.DriverSingleton;
import com.juaracoding.pageobjecttwo.pages.PostTestEightteen;

public class TestPostTestEightteen {
	public static WebDriver driver;
	private PostTestEightteen posttestEightteen;

	@BeforeClass
	public void setUp() {
		DriverSingleton.getInstace("Chrome");
		driver = DriverSingleton.getDriver();
		String url = "https://shop.demoqa.com/";
		driver.get(url);
	}

	@BeforeMethod
	public void pageObjectTwo() {
		posttestEightteen = new PostTestEightteen();
	}

	@Test
	public void testPostTestEightteen() {

		delay(3);
		posttestEightteen.search();
		delay(3);

		posttestEightteen.searchInput();
		delay(3);

		scroll(700);

		posttestEightteen.wishlist();
		delay(5);

		posttestEightteen.wishlistTwo();
		delay(5);

		posttestEightteen.wishlistList();
		delay(5);

		scroll(700);

		posttestEightteen.getTxtBlackOne();
		System.out.println(posttestEightteen.getTxtBlackOne());
		String txt = posttestEightteen.getTxtBlackOne();
		assertTrue(txt.contains("BLACK"));
		delay(5);

		posttestEightteen.getTxtBlackTwo();
		System.out.println(posttestEightteen.getTxtBlackTwo());
		String txtTwo = posttestEightteen.getTxtBlackOne();
		assertTrue(txtTwo.contains("BLACK"));
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
