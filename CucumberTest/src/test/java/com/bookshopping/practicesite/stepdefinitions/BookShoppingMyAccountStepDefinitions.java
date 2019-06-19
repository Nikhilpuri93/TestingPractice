package com.bookshopping.practicesite.stepdefinitions;

import org.openqa.selenium.support.PageFactory;

import com.bookshopping.practicesite.Base.BaseClass;
import com.bookshopping.practicesite.elements.BookShoppingMyAccountPageElements;

import cucumber.api.java.en.Then;

public class BookShoppingMyAccountStepDefinitions extends BaseClass{
	
	BookShoppingMyAccountPageElements bsmape= PageFactory.initElements(driver, BookShoppingMyAccountPageElements.class);
	@Then("^Click on My Account option$")
	public void click_on_My_Account_option() {
	    // Write code here that turns the phrase above into concrete actions
	    //System.out.println("in click_on_My_Account_option method");
		logger.info("Clicking My Account");
		bsmape.clickMyAccount();
	}
	@Then("^verify the logged in username$")
	public void verify_the_logged_in_username(){
	    // Write code here that turns the phrase above into concrete actions
		logger.info("verifying the logged in username");
		bsmape.verifyLoggedInUserName("nikhilkumarpuri");
	}
	@Then("^click on orders link$")
	public void click_on_orders_link(){
	    // Write code here that turns the phrase above into concrete actions
		logger.info("clicking on orders link");
	    bsmape.clickOrders();
	}

	@Then("^click on recently placed order$")
	public void click_on_recently_placed_order(){
	    // Write code here that turns the phrase above into concrete actions
		logger.info("clicking on view button of the recently placed order");
	    bsmape.clickView();
	}

	@Then("^verify the status of the order$")
	public void verify_the_status_of_the_order(){
	    // Write code here that turns the phrase above into concrete actions
		logger.info("printing the status of the recently placed order");
	    bsmape.printStatus();
	}

}
