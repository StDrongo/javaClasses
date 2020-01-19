package com.hrms.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.pages.DashBoardPageElement;
import com.hrms.pages.EmployeeListElements;
import com.hrms.pages.LoginPage;
import com.hrms.pages.LoginPageElements;
import com.hrms.utils.CommonMethods;

public class AddEmployee extends CommonMethods{
	
	@Test
	public void addEmployee() {
		LoginPageElements login = new LoginPageElements();
		DashBoardPageElement dashboard = new DashBoardPageElement();
		EmployeeListElements addEmployee = new EmployeeListElements();
		
		login.login("Admin", "Hum@nhrm123");
		
		click(dashboard.pim);
		click(dashboard.addEmployee);
		sendText(addEmployee.firstName, "guest");
		sendText(addEmployee.middleName, "student");
		sendText(addEmployee.lastName, "syntax");
		click(addEmployee.save);
		Assert.assertTrue(addEmployee.personalDetails.isDisplayed(), "Employee was NOT added");
		takeScreenshot("employeeAdded");
	}
	
	
	

}
