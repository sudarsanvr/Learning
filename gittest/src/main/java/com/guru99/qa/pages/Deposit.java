package com.guru99.qa.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.guru99.qa.Base.TestBase;

public class Deposit extends TestBase {

	public Deposit() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "accountno")
	@CacheLookup
	public WebElement AccountNoEditbox;
	@FindBy(name = "ammount")
	@CacheLookup
	public WebElement AmountEditbox;
	@FindBy(name = "desc")
	@CacheLookup
	public WebElement DescEditbox;
	@FindBy(name = "AccSubmit")
	@CacheLookup
	public WebElement SubmitButton;
	@FindBy(name = "res")
	@CacheLookup
	public WebElement ResetButton;
	@FindBy(xpath = "//p[contains(text(),'Amount Deposit Form')]")
	@CacheLookup
	public WebElement PageTitleLabel;

	public String GetDepositeTitle() {
		return driver.getTitle();
	}

	public String GetPageLabel() {
		return PageTitleLabel.getText().trim();
	}

	public void AddDeposit(String AccountNo, String Amount, String Description) {
		AccountNoEditbox.sendKeys(AccountNo);
		AmountEditbox.sendKeys(Amount);
		DescEditbox.sendKeys(Description);
		SubmitButton.click();
	}

	public void ResetEditbox(String AccountNo, String Amount, String Description) {
		AccountNoEditbox.sendKeys(AccountNo);
		AmountEditbox.sendKeys(Amount);
		DescEditbox.sendKeys(Description);
		ResetButton.clear();
	}

}
