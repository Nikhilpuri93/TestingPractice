package com.BDD.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElements {
	
	WebDriver driver;
	
	
	@FindBy(linkText="My Account")
	WebElement MyAccount;
	@FindBy(id="username")
	WebElement LoginUserName;
	@FindBy(id="password")
	WebElement LoginPassword;
	@FindBy(name="login")
	WebElement LoginButton;
	@FindBy(id="reg_email")
	WebElement RegisterUserName;
	@FindBy(id="reg_password")
	WebElement RegisterPassword;
	@FindBy(name="register")
	WebElement RegisterButton;
	@FindBy(linkText="logout")
	WebElement LogoutButton;
	
	public WebElement getMyAccount() {
		return MyAccount;
	}
	public void setMyAccount(WebElement myAccount) {
		MyAccount = myAccount;
	}
	public WebElement getLoginUserName() {
		return LoginUserName;
	}
	public void setLoginUserName(WebElement loginUserName) {
		LoginUserName = loginUserName;
	}
	public WebElement getLoginPassword() {
		return LoginPassword;
	}
	public void setLoginPassword(WebElement loginPassword) {
		LoginPassword = loginPassword;
	}
	public WebElement getLoginButton() {
		return LoginButton;
	}
	public void setLoginButton(WebElement loginButton) {
		LoginButton = loginButton;
	}
	public WebElement getRegisterUserName() {
		return RegisterUserName;
	}
	public void setRegisterUserName(WebElement registerUserName) {
		RegisterUserName = registerUserName;
	}
	public WebElement getRegisterPassword() {
		return RegisterPassword;
	}
	public void setRegisterPassword(WebElement registerPassword) {
		RegisterPassword = registerPassword;
	}
	public WebElement getRegisterButton() {
		return RegisterButton;
	}
	public void setRegisterButton(WebElement registerButton) {
		RegisterButton = registerButton;
	}
	public WebElement getLogoutButton() {
		return LogoutButton;
	}
	public void setLogoutButton(WebElement logoutButton) {
		LogoutButton = logoutButton;
	}
	public void clickMyAccount()
	{
		MyAccount.click();
	}
	public void setUsernamePassword(String uname, String pwd)
	{
		LoginUserName.sendKeys(uname);
		LoginPassword.sendKeys(pwd);
	}
	public void clickLoginButton()
	{
		LoginButton.click();
	}
	public void setRegisterUsernamePassword(String uname, String pwd)
	{
		RegisterUserName.sendKeys(uname);
		RegisterPassword.sendKeys(pwd);
	}
	public void clickRegisterButton()
	{
		RegisterButton.click();
	}
	public void clickLogoutButton()
	{
		LogoutButton.click();
	}
}
