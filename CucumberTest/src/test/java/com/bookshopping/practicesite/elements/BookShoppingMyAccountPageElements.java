package com.bookshopping.practicesite.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bookshopping.practicesite.Base.BaseClass;

public class BookShoppingMyAccountPageElements extends BaseClass{
	
	@FindBy(xpath="//a[contains(text(),'My Account')]")
	public WebElement myAccount;
	@FindBy(xpath="//*[@id='page-36']/div/div[1]/div/p[1]/strong")
	public WebElement loggedinusername;
	@FindBy(linkText="Logout")
	public WebElement logout;
	@FindBy(linkText="Orders")
	public WebElement orders;
	//@FindBy(linkText="View")
	@FindBy(xpath="//*[@id='page-36']/div/div[1]/div/table/tbody/tr[1]/td[1]/a")
	public WebElement recentorder;
	@FindBy(xpath="//*[@id='page-36']/div/div[1]/div/p/mark[1]")
	public WebElement orderid;
	@FindBy(xpath="//*[@id='page-36']/div/div[1]/div/p/mark[3]")
	public WebElement status;
	
	
	public void clickMyAccount()
	{
		//System.out.println("error test"+ myAccount);
		/*WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(myAccount));*/
		logger.info("in clickMyAccount()");
		myAccount.click();
	}public void verifyLoggedInUserName(String loggeduser)
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
	public void clickOrders()
	{
		orders.click();
	}
	public void clickView()
	{
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(recentorder));
		recentorder.click();
	}
	public void printStatus()
	{
		
		System.out.println("Status of the order "+orderid.getText()+" is "+ status.getText());
	}
}
