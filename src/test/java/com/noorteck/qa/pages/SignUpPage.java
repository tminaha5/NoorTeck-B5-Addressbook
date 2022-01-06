package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignUpPage extends CommonUI{
	
	@FindBy(css = "#user_email")
	WebElement emailField;
	
	@FindBy(css = "#user_password")
	WebElement passwordField;
	
	@FindBy(xpath = "//*[@data-test = 'submit']")
	WebElement signUpButton;
	
	public SignUpPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterEmail(String email) {
		enter(emailField, email);
		
	}
	
	public void enterPassword(String password) {
		enter(passwordField, password);
	}
	
	public void clickSignUp() {
		click(signUpButton);
	}

}







