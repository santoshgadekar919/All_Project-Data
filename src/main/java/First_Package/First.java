package First_Package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class First {
	// Sequence of TestNg Annotations
	// @BeforeSuite----Steup system property for chrome
	// @BeforeTest-----launch chrome Browser
	// @BeforeClass-----login method
	// @BeforeMethod-----Enter URL
	// @Test-----Google Title Test
	// @AfterMethod------logout from app
	// @BeforeMethod-----Enter URL
	// @Test-----Search test
	// @AfterMethod------logout from app
	// @AfterClass------Close Browser
	// @AfterTest------delet all Cookies
	// PASSED: searchTest
	// PASSED: googleTitleTest
	// Pre-conditions annotations--starting with @Before
	@BeforeSuite // 1
	public void setUp() {
		System.out.println("@BeforeSuite----Steup system property for chrome");
	}

	@BeforeTest // 2
	public void launchBrowser() {
		System.out.println("@BeforeTest-----launch chrome Browser");
	}

	@BeforeClass // 3
	public void login() {
		System.out.println("@BeforeClass-----login method");
	}

	/*
	 * @BeforeMethod
	 * 
	 * @Test--------1
	 * 
	 * @AfterMethod
	 * 
	 * @BeforeMethod
	 * 
	 * @Test--------2
	 * 
	 * @AfterMethod
	 */
	@BeforeMethod // 4
	public void enterURL() {
		System.out.println("@BeforeMethod-----Enter URL");
	}

	// Test Cases annotations--starting with @Test
	@Test // 5
	public void googleTitleTest() {
		System.out.println("@Test-----Google Title Test");
	}

	@Test
	public void searchTest() {
		System.out.println("@Test-----Search test");
	}

	// Post-conditions annotations--starting with @After
	@AfterMethod // 6
	public void logOut() {
		System.out.println("@AfterMethod------logout from app");
	}

	@AfterClass // 7
	public void deletAllCookies() {
		System.out.println("@AfterTest------delet all Cookies");
	}

	@AfterTest // 8
	public void closeBrowser() {
		System.out.println("@AfterClass------Close Browser");
	}

	@AfterSuite // 9
	public void generateTestReport() {
		System.out.println("@AfterSuite-------generate test report");
	}

}
