package com.guru99.qa.testdata;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name = "NewcustomerExcel")
	public Object[][] Dataprovider() {
		Object[][] Exceldata = TestData.GetData("Customerdata");
		return Exceldata;

	}
}
