package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class DashBoardPageElement extends CommonMethods{
	
	@FindBy(linkText="Leave")
	public WebElement leaveLnk;
	
	@FindBy(linkText = "Leave List")
	public WebElement leaveList;
	
	@FindBy(linkText = "PIM")
	public WebElement pim;
	
	@FindBy(xpath = "//a[@id='menu_pim_viewEmployeeList']")
	public WebElement employeeList;
	
	@FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
	public WebElement addEmployee;
	
	public DashBoardPageElement() {
		PageFactory.initElements(BaseClass.driver, this);
	
	}
	
	public void navigateToLeaveList() {
		click(leaveLnk);
		click(leaveList);
	}
	public void navigateToAddEmployee() {
		jsClick(pim);
		jsClick(addEmployee);
	}

}
