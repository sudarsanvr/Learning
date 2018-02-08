package com.guru99.qa.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.guru99.qa.Base.TestBase;
import com.guru99.qa.util.Utilities;

public class NewCustomerPage extends TestBase {
	public static Utilities utils;

	public NewCustomerPage() throws IOException {
		super();
		utils = new Utilities();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[contains(text(),'Add New Customer')]")
	public WebElement NewCustomerPageLabel;
	@FindBy(name = "name")
	public WebElement CustomerNameEditbox;
	@FindBy(name = "dob")
	public WebElement DateOfBirthEditbox;
	@FindBy(name = "addr")
	public WebElement AddressEditbox;
	@FindBy(name = "city")
	public WebElement CityEditBox;
	@FindBy(name = "state")
	public WebElement StateEditbox;
	@FindBy(name = "pinno")
	public WebElement PINEditbox;
	@FindBy(name = "telephoneno")
	public WebElement MobileNumberEditbox;
	@FindBy(name = "emailid")
	public WebElement EMailEditbox;
	@FindBy(name = "password")
	public WebElement PasswordEditbox;
	@FindBy(name = "sub")
	public WebElement submitbutton;
	@FindBy(xpath = "//tr[4]/td[2]")
	public WebElement CustomerIDLabel;
	@FindBy(xpath = "//table[@id='customer']/tbody")
	public List<WebElement> CustomerTable;
	@FindBy(xpath = "//p[contains(text(),'Customer Registered Successfully')]")
	public WebElement AddCustomerSuccessmsg;

	public String GetNewCustomerPageTitle() {
		return driver.getTitle();
	}

	public String GetNewCustomerPageLabel() {
		return NewCustomerPageLabel.getText().trim();
	}

	public String GetCustomerID() {
		return CustomerIDLabel.getText().trim();
	}

	public String GetAddCustomerMsg() {
		return AddCustomerSuccessmsg.getText().trim();
	}

	public void CreateNewCustomer(String customerName, String gender, String dateofbirth, String address, String city,
			String state, String pin, String mobilenumber, String email, String password) {
		CustomerNameEditbox.sendKeys(customerName);
		driver.findElement(By.xpath("//input[@value='" + gender + "']")).click();
		DateOfBirthEditbox.sendKeys(dateofbirth);
		AddressEditbox.sendKeys(address);
		CityEditBox.sendKeys(city);
		StateEditbox.sendKeys(state);
		PINEditbox.sendKeys(pin);
		MobileNumberEditbox.sendKeys(mobilenumber);
		EMailEditbox.sendKeys(email);
		PasswordEditbox.sendKeys(password);
		submitbutton.click();
		utils.isalertpresent();
		utils.explicitwaitbyvisibility(AddCustomerSuccessmsg);
	}

	public ArrayList<String> GetCustomerTablePage() {
		ArrayList<WebElement> CustomerForm = new ArrayList<WebElement>();
		ArrayList<String> CustomerTabledata = new ArrayList<String>();
		for (WebElement row : CustomerTable) {
			List<WebElement> RowData = row.findElements(By.tagName("td"));
			for (WebElement data : RowData) {
				CustomerForm.add(data);
			}
		}
		int len = CustomerForm.size();
		for (int i = 0; i < len; i++) {
			CustomerTabledata.add(CustomerForm.get(i).getText().trim());
		}
		return CustomerTabledata;
	}

	/*public ArrayList<String> GetCustomerTable() {
		ArrayList<String> CustomerTabledata = new ArrayList<String>();
		List<WebElement> CustomerForm = GetCustomerFormPage();
		int len = CustomerForm.size();
		for (int i = 0; i < len; i++) {
			CustomerTabledata.add(CustomerForm.get(i).getText().trim());
		}
		return CustomerTabledata;
	}*/

	public void GetCustomerDetails() {
		String CustomerID, CustomerName, Gender, Birthdate, Address, City, State, Pin, MobileNo, Email;
		CustomerID = GetCustomerTablePage().get(4);
		CustomerName = GetCustomerTablePage().get(6);
		Gender = GetCustomerTablePage().get(8);
		Birthdate = GetCustomerTablePage().get(10);
		Address = GetCustomerTablePage().get(12);
		City = GetCustomerTablePage().get(14);
		State = GetCustomerTablePage().get(16);
		Pin = GetCustomerTablePage().get(18);
		MobileNo = GetCustomerTablePage().get(20);
		Email = GetCustomerTablePage().get(22);
	}
}
