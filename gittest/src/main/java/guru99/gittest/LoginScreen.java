package guru99.gittest;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginScreen {
	public static Properties OR;
	public LoginScreen(WebDriver driver) throws IOException{
		OR = new Properties(TestBase.loadProFile());
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "uid")
	WebElement UserIdEditBox;
	@FindBy(name = "password")
	WebElement PasswordEditBox;
	@FindBy(name = "btnLogin")
	WebElement LoginButton;

	public void Login(){
		System.out.println(OR.getProperty("username"));
		System.out.println(OR.getProperty("password"));
		UserIdEditBox.sendKeys(OR.getProperty("username"));
		PasswordEditBox.sendKeys(OR.getProperty("password"));
		LoginButton.click();
	}
}
