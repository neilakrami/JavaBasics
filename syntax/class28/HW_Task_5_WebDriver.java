package com.syntax.class28;

public interface HW_Task_5_WebDriver {
	
	 void open();
	 void close();
	 String getTitle();

}
interface TakesScreenshot{
	
	void getScreenshot();
	
	default void getFullScreen() {
		System.out.println("We can take screenshot of specific part of the screen");

}
		
}

interface RemoteWebDriver extends HW_Task_5_WebDriver, TakesScreenshot{
	
	void navigate();
}
class ChromeDriver implements RemoteWebDriver{
	

	@Override
	public void open() {
		System.out.println("We can open chrome driver");
	}

	@Override
	public void close() {
		System.out.println("We can close chrome driver");
	}

	@Override
	public String getTitle() {
		System.out.println("Chrome browser can get title of the page");
		return null;
	}

	@Override
	public void getScreenshot() {
		System.out.println("Chrome browser can screenshot the page");
		
	}

	@Override
	public void navigate() {
		System.out.println("Chrome browser can navigate the page");
	}
}

class FirefoxDriver implements RemoteWebDriver{

	@Override
	public void open() {
		System.out.println("Firefox browser can open the page");
		
	}

	@Override
	public void close() {
		System.out.println("Firefox browser can close  the page");
		
	}

	@Override
	public String getTitle() {
		System.out.println("Firefox browser can get the page title  ");
		return null;
	}

	@Override
	public void getScreenshot() {
		System.out.println("Firefox browser can get screenshot the page");
		
	}

	@Override
	public void navigate() {
		System.out.println("Firefox browser can navigate the page");
		
	}
	
}

class SafariDriver implements RemoteWebDriver{

	@Override
	public void open() {
		System.out.println("Safari browser can open the page");
	}

	@Override
	public void close() {
		System.out.println("Safari browser can close the page");
		
	}

	@Override
	public String getTitle() {
		System.out.println("Safari browser can the page title");
		return null;
	}

	@Override
	public void getScreenshot() {
		System.out.println("Safari browser can screenshot the page");
		
	}

	@Override
	public void navigate() {
		System.out.println("Safari browser can navigate the page");
		
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
