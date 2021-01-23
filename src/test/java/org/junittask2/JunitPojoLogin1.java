package org.junittask2;

import org.junitbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JunitPojoLogin1 extends BaseClass {
	public JunitPojoLogin1() {
		PageFactory.initElements(driver, this);

}


	@FindBy(id="location")
	private WebElement selLocation;

	@FindBy(id="hotels")
	private WebElement selHotels;

	@FindBy(id="room_type")
	private WebElement selRoomtype;

	@FindBy(id="room_nos")
	private WebElement selRoomNo;

	//@FindBy(id="datepick_in")
	//private WebElement selDate;

	@FindBy(id="adult_room")
	private WebElement selAdaultRoom;

	@FindBy(id="child_room")
	private WebElement selChildRoom;

	@FindBy(id="Submit")
	private WebElement btnSearch;

	public WebElement getSelLocation() {
		return selLocation;
	}

	public WebElement getSelHotels() {
		return selHotels;
	}

	public WebElement getSelRoomtype() {
		return selRoomtype;
	}

	public WebElement getSelRoomNo() {
		return selRoomNo;
	}

	public WebElement getSelAdaultRoom() {
		return selAdaultRoom;
	}

	public WebElement getSelChildRoom() {
		return selChildRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}




}
