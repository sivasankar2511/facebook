package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	

public class ForgottenPojo extends BaseClass {
	
public ForgottenPojo() {
	PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement forgotPass;
	
	@FindBy(id="identify_email")
	private WebElement txtEntNum;
	
	@FindBy(xpath="//button[text()='Search']")
	private WebElement btnclicksubmit;

	public WebElement getForgotPass() {
		return forgotPass;
	}

	public WebElement getTxtEntNum() {
		return txtEntNum;
	}

	public WebElement getBtnclickSubmit() {
		return btnclicksubmit;
	}
	
	
}