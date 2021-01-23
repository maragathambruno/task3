package org.junittask2;

import org.junitbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JunitPojoLogin3 extends BaseClass {
	public JunitPojoLogin3() {
		PageFactory.initElements(driver, this);

}

	@FindBy(id="first_name")
	private WebElement txtName;

	@FindBy(id="last_name")
	private WebElement txtLastName;

	@FindBy(id="address")
	private WebElement txtAdrress;

	@FindBy(id="cc_num")
	private WebElement txtCCnum;

	@FindBy(id="cc_type")
	private WebElement selCCtype;

	@FindBy(id="cc_exp_month")
	private WebElement selMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement selYear;


	public WebElement getSelYear() {
		return selYear;
	}

	@FindBy(id="cc_cvv")
	private WebElement txtCvv ;

	@FindBy(id="book_now")
	private WebElement btnBook;

	public WebElement getTxtName() {
		return txtName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAdrress() {
		return txtAdrress;
	}

	public WebElement getTxtCCnum() {
		return txtCCnum;
	}

	public WebElement getSelCCtype() {
		return selCCtype;
	}

	public WebElement getSelMonth() {
		return selMonth;
	}

	public WebElement getTxtCvv() {
		return txtCvv;
	}

	public WebElement getBtnBook() {
		return btnBook;
	}




}
