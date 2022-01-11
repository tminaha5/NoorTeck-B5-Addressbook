package com.noorteck.qa.utils;

import com.noorteck.qa.pages.AddressbookPage;
import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.SignInPage;
import com.noorteck.qa.pages.SignUpPage;

public class ObjInitialize extends Constants {
	
	 
	
	public static void initializeClassObj() {
		//initialize each page class objects here..
		
			signUpObj = new SignUpPage();
			signInObj = new SignInPage();
			homeObj = new HomePage();
			addressbookObj = new AddressbookPage();
		
		
	}

}
