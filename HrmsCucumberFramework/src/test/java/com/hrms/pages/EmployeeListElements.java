package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class EmployeeListElements {
	
	@FindBy(xpath = "//input[@id='firstName']")
	public WebElement firstName;
	
	@FindBy(xpath = "//input[@id='middleName']")
	public WebElement middleName;
	
	@FindBy(xpath = "//input[@id='lastName']")
	public WebElement lastName;
	
	@FindBy(xpath = "//input[@id='btnSave']")
	public WebElement save;
	
	@FindBy(linkText = "Personal Details")
	public WebElement personalDetails;
	
	public EmployeeListElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	

}
