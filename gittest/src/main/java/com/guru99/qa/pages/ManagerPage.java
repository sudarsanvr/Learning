package com.guru99.qa.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.guru99.qa.Base.TestBase;
import com.guru99.qa.util.Utilities;

public class ManagerPage extends TestBase {
	public static Deposit deposit;
	public static Utilities utils;
	public static NewCustomerPage Newcustomer;

	public ManagerPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		deposit = new Deposit();
		utils = new Utilities();
		Newcustomer = new NewCustomerPage();
	}

	@FindBy(xpath = "//img[@src='../images/1.gif']")
	@CacheLookup
	public WebElement Image1Logo;
	@FindBy(xpath = "//img[@src='../images/2.gif']")
	@CacheLookup
	public WebElement Image2Logo;
	@FindBy(xpath = "//img[@src='../images/3.gif']")
	@CacheLookup
	public WebElement Image3Logo;
	@FindBy(xpath = "//tr[3]/td[1]")
	@CacheLookup
	public WebElement LoggedUserTitle;
	@FindBy(xpath = "//a[contains(text(),'Manager')]")
	@CacheLookup
	public WebElement ManagerMenu;
	@FindBy(xpath = "//a[contains(text(),'New Customer')]")
	@CacheLookup
	public WebElement NewCustomerMenu;
	@FindBy(xpath = "//a[contains(text(),'Edit Customer')]")
	@CacheLookup
	public WebElement EditCustomerMenu;
	@FindBy(xpath = "//a[contains(text(),'Delete Customer')]")
	@CacheLookup
	public WebElement DeleteCustomerMenu;
	@FindBy(xpath = "//a[contains(text(),'New Account')]")
	@CacheLookup
	public WebElement NewAccountMenu;
	@FindBy(xpath = "//a[contains(text(),'Edit Account')]")
	@CacheLookup
	public WebElement EditAccountMenu;
	@FindBy(xpath = "//a[contains(text(),'Delete Account')]")
	@CacheLookup
	public WebElement DeleteAccountMenu;
	@FindBy(xpath = "//a[contains(text(),'Deposit')]")
	@CacheLookup
	public WebElement DepositMenu;
	@FindBy(xpath = "//a[contains(text(),'Withdrawal')]")
	@CacheLookup
	public WebElement WithdrawalMenu;
	@FindBy(xpath = "//a[contains(text(),'Fund Transfer')]")
	@CacheLookup
	public WebElement FundTransferMenu;
	@FindBy(xpath = "//a[contains(text(),'Balance Enquiry')]")
	@CacheLookup
	public WebElement BalanceEnquiryMenu;
	@FindBy(xpath = "//a[contains(text(),'Customised Statement')]")
	@CacheLookup
	public WebElement CustomisedStatementMenu;
	@FindBy(xpath = "//a[contains(text(),'Log out')]")
	@CacheLookup
	public WebElement LogoutMenu;

	public String GetManagerTitle() {
		return driver.getTitle().trim();
	}

	public boolean GetImage1Logo() {
		return Image1Logo.isDisplayed();
	}

	public boolean GetImage2Logo() {
		return Image2Logo.isDisplayed();
	}

	public boolean GetImage3Logo() {
		return Image3Logo.isDisplayed();
	}

	public String GetLoggedUserTitle() {
		return LoggedUserTitle.getText();
	}

	public ManagerPage ManagerMenuPage() throws IOException {
		ManagerMenu.click();
		return new ManagerPage();
	}

	public NewCustomerPage NewCustomerMenuPage() throws IOException {
		NewCustomerMenu.click();
		utils.explicitwaitbyclickability(Newcustomer.submitbutton);
		return new NewCustomerPage();
	}

	public EditCustomerPage EditCustomerMenu() {
		EditCustomerMenu.click();
		return new EditCustomerPage();
	}

	public DeleteAccountPage DeleteCustomerMenuPage() {
		DeleteCustomerMenu.click();
		return new DeleteAccountPage();
	}

	public NewAccountPage NewAccountMenuPage() {
		NewAccountMenu.click();
		return new NewAccountPage();
	}

	public EditAccountPage EditAccountMenuPage() {
		EditAccountMenu.click();
		return new EditAccountPage();
	}

	public DeleteAccountPage DeleteAccountMenuPage() {
		DeleteAccountMenu.click();
		return new DeleteAccountPage();
	}

	public Deposit DepositMenuPage() throws IOException {
		DepositMenu.click();
		utils.explicitwaitbyclickability(deposit.SubmitButton);
		return new Deposit();
	}

	public Withdrawal WithdrawalMenuPage() {
		WithdrawalMenu.click();
		return new Withdrawal();
	}

	public FundTransferPage FundTransferMenuPage() {
		FundTransferMenu.click();
		return new FundTransferPage();
	}

	public BalanceEnquiryPage BalanceEnquiryMenuPage() throws IOException {
		BalanceEnquiryMenu.click();
		return new BalanceEnquiryPage();
	}

	public CustomisedStatementPage CustomisedStatementMenuPage() {
		CustomisedStatementMenu.click();
		return new CustomisedStatementPage();
	}

	public LoginScreenPage LogoutMenuPage() throws IOException {
		LogoutMenu.click();
		return new LoginScreenPage();
	}
}
