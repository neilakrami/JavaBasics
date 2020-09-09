package com.syntax.class25;

public class WebDriver {

	public void opent() {
		System.out.println("Opening browser");
	}
class FirefoxDriver extends WebDriver{
	public void open() {
		System.out.println("Oprning firefox browser");
	}
}
class ChromeDriver extends WebDriver{
	public void opent() {
		System.out.println(" Opening chrome browser");
	}
}
class InternetExplorarDriver extends WebDriver{
	public void open() {
		System.out.println("Opening internet explorer");
	}
}
}
