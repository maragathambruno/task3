package org.junittask3;

import org.junitbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JunitPojoLogin extends BaseClass {
	public JunitPojoLogin() {
		PageFactory.initElements(driver, this);

}
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement txtuser;

	@FindBy(xpath="(//input[@type='password'])")
	private WebElement txtPass;

	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement btnLogin;

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	
}
