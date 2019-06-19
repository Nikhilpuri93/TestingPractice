package com.bookshopping.practicesite.stepdefinitions;

import org.openqa.selenium.support.PageFactory;

import com.bookshopping.practicesite.Base.BaseClass;
import com.bookshopping.practicesite.elements.BookShoppingOrderReceivedPageElements;

import cucumber.api.java.en.Then;

public class BookShoppingOrderReceivedStepDefinitions extends BaseClass{

	BookShoppingOrderReceivedPageElements bsorpe= PageFactory.initElements(driver, BookShoppingOrderReceivedPageElements.class
			);	
	@Then("^verify thank you message$")
	public void verify_thank_you_message()  {
	    // Write code here that turns the phrase above into concrete actions
	    bsorpe.verifyThanksText();
	}

	@Then("^print the order number$")
	public void print_the_order_number() {
	    // Write code here that turns the phrase above into concrete actions
	    bsorpe.printOrderId();
	}


	
}
