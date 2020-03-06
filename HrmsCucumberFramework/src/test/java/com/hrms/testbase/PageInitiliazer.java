package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LeaveListPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;
import com.hrms.pages.ReportPageElements;

public class PageInitiliazer extends BaseClass {
	protected static DashboardPageElements dash;
	protected static LoginPageElements login;
	protected static AddEmployeePageElements add;
	protected static LeaveListPageElements leave;
	protected static PersonalDetailsPageElements person;
	protected static ReportPageElements report;

	public static void initializeAll() {
		login = new LoginPageElements();
		dash = new DashboardPageElements();
		add = new AddEmployeePageElements();
		leave = new LeaveListPageElements();
		person = new PersonalDetailsPageElements();
		report=new ReportPageElements();

	}
}
