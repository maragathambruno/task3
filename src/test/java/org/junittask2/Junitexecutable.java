package org.junittask2;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junitbase.BaseClass;

public class Junitexecutable extends BaseClass {
@BeforeClass
	public static void launchBrowse() {
		loadBrowser();
	}
@AfterClass
	public static void quitBrowse() {
		//closebrowser();

	}
@Before
public void start() {
	startTime();
}
@After
private void end() {
	endTime();
}

	@Test
	private void adacticBookRoom() throws IOException {

		launchUrl("http://adactinhotelapp.com/index.php");
		maxwindow();

		JunitPojoLogin l = new JunitPojoLogin();
		fill(l.getTxtUsername(), excelRead(0, 0));
		fill(l.getTxtPass(), excelRead(0, 1));
		btnClick(l.getBtnLogin());
		JunitPojoLogin1 l1 = new JunitPojoLogin1();
		selectTextPom(l1.getSelLocation(), excelRead(0, 2));
		selectTextPom(l1.getSelHotels(), excelRead(0, 3));
		selectTextPom(l1.getSelRoomtype(), excelRead(0, 4));
		selectTextPom(l1.getSelRoomNo(), "2 - Two");
		selectTextPom(l1.getSelAdaultRoom(), "2 - Two");
		selectTextPom(l1.getSelChildRoom(), "2 - Two");
		btnClick(l1.getBtnSearch());
		JunitPojoLogin2 l2 = new JunitPojoLogin2();
		btnClick(l2.getBtnRadio());
		btnClick(l2.getBtnCont());
		JunitPojoLogin3 l3 = new JunitPojoLogin3();

		fill(l3.getTxtName(), excelRead(0, 8));
		fill(l3.getTxtLastName(), excelRead(0, 9));
		fill(l3.getTxtAdrress(), excelRead(0, 10));
		fill(l3.getTxtCCnum(), excelRead(0, 11));
		selectTextPom(l3.getSelCCtype(),"Master Card" );
		selectTextPom(l3.getSelMonth(), "December");
		selectTextPom(l3.getSelYear(), "2022");

		fill(l3.getTxtCvv(), excelRead(0, 15));

		btnClick(l3.getBtnBook());

	}
}
