package com.bookshopping.practicesite.elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bookshopping.practicesite.Base.BaseClass;

public class BookShoppingShopPageElements extends BaseClass{
	
	
	
	@FindBy(linkText="Shop")
	public WebElement shop;
	//@FindBy(using="HTML5 Forms")
	@FindBy(xpath="//*[@id='content']/ul/li[3]/a[1]/h3")
	public WebElement bookname;
	@FindBy(xpath="//*[@id='content']/ul/li[3]/a[2]")
	public WebElement addtobasketbutton;
	@FindBy(xpath="//*[@id='content']/ul/li[3]/a[3]")
	public WebElement viewbasket;
	
	public void clickShop()
	{
		shop.click();
	}
	
	public void addBookToBasket()
	{
		BaseClass.javaScriptExec(bookname);
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", bookname);*/
	    addtobasketbutton.click();
	    driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
	}
	public void clickViewBasket()
	{
		viewbasket.click();
	}

}
