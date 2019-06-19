package com.bookshopping.practicesite.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.GherkinKeyword;
import com.bookshopping.practicesite.Base.BaseClass;
import com.bookshopping.practicesite.elements.BookShoppingLoginPageElements;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BookShoppingLoginStepDefinition extends BaseClass {
	
	WebDriver driver =BaseClass.driverForChromeBrowser();
	//WebDriver driver =BaseClass.driverForFirefoxBrowser();
	
	BookShoppingLoginPageElements bslpe = PageFactory.initElements(driver,BookShoppingLoginPageElements.class);	
	
	@Given("^User opens the automation practice site url$")
	public void user_opens_the_automation_practice_site_url() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		/*bslpe.driverForChromeBrowser();
		bslpe.setUrl();*/
		//driver=BaseClass.driverForChromeBrowser();
		//logger.createNode(new GherkinKeyword("Given"),"User opens the automation practice site url");
		BaseClass.setUrl();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
	}

	

	@Then("^enter username And password$")
	public void enter_username_And_password() throws InvalidFormatException, Exception {
	    // Write code here that turns the phrase above into concrete actions
		//logger.createNode(new GherkinKeyword("Then"),"enter username And password");
		String uname=BaseClass.getCellValue(excelsheetpath, 0,1,0);
		String pwd=BaseClass.getCellValue(excelsheetpath, 0, 1,1);
	    //bslpe.enterUsernameAndPassword("nikhilkumarpuri@gmail.com", "Nikab70362@1");
		bslpe.enterUsernameAndPassword(uname,pwd);
		
	}

	@And("^click on login button$")
	public void click_on_login_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		//logger.createNode(new GherkinKeyword("And"),"click on login button");
		bslpe.clickLoginButton();
		
	}
	
	


}
