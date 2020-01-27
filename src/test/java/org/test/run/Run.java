package org.test.run;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Run extends LibGlobal{
	@BeforeClass
	public static void lanuchBrowser() {
		getDriver();
	}
	@After
	public void endtime() {
		Date d=new Date();
		System.out.println(d);
	}
		@Before
		public void StartTime() {
			Date d=new Date();
			System.out.println(d);
	
	}
		@AfterClass
		public static void quitBrowser() {
			driver.quit();
		}
		@Test
		public void test1() {
			loadUrl("https://www.facebook.com/");
			LoginPage page= new LoginPage();
			type(page.getTxtUserName(), "sonamgudia@gmail.com");
			type(page.getTxtpassword(), "welcome@12");
			btnClick(page.getBtnClick());
			
		}		
		
}