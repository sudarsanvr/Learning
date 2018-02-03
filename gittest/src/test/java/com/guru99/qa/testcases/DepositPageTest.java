package com.guru99.qa.testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.guru99.qa.Base.TestBase;
import com.guru99.qa.pages.Deposit;
import com.guru99.qa.pages.LoginScreenPage;
import com.guru99.qa.pages.ManagerPage;

public class DepositPageTest extends TestBase {
	ManagerPage manager;
	LoginScreenPage loginpage;
	Deposit deposit;

	public DepositPageTest() throws IOException {
		super();

	}

	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		driversetup();
		loginpage = new LoginScreenPage();
		deposit = new Deposit();
		manager = loginpage.LoginPage(Prop.getProperty("username"), Prop.getProperty("password"));
		deposit = manager.DepositMenuPage();
	}

	@Test(priority=1)
	public void DepositPageTitleTest() {
		String DepositTitle = deposit.GetDepositeTitle();
		Assert.assertEquals("Guru99 Bank Amount Deposit Page", DepositTitle);
	}

	@Test(priority=2)
	public void DepositePageLabelTest() {
		String depositLabel = deposit.GetPageLabel();
		Assert.assertEquals(depositLabel, "Amount Deposit Form");
	}

	@AfterMethod
	public void quit() {
		TearDown();
	}
}
