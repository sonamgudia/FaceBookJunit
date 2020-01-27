package org.test.run;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LibGlobal {
	static WebDriver driver;
	
	public static WebDriver getDriver() {
	System.setProperty("webdriver.gecko.driver", "E:\\SELENIUM\\project\\ClassA-junit\\driver\\geckodriver.exe");
	driver =new FirefoxDriver();
	return driver;
	}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	public static void type(WebElement element, String name) {
		element.sendKeys(name);
	}
	public static void btnClick(WebElement element) {
		element.click();
	}}
	
	
	



