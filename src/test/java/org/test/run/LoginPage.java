package org.test.run;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LibGlobal{
	public LoginPage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id= "email")
	private WebElement txtUserName;
	
	@FindBy(id= "pass")
	private WebElement txtpassword;
	
	@FindBy(xpath="//*[@id=\"u_0_b\"]")
	private WebElement btnClick;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}
	

}
