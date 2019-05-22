package com.StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class UserLoginStepDefinition {
	
	WebDriver driver;
	

@Given("^Open Browser$")
public void open_Browser() {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "\\Users\\Ab70362\\Documents\\Nik_WS\\Testing jars\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
}

@When("^Enter the Url$")
public void enter_the_Url(){
    // Write code here that turns the phrase above into concrete actions
    driver.get("http://practice.automationtesting.in/");
}

@And("^Click on MyAccount menu option$")
public void click_on_MyAccount_menu_option(){
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.linkText("My Account")).click();
}

@And("^Enter registered Username and Password$")
public void enter_registered_Username_and_Password() {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id("username")).sendKeys("nikhilkumarpuri@gmail.com");
    driver.findElement(By.id("password")).sendKeys("Nikab70362@1");
    
}

@And("^Click on Login button$")
public void click_on_Login_button(){
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.name("login")).click();
}

@And("^User must login successfully$")
public void user_must_login_successfully() {
    // Write code here that turns the phrase above into concrete actions
    String exptext=driver.findElement(By.xpath("//*[@id='page-36']/div/div[1]/div/p[1]/strong")).getText();
    Assert.assertEquals("nikhilkumarpuri", exptext);
}
@Then("^Click on Logout button$")
public void click_on_Logout_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.linkText("Logout")).click();
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    driver.close();
}

}