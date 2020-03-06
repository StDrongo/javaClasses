package com.hrms.API.steps.practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.junit.Assert;
import org.junit.Test;
//import static io.restassured.RestAssured.*;

public class SampleIPITest {

//	@Test
//	public void getAllJobTitles() {
//
//		Response response = RestAssured.given().contentType("application/json").header("Authorization",
//				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzQxNTUsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4OTM1NSwidXNlcklkIjoiMTQzIn0.AAuXclbUw2aAuVxQNOSfNZ4-ZdfVZsMkVzrn2c_IKf0")
//				.when().get("http://54.167.125.15/syntaxapi/api/jobTitle.php");
//		response.prettyPrint();
//		int actualResponseCode = response.getStatusCode();
//		System.out.println(actualResponseCode);
//	}
	//@Test
	public void getOneEmployee() {
		
		Response response = RestAssured.given().param("employee_id", "06423A").contentType("application/json").header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzQxNTUsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4OTM1NSwidXNlcklkIjoiMTQzIn0.AAuXclbUw2aAuVxQNOSfNZ4-ZdfVZsMkVzrn2c_IKf0")
				.when().get("http://54.167.125.15/syntaxapi/api/getOneEmployee.php");
		
		response.prettyPrint();

	}
	
	//@Test
	public void getAllEmployeeStatuses() {
		
		Response response = RestAssured.given().contentType("application/json").header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzQxNTUsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4OTM1NSwidXNlcklkIjoiMTQzIn0.AAuXclbUw2aAuVxQNOSfNZ4-ZdfVZsMkVzrn2c_IKf0")
				.when().get("http://54.167.125.15/syntaxapi/api/employeeStatus.php");
		
		response.prettyPrint();
		int actualResponseCode = response.getStatusCode();
		System.out.println(actualResponseCode);
	}
	
	@Test
	public void createEmployee() {
		
	Response response = RestAssured.given().contentType("application/json").header("Authorization",
		"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzQxNTUsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4OTM1NSwidXNlcklkIjoiMTQzIn0.AAuXclbUw2aAuVxQNOSfNZ4-ZdfVZsMkVzrn2c_IKf0")
//		.param("emp_firstname", "Yulia")
//		.param("emp_lastname", "Pankrat")
//		.param("emp_middle_name", "student")
//		.param("emp_gender", "1")
//		.param("emp_birthday", "1995-06-16")
//		.param("emp_status", "Freelance")
//		.param("emp_job_title", "Jr Sales Manager")
		.when().post("http://54.167.125.15/syntaxapi/api/createEmployee.php");
	
		response.prettyPrint();
		int actualStatusCode = response.getStatusCode();
		Assert.assertEquals(200, actualStatusCode);
	}

}
//Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzI3NzksImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4Nzk3OSwidXNlcklkIjoiMTQzIn0.UVYzG-Q2bpJnx3ErW9fUtO4VV0XoXpsSYMYFA878ToE