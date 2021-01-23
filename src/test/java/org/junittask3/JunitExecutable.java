package org.junittask3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junitbase.BaseClass;
import org.junit.Assert;

public class JunitExecutable extends BaseClass {

	@BeforeClass
	public static void launchBrowse() {
		loadBrowser();
	}

	@AfterClass
	public static void quitBrowse() {
	//	closebrowser();

	}

	@Before
	public void start() {
		startTime();
	}

	@After
	public void end() {
		endTime();
	}

	@Test
	public void Login() throws InterruptedException {

		launchUrl("https://www.flipkart.com/account/login");
		maxwindow();
		JunitPojoLogin l = new JunitPojoLogin();
		fill(l.getTxtuser(), "9524524901");
		String actualvalue = attributeJunit(l.getTxtuser());
		// Assert.assert
		// //Assert.assertEquals("verify username", "9524524901", actualvalue);
		Assert.assertEquals("check the username", "23456", actualvalue);
		fill(l.getTxtPass(), "maragatham");
		btnClick(l.getBtnLogin());
		Thread.sleep(2000);
		String title = getTitle();
		System.out.println(title);
		if (title.contains("Online Shopping Site")) {
			System.out.println("entered correct data");
		} else {
			System.out.println("entered incorrect data");

		}

	}
}