package com.guru99.qa.testcases;

import org.testng.annotations.Test;
import com.guru99.qa.Base.TestBase;
import com.guru99.qa.pages.LoginScreenPage;
import com.guru99.qa.pages.ManagerPage;
import com.guru99.qa.pages.NewCustomerPage;
import com.guru99.qa.testdata.DataProviders;
import com.guru99.qa.testdata.TestData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.testng.annotations.AfterMethod;

public class NewCustomerPageTest extends TestBase {
	public static LoginScreenPage login;
	public static ManagerPage manager;
	public static NewCustomerPage Newcustomer;

	public NewCustomerPageTest() throws IOException {
		super();

	}

	@BeforeTest
	public static void dataprovider() {
		TestData.ExcelSetup();
	}

	@BeforeMethod
	public void beforeMethod() throws IOException, InterruptedException {
		driversetup();
		login = new LoginScreenPage();
		manager = new ManagerPage();
		manager = login.LoginPage(Prop.getProperty("username"), Prop.getProperty("password"));
		Newcustomer = manager.NewCustomerMenuPage();
	}

	@Test(dataProvider = "ReadNewcustomerExcel", dataProviderClass = DataProviders.class)
	public void CreateNewCustomerTest(String customerName, String gender, String dateofbirth, String address,
		String city, String state, String pin, String mobilenumber, String email, String password) {
		Newcustomer.CreateNewCustomer(customerName, gender, dateofbirth, address, city, state, pin, mobilenumber, email,password);
		String AddCustomerMsg = Newcustomer.GetAddCustomerMsg();
		Newcustomer.GetCustomerDetails();
		assertEquals(AddCustomerMsg, "Customer Registered Successfully!!!");
	}

	@AfterMethod
	public void afterMethod() {
		TearDown();
	}
}
