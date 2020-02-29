package com.hrms.API.steps.practice;

import cucumber.api.java.en.Given;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import com.hrms.utils.CommonMethods;
import static io.restassured.RestAssured.*;

public class SyntaxAPIAuthenticationSteps {
	
	private Response response;
	public static String Token;
	private static RequestSpecification request;
	String generateTokenURI = "http://54.167.125.15/syntaxapi/api/generateToken.php";
	
	@Given("user generates token")
	public void user_generates_token() {

		request = given().header("Content-Type", "application/json");
		
		System.out.println(request.log().all());
		response = request.body(CommonMethods.readJson("C:\\Users\\Home\\eclipse-workspace\\HrmsCucumberFramework\\src\\test\\resources\\JSONFiles\\generateToken.json"))
		.when().post(generateTokenURI);
		System.out.println(response.prettyPrint());
		
		Token = response.jsonPath().getString("token");
		System.out.println(Token);
		
		
		
	}

}

