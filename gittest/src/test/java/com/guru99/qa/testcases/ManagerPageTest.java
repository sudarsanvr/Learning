package com.guru99.qa.testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.guru99.qa.Base.TestBase;
import com.guru99.qa.pages.LoginScreenPage;
import com.guru99.qa.pages.ManagerPage;

public class ManagerPageTest extends TestBase {
	ManagerPage Manager;
	LoginScreenPage loginpage;

	public ManagerPageTest() throws IOException {
		super();

	}

	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		driversetup();
		loginpage = new LoginScreenPage();
		Manager = loginpage.LoginPage(Prop.getProperty("username"), Prop.getProperty("password"));
	}

	@Test
	public void ManagerPageTitleTest() throws IOException {

		String ManagerPageTitle = Manager.GetManagerTitle();
		Assert.assertEquals(ManagerPageTitle, "Guru99 Bank Manager HomePage");
	}

	@Test
	public void LoggedUserTitleTest() throws IOException {
		String LoggedUserID = Manager.GetLoggedUserTitle();
		String[] parts = LoggedUserID.split(":");
		String secondpart = parts[1];
		Assert.assertEquals(secondpart.trim(), Prop.getProperty("username"));
	}

	@AfterMethod
	public void quit() {
		TearDown();
	}
}
