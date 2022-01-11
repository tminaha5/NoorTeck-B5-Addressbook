package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class AddressBookTest extends ObjInitialize {

	public static void main(String[] args) {

		String url = "http://a.testaddressbook.com/sign_up";

		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);

		initializeClassObj();

		CommonUI.quitBrowser();

	} 

	// Test case 1
	public static void AddressTestOne() { 

		signUpObj.enterEmail("john_cena@gmail.com");
		signUpObj.enterPassword("johncena");
		signUpObj.clickSignUp();

		String actTitle = homeObj.textVerifyMessage();
		String expTitle = "Welcome to Address Book";

		if (actTitle.equals(expTitle)) {
			
			System.out.println("Test case 1 passed");
			
		} else {
			
			System.out.println("Test case 1 failed");
		}
	}

	// Test case 2
	public static void AddressTestTwo() {

		CommonUI.navigate("http://a.testaddressbook.com/sign_in");

		signInObj.enterEmailField("john_cena@gmail.com");
		signInObj.enterEmailField("cena");
		signInObj.clickSignIn();
		homeObj.clickAddressButton();
		addressbookObj.clickNewAddress();
		addressbookObj.enterFirstName("John");
		addressbookObj.enterLastName("Doe");
		addressbookObj.enterAddressOne("123 main street");
		addressbookObj.enterCity("Fairfax");
		addressbookObj.dropdownState("value", "VA");
		addressbookObj.clickCountry();
		addressbookObj.enterAge("22");
		addressbookObj.enterPhone("123-2334-3434");
		addressbookObj.clickCommonInterests();
		addressbookObj.enterNote("Automation is Fun");
		addressbookObj.clickCreateAddress();
		addressbookObj.clickList();

		String expFirstName = "John";
		String actFirstName = addressbookObj.verifyFirstNameField();

		if(actFirstName.equals(expFirstName)) {
			
			System.out.println("Test case 1 passed");
			
		} else {
			
			System.out.println("Test case 1 failed");
		}
	

		String expLastName = "Doe";
		String actLastName = addressbookObj.verifyLastNameField();

		if(actLastName.equals(expLastName)){
			
			System.out.println("Test case 2 passed");
			
		} else {
			
			System.out.println("Test case 2 failed");
		}
		
		
		String expCity = "Fairfax";
		String actCity = addressbookObj.verifyCityField();

		if(actCity.equals(expCity)){
			
			System.out.println("Test case 2 passed");
			
		} else {
			
			System.out.println("Test case 2 failed");
		}
		
		String expState = "VA";
		String actState = addressbookObj.verifyStateField();

		if(actState.equals(expState)){
			
			System.out.println("Test case 2 passed");
			
		} else {
			
			System.out.println("Test case 2 failed");
		}
	}
	
}



/**
 * -------------------------------------- INSTRUCTIONS
 * --------------------------------------------
 * 
 * ---> Create JAVA CLASS for each page of the application ---> Inspect the
 * elements and store the values ---> Create the class constructor ---> Create
 * the methods
 * 
 * ---> DONT FORGET ***** EACH PAGE CLASS SHOULD INHERIT CommonUI Class
 * ******************* ---> DONT FORGET ***** DECLARE PAGE CLASS OBJECT in
 * CONSTANTS CLASS ******************* ---> DONT FOGET ***** INITIALIZE PAGE
 * CLASS OBJECTS IN ObjInitialize JAVA ClASS ******************* ---> DONT FOGET
 * ***** CHANGE JAVA VERSION TO 1.8 *******************
 * 
 * 
 * 
 * ---> For each test case create a method then call those methods from main
 * method. ---> DONT FORGET ***** Refer to the INSTRUCTION PDF file for the test
 * cases to automate **************
 * 
 * ---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
 * ---> Once pushed add US to the project then send picture in MENTORS GROUP
 * CHAT Crystal: --> Koritzerc23@gmail.com Helen: --> Hnbehining@gmail.com
 * Ahmad: --> a.stanikzai77@gmail.com Fahim: --> NTKBatch5
 * 
 * 
 */
