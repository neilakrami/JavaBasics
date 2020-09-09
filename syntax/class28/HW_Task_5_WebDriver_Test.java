package com.syntax.class28;

public class HW_Task_5_WebDriver_Test {

	public static void main(String[] args) {
		

		RemoteWebDriver[] drivers = { new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
		
		for (RemoteWebDriver driver : drivers) {
			
			System.out.println("-------------------------------------");
			System.out.println();
			driver.open();
			driver.close();
			driver.getTitle();
			driver.getScreenshot();
			driver.getFullScreen();
			driver.navigate();
		}
			
			HW_Task_5_WebDriver[] driver2 ={ new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
			
			for(HW_Task_5_WebDriver driver1 : driver2) {
				
				System.out.println("------------------Array of Objects of WebDriver type-------------------");
				System.out.println();
				
			driver1.open();
			driver1.close();
			driver1.getTitle();
//			driver2.getScreenshot();
//			driver2.getFullScreen();
//			driver2.navigate();
		}
			
			TakesScreenshot[]  driver3 = { new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
			
			for(TakesScreenshot driver : driver3) {
				
				System.out.println("------------------Array of Objects of TakesScreenshot type-------------------");
				System.out.println();
				driver.getFullScreen();
				driver.getScreenshot();
			}
	}
	
}
