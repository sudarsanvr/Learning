package com.guru99.qa.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.guru99.qa.Base.TestBase;
import com.guru99.qa.util.Utilities;


public class LoginScreenPage extends TestBase {
	Utilities Utils;
	ManagerPage Manager;
	public LoginScreenPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		Utils = new Utilities();
		Manager = new ManagerPage();
	}

	@FindBy(name = "uid")
	@CacheLookup
	public WebElement UserIdEditBox;
	@FindBy(name = "password")
	@CacheLookup
	public WebElement PasswordEditBox;
	@FindBy(name = "btnLogin")
	@CacheLookup
	public WebElement LoginButton;
	@FindBy(className = "barone")
	@CacheLookup
	public WebElement HomeLogo;

	public String GetHomeTitle() {
		return driver.getTitle();
	}

	public boolean GetMainLogo() {
		return HomeLogo.isDisplayed();
	}

	public ManagerPage LoginPage(String username, String password) throws IOException, InterruptedException {
		UserIdEditBox.sendKeys(username);
		PasswordEditBox.sendKeys(password);
		LoginButton.click();
		Utils.explicitwaitbyclickability(Manager.LogoutMenu);
		return new ManagerPage();
	}
}