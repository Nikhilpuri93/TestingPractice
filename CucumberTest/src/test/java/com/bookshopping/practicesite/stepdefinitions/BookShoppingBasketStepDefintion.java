package com.bookshopping.practicesite.stepdefinitions;

import org.openqa.selenium.support.PageFactory;

import com.bookshopping.practicesite.Base.BaseClass;
import com.bookshopping.practicesite.elements.BookShoppingUserBasketPageElements;

import cucumber.api.java.en.Then;

public class BookShoppingBasketStepDefintion extends BaseClass {

	BookShoppingUserBasketPageElements bsubpe=PageFactory.initElements(driver, BookShoppingUserBasketPageElements.class);
	@Then("^click on proceed to checkout$")
	public void click_on_proceed_to_checkout() {
	    // Write code here that turns the phrase above into concrete actions
		bsubpe.clickOnCheckout();
	}

	
}
