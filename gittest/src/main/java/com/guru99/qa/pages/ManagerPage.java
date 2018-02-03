package com.guru99.qa.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.guru99.qa.Base.TestBase;
import com.guru99.qa.util.Utilities;

public class ManagerPage extends TestBase {
	public static Deposit deposit;
	public static Utilities utils;

	public ManagerPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		deposit = new Deposit();
		utils = new Utilities();
	}

	@FindBy(xpath = "//img[@src='../images/1.gif']")
	public WebElement Image1Logo;
	@FindBy(xpath = "//img[@src='../images/2.gif']")
	public WebElement Image2Logo;
	@FindBy(xpath = "//img[@src='../images/3.gif']")
	public WebElement Image3Logo;
	@FindBy(xpath = "//tr[3]/td[1]")
	public WebElement LoggedUserTitle;
	@FindBy(xpath = "//a[contains(text(),'Manager')]")
	public WebElement ManagerMenu;
	@FindBy(xpath = "//a[contains(text(),'New Customer')]")
	public WebElement NewCustomerMenu;
	@FindBy(xpath = "//a[contains(text(),'Edit Customer')]")
	public WebElement EditCustomerMenu;
	@FindBy(xpath = "//a[contains(text(),'Delete Customer')]")
	public WebElement DeleteCustomerMenu;
	@FindBy(xpath = "//a[contains(text(),'New Account')]")
	public WebElement NewAccountMenu;
	@FindBy(xpath = "//a[contains(text(),'Edit Account')]")
	public WebElement EditAccountMenu;
	@FindBy(xpath = "//a[contains(text(),'Delete Account')]")
	public WebElement DeleteAccountMenu;
	@FindBy(xpath = "//a[contains(text(),'Deposit')]")
	public WebElement DepositMenu;
	@FindBy(xpath = "//a[contains(text(),'Withdrawal')]")
	public WebElement WithdrawalMenu;
	@FindBy(xpath = "//a[contains(text(),'Fund Transfer')]")
	public WebElement FundTransferMenu;
	@FindBy(xpath = "//a[contains(text(),'Balance Enquiry')]")
	public WebElement BalanceEnquiryMenu;
	@FindBy(xpath = "//a[contains(text(),'Customised Statement')]")
	public WebElement CustomisedStatementMenu;
	@FindBy(xpath = "//a[contains(text(),'Log out')]")
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

	public NewCustomerPage NewCustomerMenuPage() {
		NewCustomerMenu.click();
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

	public BalanceEnquiryPage BalanceEnquiryMenuPage() {
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
