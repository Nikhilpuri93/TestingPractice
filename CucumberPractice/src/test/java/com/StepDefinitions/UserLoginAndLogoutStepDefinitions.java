package com.StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserLoginAndLogoutStepDefinitions {

	WebDriver driver;
	@Given("^Enter username and password$")
	public void enter_username_and_password(){
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("username")).sendKeys("nikhilkumarpuri@gmail.com	");
	    driver.findElement(By.name("password")).sendKeys("Nikab70362@1");
	}

	@Then("^click on Login button$")
	public void click_on_Login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("login")).click();
	}

	@Then("^verify the user logged in successfully$")
	public void verify_the_user_logged_in_successfully(){
	    // Write code here that turns the phrase above into concrete actions
	    String actText=driver.findElement(By.xpath("//*[@id='page-36']/div/div[1]/div/p[1]/strong")).getText();
	    actText.equalsIgnoreCase("Nik");
	}

	@Then("^click on Logout button$")
	public void click_on_Logout_button(){
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.linkText("Logout")).click();
	}

}
