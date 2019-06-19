package com.bookshopping.practicesite.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bookshopping.practicesite.Base.BaseClass;

public class BookShoppingLoginPageElements extends BaseClass {

	
	//@FindBy(linkText="My Account")
	
	/*@FindBy(xpath="//a[contains(text(),'My Account')]")
	public WebElement myAccount;*/
	@FindBy(id="username")
	public WebElement username;
	@FindBy(id="password")
	public WebElement password;
	@FindBy(name="login")
	public WebElement loginbutton;
	/*@FindBy(xpath="//*[@id='page-36']/div/div[1]/div/p[1]/strong")
	public WebElement loggedinusername;
	@FindBy(linkText="Logout")
	public WebElement logout;*/

	/*public BookShoppingLoginPageElements(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}*/
	
	/*public void clickMyAccount()
	{
		//System.out.println("error test"+ myAccount);
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(myAccount));
		myAccount.click();
	}*/
	public void enterUsernameAndPassword(String uname, String pwd)
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
			
	}
	
	public void clickLoginButton()
	{
		loginbutton.click();
	}
	
	/*public void verifyLoggedInUserName(String loggeduser)
	{
		if(loggedinusername.getText().equalsIgnoreCase(loggeduser))
		{
			System.out.println("Loggedin user is : "+loggeduser);
		}
		else
		{
			System.out.println("Loggedin user is not correct");
		}
		
	}
	public void clickLogout()
	{
		logout.click();
	}
*/
}
