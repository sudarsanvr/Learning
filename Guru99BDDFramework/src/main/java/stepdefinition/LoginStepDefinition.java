package stepdefinition;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import Methods.TestBase;
import Pages.HomePage;
import Pages.ManagerPage;
import Pages.NewCustomerPage;

public class LoginStepDefinition extends TestBase {
	HomePage Home = new HomePage();
	ManagerPage Manager;
	NewCustomerPage NewCustomer;

	public LoginStepDefinition() throws Exception {
		super();
	}
	@Given("^User is on the login screen$")
	public void User_is_on_the_login_screen() throws Exception {
		Initiation();
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) throws Exception {
		List<List<String>> data = credentials.raw();
		Home.Credential(data.get(0).get(0), data.get(0).get(1));
	}

	@Then("^user enters multiple customer details Customer Name and Gender and Date of Birth and City and State and PIN$")
	public void user_enters_multiple_customer_details_Customer_Name_and_Gender_and_Date_of_Birth_and_City_and_State_and_PIN(
			DataTable customerdetails) throws InterruptedException {
		for (Map<String, String> data : customerdetails.asMaps(String.class, String.class)) {
			NewCustomer.AddCustomer(data.get("Customername"), data.get("Gender"), data.get("DateofBirth"),
					data.get("City"), data.get("State"), data.get("PIN"));
		}
		Thread.sleep(5000);
	}

	@Then("^user enters their username and password$")
	public void user_enters_their_username_and_password(DataTable usercredentials) throws Exception {
		for (Map<String, String> data : usercredentials.asMaps(String.class, String.class)) {
			Home.Credential(data.get("username"), data.get("password"));
		}
	}

	@Then("^user enters customer details Customer Name and Gender and Date of Birth and City and State and PIN$")
	public void user_enters_customer_details_Customer_Name_and_Gender_and_Date_of_Birth_and_City_and_State_and_PIN(
			DataTable customerDetails) throws InterruptedException {
		List<List<String>> data = customerDetails.raw();
		NewCustomer.AddCustomer(data.get(0).get(0), data.get(0).get(1), data.get(0).get(2), data.get(0).get(3),
				data.get(0).get(4), data.get(0).get(5));
		Thread.sleep(5000);
	}

	@When("^Login page is displayed$")
	public void login_page_is_displayed() {
		String Title = driver.getTitle();
		Assert.assertEquals("Guru99 Bank Home Page", Title);
	}

	@Then("^user enters the username and password$")
	public void user_enters_the_username_and_password() throws Exception {
		Home.Credential("mngr120674", "EdabeqE");
	}

	@Then("^user clicks on Login button$")
	public void user_clicks_on_Login_button() throws Exception {
		Manager = Home.LoginButton();
	}

	@Then("^user enters the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_and(String username, String password) throws Exception {
		Home.Credential(username, password);
	}

	@And("^user is on Manager page$")
	public void user_is_on_Home_page() throws InterruptedException {
		Thread.sleep(2000);
		String Title = driver.getTitle();
		Assert.assertEquals("Guru99 Bank Manager HomePage", Title);
	}

	@Then("^user checks the title of the page$")
	public void user_checks_the_title_of_the_page() {
		String Title = driver.getTitle();
		Assert.assertEquals("Guru99 Bank Home Page", Title);
	}

	@Then("user clicks on Add Customer Link")
	public void user_clicks_on_Add_Customer_Link() throws Exception {
		NewCustomer = Manager.NewCustomerLink();
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
		//Teardown();
	}
}