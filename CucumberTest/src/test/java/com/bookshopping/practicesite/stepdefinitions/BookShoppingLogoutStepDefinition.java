package com.bookshopping.practicesite.stepdefinitions;

import org.openqa.selenium.support.PageFactory;

import com.bookshopping.practicesite.Base.BaseClass;
import com.bookshopping.practicesite.elements.BookShoppingLoginPageElements;
import com.bookshopping.practicesite.elements.BookShoppingMyAccountPageElements;

import cucumber.api.java.en.Then;

public class BookShoppingLogoutStepDefinition extends BaseClass{
	BookShoppingMyAccountPageElements bsmape= PageFactory.initElements(driver, BookShoppingMyAccountPageElements.class);
	@Then("^logout from the application$")
	public void logout_from_the_application(){
	    // Write code here that turns the phrase above into concrete actions
		bsmape.clickMyAccount();
		bsmape.clickLogout();
	   
	}
	
}
