package com.bookshopping.practicesite.stepdefinitions;

import org.openqa.selenium.support.PageFactory;

import com.bookshopping.practicesite.Base.BaseClass;
import com.bookshopping.practicesite.elements.BookShoppingShopPageElements;

import cucumber.api.java.en.Then;

public class BookShoppingShopStepDefinition extends BaseClass {

	BookShoppingShopPageElements bsspe = PageFactory.initElements(driver, BookShoppingShopPageElements.class);
	
	@Then("^click on shop option$")
	public void click_on_shop_option(){
	    // Write code here that turns the phrase above into concrete actions
	    bsspe.clickShop();
	}

	@Then("^add HTML(\\d+) Forms to basket$")
	public void add_HTML_Forms_to_basket(int arg1){
	    // Write code here that turns the phrase above into concrete actions
	    bsspe.addBookToBasket();
	}

	@Then("^click on view basket$")
	public void click_on_view_basket(){
	    // Write code here that turns the phrase above into concrete actions
	    bsspe.clickViewBasket();
	}

	

}
