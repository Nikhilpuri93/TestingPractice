package com.StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserRegisterStepDefinitions {
	
	WebDriver driver;
	
	@Given("^Open Browser and Enter the Url$")
	public void open_Browser_and_Enter_the_Url(){
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "\\Users\\Ab70362\\Documents\\Nik_WS\\Testing jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://practice.automationtesting.in/");
	}

	@Given("^Click on MyAccount menu option$")
	public void click_on_MyAccount_menu_option(){
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.linkText("My Account")).click();
	}

	@Given("^Enter Username and Password to register$")
	public void enter_Username_and_Password_to_register(){
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("reg_email")).sendKeys("Nik");
	    driver.findElement(By.id("reg_password")).sendKeys("Nik@1241Test@!");
	        
	    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	    
	}

	@Given("^Click on Register button$")
	public void click_on_Register_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		String pwdstrength=driver.findElement(By.xpath("//*[@id='customer_login']/div[2]/form/p[2]/div")).getText();
		if(pwdstrength.equalsIgnoreCase("Strong"))
		{
		driver.findElement(By.name("register")).click();
	    driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		}
		else
		{
			System.out.println("please change the password");
		}
	}

	@Then("^Click on Logout button$")
	public void click_on_Logout_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id='page-36']/div/div[1]/nav/ul/li[6]/a")).click();
	}


}
