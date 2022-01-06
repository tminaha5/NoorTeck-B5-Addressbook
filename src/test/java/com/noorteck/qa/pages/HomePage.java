package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI{
	

	@FindBy(css = ".nav-item.nav-link.active")
	WebElement homeButton;
	
	@FindBy(xpath = "//*[@data-test = 'addresses']")
	WebElement addressButton;
	
	@FindBy(xpath = "//*[@data-test= 'sign-out']")
	WebElement signOutButton;
	
	@FindBy(xpath = "//h1[contains(text(),'Welcome')])")
	WebElement verifyMessage;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickHome() {
		click(homeButton);
	}
	
	public void clickAddressButton() {
		click(addressButton);
		
	}
	
	public void clickSignOut() {
		click(signOutButton);
	}
	
	public String textVerifyMessage() {
		return getText(verifyMessage);
	}
	
	

}
