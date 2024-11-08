package advanceSelenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToUseDependsOnMethods {

	@Test
	public void createAccount() {
		Reporter.log("Account created successfully", true);

	}
    
	//@Test(dependsOnMethods = "createAccount")
	@Test
	public void editAccount() {
		Reporter.log("Account edited successfully", true);
	}

	//@Test(dependsOnMethods = "editAccount")
	@Test(dependsOnMethods= {"editAccount","createAccount"})
	public void deleteAccount() {
		Reporter.log("Account deleted successfullly", true);
	}

}
