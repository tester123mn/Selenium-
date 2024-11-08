package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_014SendMailToFraind extends BaseClass {
	
	@Test(groups="system")
	public void sendMail() {
		String expectedMessge = "Your message has been sent.";
		
		driver.findElement(By.partialLinkText("Digital downloads")).click();
		driver.findElement(By.linkText("Music 2")).click();
		driver.findElement(By.xpath("//input[@value='Email a friend']")).click();
		driver.findElement(By.id("FriendEmail")).sendKeys("afrid123@gmail.com");
		driver.findElement(By.id("PersonalMessage")).sendKeys("This is a good song....");
		driver.findElement(By.name("send-email")).click();
		
		String actualMessage = driver.findElement(By.xpath("//div[@class='result']")).getText();
		
		Assert.assertEquals(actualMessage, expectedMessge);
		Reporter.log("mail send successfully to your friend",true);
	}

}
