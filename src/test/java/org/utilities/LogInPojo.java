package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	

public class LogInPojo extends BaseClass {
	
	public LogInPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement txtUser;
	
	@FindBy(id="pass")
	private WebElement txtPass;
	
	@FindBy(name="login")
	private WebElement btnLogin;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
}



