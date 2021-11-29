package com.amazon.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.amazon.pageobject.DriverFactory;
import com.amazon.pageobject.GetPage;

public class LoginPage extends GetPage {

	private WebDriver driver;

	// Constructor of the Page Class
	public LoginPage(WebDriver driver) {
		super(driver, "LoginPage");
		this.driver = driver;
	}

	public void visitURL() {
		 //DriverFactory.getDriver();
		driver.get("https://www.amazon.in/");
	}

	public void SignInwithCredentials(String username, String password) throws InterruptedException {
		element("signIn").click();
		element("emailId").sendKeys(username);
		element("conti_nue").click();
		element("input_pwd").sendKeys(password);

	}

	public void clickOnLogin()  {
		element("sign_in").click();
	}

	public WebElement navigatesToHomePage() {
		return element("user_name");
	}

	public void getPhoneItems(String phone) {
		element("searchText").sendKeys(phone);
		element("search").click();

	}

	public List<String> getItemList() {
		List<String> optionList = new ArrayList<String>();
		for (WebElement item : elements("item_name")) {
			// System.out.println("item name " + item.getText());
			optionList.add(item.getText());
		}

		return optionList;
	}
}
