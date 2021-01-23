package org.junittask2;

import org.junitbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JunitPojoLogin extends BaseClass {
	public JunitPojoLogin() {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(id="username")
private WebElement txtUsername;

@FindBy(id="password")
private WebElement txtPass;

@FindBy(name="login")
private WebElement btnLogin;

public WebElement getTxtUsername() {
	return txtUsername;
}

public WebElement getTxtPass() {
	return txtPass;
}

public WebElement getBtnLogin() {
	return btnLogin;
}


}
