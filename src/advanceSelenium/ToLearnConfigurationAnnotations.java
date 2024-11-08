package advanceSelenium;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToLearnConfigurationAnnotations {

	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("beforsuite got executed",true);
	}

	@AfterSuite
	public void afterSuite() {
		Reporter.log("afterSuite got executed",true);
	}

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("BeforeMethod got executed",true);
	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("AfterMethod got executed",true);
	}

	@BeforeClass
	public void beforeClass() {
		Reporter.log("BeforeClass got executed",true);
	}

	@AfterClass
	public void afterClass() {
		Reporter.log("AfterClass got executed",true);
	}

	@BeforeTest
	public void beforeTest() {
		Reporter.log("BeforeTest got executed",true);
	}

	@AfterTest
	public void afterTest() {
		Reporter.log("AfterTest got executed",true);
	}

	@Test
	public void test() {
		Reporter.log("Test got executed",true);
	}
}
