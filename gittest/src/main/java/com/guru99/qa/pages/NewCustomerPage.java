package com.guru99.qa.pages;

import java.io.IOException;
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

	public String GetNewCustomerPageTitle() {
		return driver.getTitle();
	}

	public String GetNewCustomerPageLabel() {
		return NewCustomerPageLabel.getText().trim();
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
	}
}
