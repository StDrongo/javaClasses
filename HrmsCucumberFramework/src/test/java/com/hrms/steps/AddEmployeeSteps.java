package com.hrms.steps;

import org.junit.Assert;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.EmployeeListElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddEmployeeSteps extends CommonMethods {

	AddEmployeePageElements addEmp;
	String empId;
	EmployeeListElements emplList;
	
	@Given("I am logged into HRMS")
	public void i_am_logged_into_HRMS() {
		LoginPageElements login = new LoginPageElements();
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
	}

	@Given("I navigated to Add Employee Page")
	public void i_navigated_to_Add_Employee_Page() throws InterruptedException {
		DashboardPageElements dashboard = new DashboardPageElements();
		dashboard.navigateToAddEmployee();
		Thread.sleep(2000);
	}

	@When("I add {string}, {string} and {string}")
	public void i_add_and_(String fName, String mName, String lName) {
		addEmp = new AddEmployeePageElements();
		sendText(addEmp.firstName, fName);
		sendText(addEmp.middleName, mName);
		sendText(addEmp.lastName, lName);
		empId = addEmp.empId.getText();
	}
	
	@When("I enter {string}, {string} and {string}")
	public void i_enter_and(String userName, String password, String rePassword) {
	    addEmp = new AddEmployeePageElements();
	    sendText(addEmp.username, userName);
	    sendText(addEmp.userPassword, password);
	    sendText(addEmp.confirmUserPassword, rePassword);
	}
	
	@When("I click Save")
	public void i_click_Save() {
		addEmp = new AddEmployeePageElements();
		click(addEmp.saveBtn);
	}

	@Then("I see Employee has been succesfully added")
	public void i_see_Employee_has_been_succesfully_added() {
		PersonalDetailsPageElements pdetails = new PersonalDetailsPageElements();
		Assert.assertEquals("Employee is NOT being added", pdetails.empId.getText(), empId);
	}

	@Then("I see Employee with {string}, {string} and {string} is displayed")
	public void i_see_Employee_with_and_is_displayed(String string, String string2, String string3) {
		emplList = new EmployeeListElements();
		emplList.emloyeesName.isDisplayed();
    }
	
	@When("I delete employee id")
	public void i_delete_employee_id() {
		addEmp = new AddEmployeePageElements();
		addEmp.empId.clear();
		//sendText(addEmp.empId, "");
	}
	
	@Then("I see employee without employee id is being added")
	public void i_see_employee_without_employee_id_is_being_added() {
		emplList = new EmployeeListElements();
		emplList.employeeId.toString().isEmpty();
	}
	
	@Then("I see required error message next to the first and last name")
	public void i_see_required_error_message_next_to_the_first_and_last_name() {
		addEmp = new AddEmployeePageElements();
		addEmp.nameRequired.isDisplayed();
	}
	
	@When("I click on create login checkbox")
	public void i_click_on_create_login_checkbox() throws InterruptedException {
	    addEmp = new AddEmployeePageElements();
	    addEmp.createLoginDetails.click();
	    Thread.sleep(2000);
	}
	
	
	
	
}