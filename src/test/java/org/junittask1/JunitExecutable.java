package org.junittask1;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junitbase.BaseClass;





public class JunitExecutable extends BaseClass {
@BeforeClass
	public static void launchBrowse() {
		loadBrowser();
}
	@AfterClass
	public static void closeBrowse() {
		closebrowser();

	}
	@Test
	public void login() throws IOException {
		launchUrl("https://www.facebook.com/");
		maxwindow();

		JunitPojoLogin l = new JunitPojoLogin();
		fill(l.getTxtEmail(), excelRead(0, 0));
		fill(l.getTxtPass(), excelRead(0, 1));
		btnClick(l.getBtnLogin());
		

	}
	
	
	
	
	
	
	
	
	
}
