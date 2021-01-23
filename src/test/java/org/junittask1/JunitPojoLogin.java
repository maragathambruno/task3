package org.junittask1;

import org.junitbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JunitPojoLogin extends BaseClass {
	public JunitPojoLogin() {
		PageFactory.initElements(driver, this);

	}
	@FindBy(id="email")
	private WebElement txtEmail;

	@FindBy(id="pass")
	private WebElement txtPass;

	@FindBy(name="login")
	private WebElement btnLogin;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
}
