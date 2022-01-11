package com.noorteck.qa.steps;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddressbookTestTwoStepDef  extends ObjInitialize{
	
	String url = "http://a.testaddressbook.com/";
	
	@When("User clicks signin button")
	public void user_clicks_signin_button() {
		
		String url = "http://demo.automationtesting.in/Register.html";
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();
		
		signInObj.clickSignIn();
	    
	}

	@When("User clicks new address")
	public void user_clicks_new_address() {
	   
		addressbookObj.clickNewAddress();
		
	}

	@When("User enters firstname {string}")
	public void user_enters_firstname(String firstName) {
	   
		addressbookObj.enterFirstName(firstName);
	}

	@When("User enters lastname {string}")
	public void user_enters_lastname(String lastName) {
		  
				addressbookObj.enterLastName(lastName);
	}

	@When("User enters address1 {string}")
	public void user_enters_address1(String address) {
		  
				addressbookObj.enterAddressOne(address);
	}

	@When("User enters city {string}")
	public void user_enters_city(String city) {
		  
				addressbookObj.enterCity(city);
	}

	@When("User selects state {string}")
	public void user_selects_state(String state) {
		  
				addressbookObj.dropdownState("value", state);
	}

	@When("User selects country")
	public void user_selects_country() {
	    
	  
				addressbookObj.clickCountry();
	}

	@When("User enters age {string}")
	public void user_enters_age(String age) {
		  
				addressbookObj.enterAge(age);
	}

	@When("User enters phone {string}")
	public void user_enters_phone(String phone) {
		  
				addressbookObj.enterPhone(phone);
	}

	@When("User selects common interests")
	public void user_selects_common_interests() {
	
				addressbookObj.clickCommonInterests();
	}

	@When("User enters note {string}")
	public void user_enters_note(String note) {
		  
				addressbookObj.enterNote(note);
	}

	@When("User clicks create address button")
	public void user_clicks_create_address_button() {
		  
				addressbookObj.clickCreateAddress();
	}

	@When("User clicks list button")
	public void user_clicks_list_button() {
		  
				addressbookObj.clickList();
	}

	@Then("User verifies firstname")
	public void user_verifies_firstname() {
		  
				addressbookObj.verifyFirstNameField();
	}

	@Then("User verifies lastname")
	public void user_verifies_lastname() {
		  
				addressbookObj.verifyLastNameField();
	}

	@Then("User verifies city")
	public void user_verifies_city() {
		  
				addressbookObj.verifyCityField();
	}

	@Then("User verifies state")
	public void user_verifies_state() throws InterruptedException {
		  
				addressbookObj.verifyStateField();
				
				Thread.sleep(3000);
				CommonUI.quitBrowser();
	}




}
