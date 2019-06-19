package com.bookshopping.practicesite.elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bookshopping.practicesite.Base.BaseClass;

public class BookShoppingUserBasketPageElements extends BaseClass {
	
	//@FindBy(className="checkout-button button alt wc-forward")
	@FindBy(xpath="//*[@id='page-34']/div/div[1]/div/div/div/a")
	public WebElement checkoutbutton;
	
	public void clickOnCheckout()
	{
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView()", checkoutbutton);
	    checkoutbutton.click();
	}

}
