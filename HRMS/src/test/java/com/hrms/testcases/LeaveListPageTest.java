package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.hrms.pages.DashBoardPageElement;
import com.hrms.pages.LeaveListPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class LeaveListPageTest extends CommonMethods{
	
	@Test(groups = "regression")
	public void leaveLabelValidation() {
		LoginPageElements login = new LoginPageElements();
		DashBoardPageElement dashboard = new DashBoardPageElement();
		LeaveListPageElements leaveList = new LeaveListPageElements();
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		jsClick(dashboard.leaveLnk);
		jsClick(dashboard.leaveList);
		
		Assert.assertTrue(leaveList.leaveListLbl.isDisplayed(), "Label is Not displayed");
	}
	@Test(groups = "regression")
	public void leaveLableValidation1() {
		LoginPageElements login = new LoginPageElements();
		DashBoardPageElement dashboard = new DashBoardPageElement();
		LeaveListPageElements leaveList = new LeaveListPageElements();
		
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		dashboard.navigateToLeaveList();
		Assert.assertTrue(leaveList.leaveListLbl.isDisplayed(), "Labels is NOT displayed");
	}
	
	
	
	
	
	
	
	

}
