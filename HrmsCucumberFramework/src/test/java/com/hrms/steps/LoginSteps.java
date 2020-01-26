package com.hrms.steps;

import org.openqa.selenium.remote.ScreenshotException;

import com.hrms.pages.LoginPageElements;
import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;
import io.cucumber.java.en.*;
import junit.framework.Assert;

public class LoginSteps extends CommonMethods{
	LoginPageElements login;
	
	@Given("I open browser and navigated to the HRMS")
	public void i_open_browser_and_navigated_to_the_HRMS() {
		BaseClass.setUp();
	}

	@When("I enter valid username and valid password")
	public void i_enter_valid_username_and_valid_password() {
		login = new LoginPageElements();
		sendText(login.username, "Admin");
		sendText(login.password, "Syntax@123");
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		click(login.loginBtn);
	}

	@Then("I successfully logged in")
	public void i_successfully_logged_in() {
		System.out.println("I am logged in");
		tearDown();
	}
	@When("I enter valid username and invalid password")
	public void i_enter_valid_username_and_invalid_password() {
	    login=new LoginPageElements();
	    sendText(login.username, "Admin");
	    sendText(login.password, "87HJK");
	}

	@Then("I see error message")
	public void i_see_error_message() {
		boolean error = login.errorMsg.isDisplayed();
	    Assert.assertTrue("Error message is not displayed", error);
	}
	
	@Then("I close browser")
	public void i_close_browser() {
	    BaseClass.tearDown();
	}
}
