package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignInPage extends CommonUI{
	
	@FindBy(css = "#session_email")
	WebElement emailIDField;
	
	@FindBy(css = "#session_password")
	WebElement passwordField;
	
	@FindBy(css = ".btn.btn-primary")
	WebElement signInButton;
	
	public SignInPage() {
		PageFactory.initElements(driver, this);
		
	}

	public void enterEmailField(String email) {
		enter(emailIDField, email);
		
	}
	
	public void enterPassword(String password) {
		enter(passwordField, password);
		
	}
	
	public void clickSignIn() {
		click(signInButton);
		
	}
}
