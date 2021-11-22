package com.mindtree.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIstore.CODLocator;

public class COD {
	
WebDriver driver = null;
    
    public COD(WebDriver driver)
    {
 	   this.driver = driver;
    }
    
    public WebElement getcod()
    {
 	   return driver.findElement(CODLocator.cashondelivery);
    }
    public WebElement getpin()
    {
    	return driver.findElement(CODLocator.pincode);
    }
    public WebElement getans()
    {
    	return driver.findElement(CODLocator.result);
    }

}
