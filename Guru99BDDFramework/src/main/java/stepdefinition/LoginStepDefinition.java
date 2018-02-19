package stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginStepDefinition {
	WebDriver driver;

	@Before
	public void setup() {
		driver = new FirefoxDriver();
	}

	@Given("^user is on the login screen$")
	public void user_is_on_the_login_screen() {
		driver.get("http://www.demo.guru99.com/v4/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) {
		List<List<String>> data = credentials.raw();
		driver.findElement(By.name("uid")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	}

	@Then("^user enters multiple customer details Customer Name and Gender and Date of Birth and City and State and PIN$")
	public void user_enters_multiple_customer_details_Customer_Name_and_Gender_and_Date_of_Birth_and_City_and_State_and_PIN(
			DataTable customerdetails) throws InterruptedException {
		for (Map<String, String> data : customerdetails.asMaps(String.class, String.class)) {
			driver.findElement(By.name("name")).sendKeys(data.get("Customername"));
			driver.findElement(By.xpath("//input[@value='" + data.get("Gender") + "']")).click();
			driver.findElement(By.name("dob")).sendKeys(data.get("DateofBirth"));
			driver.findElement(By.name("city")).sendKeys(data.get("City"));
			driver.findElement(By.name("state")).sendKeys(data.get("State"));
		}
		Thread.sleep(5000);
	}

	@Then("^user enters their username and password$")
	public void user_enters_their_username_and_password(DataTable usercredentials) {
		for (Map<String, String> data : usercredentials.asMaps(String.class, String.class)) {
			driver.findElement(By.name("uid")).sendKeys(data.get("username"));
			driver.findElement(By.name("password")).sendKeys(data.get("password"));
		}
	}

	@Then("^user enters customer details Customer Name and Gender and Date of Birth and City and State and PIN$")
	public void user_enters_customer_details_Customer_Name_and_Gender_and_Date_of_Birth_and_City_and_State_and_PIN(
			DataTable customerDetails) throws InterruptedException {
		List<List<String>> data = customerDetails.raw();
		driver.findElement(By.name("name")).sendKeys(data.get(0).get(0));
		driver.findElement(By.xpath("//input[@value='" + data.get(0).get(1) + "']")).click();
		driver.findElement(By.name("dob")).sendKeys(data.get(0).get(2));
		driver.findElement(By.name("city")).sendKeys(data.get(0).get(3));
		driver.findElement(By.name("state")).sendKeys(data.get(0).get(4));
		Thread.sleep(5000);
	}

	@When("^Login page is displayed$")
	public void login_page_is_displayed() {
		String Title = driver.getTitle();
		Assert.assertEquals("Guru99 Bank Home Page", Title);
	}

	@Then("^user enters the username and password$")
	public void user_enters_the_username_and_password() {
		driver.findElement(By.name("uid")).sendKeys("mngr115134");
		driver.findElement(By.name("password")).sendKeys("vEtYtYt");
	}

	@Then("^user clicks on Login button$")
	public void user_clicks_on_Login_button() throws InterruptedException {
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);
	}

	@Then("^user enters the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_and(String username, String password) {
		driver.findElement(By.name("uid")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);

	}

	@And("^user is on Home page$")
	public void user_is_on_Home_page() throws InterruptedException {
		String Title = driver.getTitle();
		Assert.assertEquals("Guru99 Bank Manager HomePage", Title);
	}

	@Then("^user checks the title of the page$")
	public void user_checks_the_title_of_the_page() {
		String Title = driver.getTitle();
		Assert.assertEquals("Guru99 Bank Home Page", Title);
	}

	@Then("user clicks on Add Customer Link")
	public void user_clicks_on_Add_Customer_Link() {
		driver.findElement(By.linkText("New Customer")).click();
	}

	@Then("^user enters customer details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_customer_details(String CustomerName, String Gender, String DateofBirth, String city,
			String state, String PIN) throws InterruptedException {
		driver.findElement(By.name("name")).sendKeys(CustomerName);
		driver.findElement(By.xpath("//input[@value='" + Gender + "']")).click();
		driver.findElement(By.name("dob")).sendKeys(DateofBirth);
		driver.findElement(By.name("city")).sendKeys(city);
		driver.findElement(By.name("state")).sendKeys(state);
		Thread.sleep(5000);
	}

	@After
	public void teardown() {
		driver.quit();
	}
}
