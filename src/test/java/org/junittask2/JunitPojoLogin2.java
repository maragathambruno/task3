package org.junittask2;

import org.junitbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JunitPojoLogin2 extends BaseClass{
	public JunitPojoLogin2() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "radiobutton_0")
	private WebElement btnRadio;

	@FindBy(id = "continue")
	private WebElement btnCont;

	public WebElement getBtnRadio() {
		return btnRadio;
	}

	public WebElement getBtnCont() {
		return btnCont;
	}


}
