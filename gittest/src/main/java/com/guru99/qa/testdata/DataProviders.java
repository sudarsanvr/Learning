package com.guru99.qa.testdata;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.guru99.qa.Base.TestBase;

public class DataProviders extends TestBase {

	public DataProviders() throws IOException {
		super();
	}

	@DataProvider(name = "ReadNewcustomerExcel")
	public Object[][] ReadNewCustomerDataprovider() {
		Object[][] Exceldata = TestData.GetData(Prop.getProperty("AddNewCustomerTableName"), TestData.ExcelSheet1);
		return Exceldata;

	}

	@DataProvider(name = "NewcustomerExcel")
	public Object[][] WriteNewcustomerDataprovider() {
		Object[][] Exceldata = TestData.GetData(Prop.getProperty("WriteNewCustomerdata"), TestData.ExcelSheet2);
		return Exceldata;
	}
}
