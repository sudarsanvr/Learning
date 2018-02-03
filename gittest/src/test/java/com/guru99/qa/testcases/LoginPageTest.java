package com.guru99.qa.testcases;

import org.testng.annotations.Test;

import com.guru99.qa.Base.TestBase;
import com.guru99.qa.pages.LoginScreenPage;
import com.guru99.qa.pages.ManagerPage;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LoginPageTest extends TestBase {

	public LoginPageTest() throws IOException {
		super();
	}

	public static LoginScreenPage login;
	public static ManagerPage Manager;

	@BeforeMethod
	public static void setup() throws IOException {
		driversetup();
		login = new LoginScreenPage();
		Manager = new ManagerPage();
	}

	@Test(priority = 1)
	public void LoginTitleTest() {
		String title = login.GetHomeTitle();
		Assert.assertTrue(title.equalsIgnoreCase("Guru99 Bank Home Page"));
	}

	@Test(priority = 2)
	public void LoginLogoTest() {
		Assert.assertTrue(login.GetMainLogo());
	}

	@Test(priority = 3)
	public void successfulLoginTest() throws IOException, InterruptedException {
		Manager = login.LoginPage(Prop.getProperty("username"), Prop.getProperty("password"));
	}

	@AfterMethod
	public void quit() {
		TearDown();
	}
}
