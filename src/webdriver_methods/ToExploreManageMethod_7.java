package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreManageMethod_7 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
//		 to maximize
		driver.manage().window().maximize();

		Thread.sleep(3000);

//		 to minimize
		driver.manage().window().minimize();

//		 to Full screen
		driver.manage().window().fullscreen();

//		 to get size
		Dimension sizeofbrowser = driver.manage().window().getSize();
		System.out.println(sizeofbrowser);
//
//		 to set size
		Dimension d = new Dimension(500, 500);
		driver.manage().window().setSize(d);
		driver.manage().window().setSize(new Dimension(100, 100));

//		to get position
		Point pose = driver.manage().window().getPosition();
		System.out.println(pose);

//		to set position
		Point b = new Point(50, 50);
		driver.manage().window().setPosition(b);
		driver.manage().window().setPosition(new Point(50, 50));

	}

}
