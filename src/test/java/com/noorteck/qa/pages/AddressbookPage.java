package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class AddressbookPage extends CommonUI{
	
	@FindBy(css = ".row.justify-content-center")
	WebElement newAddressField;
	
	@FindBy(css = "#address_first_name")
	WebElement firstNameField;
	
	@FindBy(css = "#address_last_name")
	WebElement lastNameField;
	
	@FindBy(css = "#address_street_address")
	WebElement addressOneField;
	
	@FindBy(css = "#address_secondary_address")
	WebElement addressTwoField;
	
	@FindBy(css = "#address_city")
	WebElement cityField;
	
	@FindBy(css = "#address_state")
	WebElement stateDropDown;
	
	@FindBy(css = "#address_zip_code")
	WebElement zipcodeField;
	
	@FindBy(css = "#address_country_us")
	WebElement countryRadio;
	
	@FindBy(css = "#address_age")
	WebElement ageField;
	
	@FindBy(css = "#address_website")
	WebElement websiteField;
	
	@FindBy(css = "#address_phone")
	WebElement phoneField;
	
	@FindBy(css = "#address_interest_dance")
	WebElement commonInterestsRadio;
	
	@FindBy(css = "#address_note")
	WebElement noteField;
	
	@FindBy(css = ".btn.btn-primary")
	WebElement createAddressButton;
	
	@FindBy(xpath = "//*[@data-test = 'list']")
	WebElement listOption;
	
	@FindBy(xpath = "//td[contains(text(),'John')]")
	WebElement verifyFirstName;
	
	@FindBy(xpath = "//td[contains(text(),'Doe')]")
	WebElement verifyLastName;
	
	@FindBy(xpath = "//td[contains(text(),'Fairfax')]")
	WebElement verifyCity;
	
	@FindBy(xpath = "//td[contains(text(),'VA')]")
	WebElement verifyState;
	
	
	public AddressbookPage() {
		PageFactory.initElements(driver, this);
		
	} 
	
	public void clickNewAddress() {
		click(newAddressField);
		
	}
	
	public void enterFirstName(String firstName) {
		enter(firstNameField, firstName);
		
	}
	
	public String verifyFirstName() {
		return getText(firstNameField);
		
	}
	
	public void enterLastName(String lastName) {
		enter(lastNameField, lastName);
		
	}
	
	public void enterAddressOne(String addressOne) {
		enter(addressOneField, addressOne);
		
	}
	
	public void enterAddressTwo(String addressTwo) {
		enter(addressTwoField, addressTwo);
	}
	
	public void enterCity(String city) {
		enter(cityField, city);
		
	}
	
	public void dropdownState(String methodName, String indexTextValue) {
		selectFromDropdown(stateDropDown, methodName, indexTextValue);
	}
	
	public void enterZipcode(String zipcode) {
		enter(zipcodeField, zipcode);
		
	}
	
	public void clickCountry() {
		click(countryRadio);
	}
	
	public void enterAge(String age) {
		enter(ageField, age);
	}
	
	public void enterWebsite(String website) {
		enter(websiteField, website);
	}
	
	public void enterPhone(String phone) {
		enter(phoneField, phone);
	}
	
	public void clickCommonInterests() {
		click(commonInterestsRadio);
		
	}
	
	public void enterNote(String note) {
		enter(noteField, note);
		
	}
	
	public void clickCreateAddress() {
		click(createAddressButton);
	}
	
	public void clickList() {
		click(listOption);
	}
	
	public String verifyFirstNameField() {
		return getText(verifyFirstName);
		
	}
	
	public String verifyLastNameField() {
		return getText(verifyLastName);
		
	}
	public String verifyCityField() {
		return getText(verifyCity);
		
	}
	public String verifyStateField() {
		return getText(verifyState);
		
	}
	
}




























