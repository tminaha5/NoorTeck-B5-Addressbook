package com.noorteck.qa.steps;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddressbookTestOneStepDef  extends ObjInitialize{
	@Given("User is on Register Page")
	public void user_is_on_register_page() {
		
		String url = "http://demo.automationtesting.in/Register.html";
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();   
	}

	@When("User enters email {string}")
	public void user_enters_email(String email) {
		
		signInObj.enterEmailField(email);
	   
	}

	@When("User enters password {string}")
	public void user_enters_password(String password) {
	    
		signInObj.enterPassword(password);
	}

	@When("User clicks signup button")
	public void user_clicks_signup_button() {
		
	    signInObj.clickSignIn();
	    
	}

	@Then("User verifies message")
	public void user_verifies_message() throws InterruptedException {
		
		homeObj.textVerifyMessage();
		
		Thread.sleep(3000);
		CommonUI.quitBrowser();
	   
	}




}
