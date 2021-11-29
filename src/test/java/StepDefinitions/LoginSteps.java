package StepDefinitions;

import org.junit.Assert;

import com.amazon.pageobject.DriverFactory;
import com.amazon.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	LoginPage login = new LoginPage(DriverFactory.getDriver());
	// LoginPage login;

	@Given("user is on login page")
	public void user_is_on_login_page() {

		login.visitURL();
		System.out.println("user is on login page");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		login.SignInwithCredentials(username, password);
	}

	@And("clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {
		login.clickOnLogin();
	}

	@Then("verify if user navigates to the HomePage")
	public void verify_if_user_navigates_to_the_HomePage() {
		Assert.assertEquals(login.navigatesToHomePage().isDisplayed(), "true");
		Assert.assertTrue(login.navigatesToHomePage().isDisplayed());
	}

	@When("^user search for (.*)$")
	public void user_search_for_phone(String phone) {
		login.getPhoneItems(phone);
	}

	@Then("verify if user is able to get the items with search keyword (.*)$")
	public void verify_if_user_is_able_to_get_the_items_with_search_keyword(String mobile) {
		// Assert.assertTrue(login.getItemList().contains(mobile));

	}
}
