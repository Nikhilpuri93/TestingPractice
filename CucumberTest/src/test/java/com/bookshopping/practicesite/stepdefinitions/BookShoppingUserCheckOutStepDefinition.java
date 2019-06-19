package com.bookshopping.practicesite.stepdefinitions;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;

import com.bookshopping.practicesite.Base.BaseClass;
import com.bookshopping.practicesite.elements.BookShoppingUserCheckOutPageElements;

import cucumber.api.java.en.Then;

public class BookShoppingUserCheckOutStepDefinition extends BaseClass {

	BookShoppingUserCheckOutPageElements bsucope=PageFactory.initElements(driver, BookShoppingUserCheckOutPageElements.class);

@Then("^fill billing details$")
public void fill_billing_details() throws InvalidFormatException{
    // Write code here that turns the phrase above into concrete actions
	//bsucope.fillBillingDetails("Nik", "k", "ctl", "test@gmail.com", "9494342123","abcd apartments", "Bengaluru", "karnataka", "560103");
	String fname=BaseClass.getCellValue(excelsheetpath, 1, 1,0);
	String lname=BaseClass.getCellValue(excelsheetpath, 1, 1,1);
	String comp=BaseClass.getCellValue(excelsheetpath, 1, 1,2);
	String mail=BaseClass.getCellValue(excelsheetpath, 1, 1,3);
	String cont=BaseClass.getCellValue(excelsheetpath, 1, 1,4);
	String addr=BaseClass.getCellValue(excelsheetpath, 1, 1,5);
	String city=BaseClass.getCellValue(excelsheetpath, 1, 1,6);
	String state=BaseClass.getCellValue(excelsheetpath, 1, 1,7);
	String zip=BaseClass.getCellValue(excelsheetpath, 1, 1,8);
	bsucope.fillBillingDetails(fname,lname,comp,mail,cont,addr,city,state,zip);
}

/*@Then("^select Direct Bank Transfer option$")
public void select_Direct_Bank_Transfer_option(){
    // Write code here that turns the phrase above into concrete actions
    bsucope.selectPaymentMethod();
}*/

@Then("^click on Place Order button$")
public void click_on_Place_Order_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    bsucope.clickPlaceOrder();
}

	
}
