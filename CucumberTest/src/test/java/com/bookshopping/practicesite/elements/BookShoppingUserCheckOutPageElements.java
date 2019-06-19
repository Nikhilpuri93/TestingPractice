package com.bookshopping.practicesite.elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bookshopping.practicesite.Base.BaseClass;

public class BookShoppingUserCheckOutPageElements extends BaseClass {

	@FindBy(name="billing_first_name")
	public WebElement firstname;
	@FindBy(name="billing_last_name")
	public WebElement lastname;
	@FindBy(name="billing_company")
	public WebElement companyname;
	@FindBy(name="billing_email")
	public WebElement emailid;
	@FindBy(name="billing_phone")
	public WebElement contact;
	//@FindBy(xpath="//*[@id='s2id_billing_country']")
	/*public WebElement country;
	@FindBy(xpath="//*[@id='s2id_autogen1_search']")
	public WebElement countrytb;
	//@FindBy(xpath="//*[@id='select2-result-label-1625']")
	@FindBy()
	public WebElement countryres;
	*/
	@FindBy(name="billing_address_1")
	public WebElement address;
	@FindBy(name="billing_city")
	public WebElement city;
	//@FindBy(id="s2id_billing_state")
	@FindBy(xpath="//*[@id='s2id_billing_state']")
	public WebElement state;
	@FindBy(xpath="//*[@id='s2id_autogen2_search']")
	public WebElement statetb;
	@FindBy(xpath="//*[@id='select2-results-2']")
	public WebElement stateres;
	
	@FindBy(name="billing_postcode")
	public WebElement zipcode;
	//@FindBy(xpath="//*[@id='payment_method_cheque']")
	//@FindBy(xpath="//*[@id='payment']/ul/li[3]/label")
		//@FindBy(xpath="//*[@id='payment']/ul/li[2]/label")
	@FindBy(xpath="//*[@id='payment']/ul/li[1]/label")
	public WebElement paymentmethod;
	
	@FindBy(xpath="//*[@id='place_order']")
	public WebElement placeorder;
	
	
	
	public void fillBillingDetails(String fname,String lname,String comp,String email,String phone,String addr,String city,String state,String zip)
	{
		firstname.clear();
		firstname.sendKeys(fname);
		lastname.clear();
		lastname.sendKeys(lname);
		companyname.clear();
		companyname.sendKeys(comp);
		emailid.clear();
		emailid.sendKeys(email);
		contact.clear();
		contact.sendKeys(phone);
		
		//this.country.sendKeys(country);
		//selectCountry(country);
		address.clear();
		address.sendKeys(addr);
		this.city.clear();
		this.city.sendKeys(city);
		//this.state.clear();
		selectState(state);
		/*this.state.click();
		BaseClass.selectByText(this.state, state);*/
		//this.state.sendKeys(state);
		zipcode.clear();
		zipcode.sendKeys(zip);
	
	}
	
	/*public void selectCountry(String ctry)
	{
		country.click();
		
		countrytb.sendKeys(ctry);
		Select drpcnty= new Select(driver.findElement(By.name("billing_country")));
		drpcnty.selectByValue("IN");
		
		countryres.click();
		
	}*/
	public void selectState(String st)
	{
		state.click();
		statetb.sendKeys(st);
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
		stateres.click();
		
	}
	public void selectPaymentMethod()
	{
		wait(paymentmethod);
		paymentmethod.click();
	}
	public void clickPlaceOrder() throws InterruptedException
	{
		javaScriptExec(placeorder);
		//wait(placeorder);
		placeorder.click();
		Thread.sleep(10);
	}


	
}
