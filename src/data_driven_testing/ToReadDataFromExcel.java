package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// step 1: Create object of FileImputStream
		FileInputStream fis = new FileInputStream("./testData/testData.xlsx");

		// step 2: Create object of excel file
		Workbook wb = WorkbookFactory.create(fis);

		// step 3: Call method
		String URL = wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
		String USERNAME = wb.getSheet("Sheet1").getRow(1).getCell(0).toString();
		String PASSWORD = wb.getSheet("Sheet1").getRow(2).getCell(0).toString();

		// Script
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(URL);
		driver.findElement(By.id("email")).sendKeys(USERNAME);
		driver.findElement(By.id("pass")).sendKeys(PASSWORD);
		

	}

}
