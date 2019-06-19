package com.bookshopping.practicesite.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bookshopping.practicesite.Base.BaseClass;

public class BookShoppingOrderReceivedPageElements extends BaseClass {
	
	//@FindBy(className="woocommerce-thankyou-order-received")
	@FindBy (xpath="//div[@id='page-35']/div/div[1]/p[1]")
	public WebElement receivedtext;
	@FindBy(xpath="//*[@id='page-35']/div/div[1]/ul[1]/li[1]/strong")
	public WebElement orderid;
	
	public void verifyThanksText()
	{
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(receivedtext));
		//driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
		System.out.println(receivedtext.getText());
	}
	
	public void printOrderId()
	{
		//driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
		System.out.println("Your Order Id is:"+ orderid.getText());
	}
}
