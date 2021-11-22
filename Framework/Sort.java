package com.mindtree.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIstore.SortLocator;

public class Sort {
	
	WebDriver driver = null;
    
    public Sort(WebDriver driver)
    {
 	   this.driver = driver;
    }
    
    public WebElement getnew()
    {
 	   return driver.findElement(SortLocator.newone);
    }
    public WebElement getsortt()
    {
 	   return driver.findElement(SortLocator.sort);
    }
    public WebElement getbest()
    {
 	   return driver.findElement(SortLocator.best);
    }

}
