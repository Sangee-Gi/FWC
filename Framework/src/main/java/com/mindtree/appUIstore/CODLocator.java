package com.mindtree.appUIstore;

import org.openqa.selenium.By;

public class CODLocator {
	public static By cashondelivery = By.xpath("//input[@id='PostalCode']");
	public static By pincode = By.xpath("//*[@id='cod-cheker']/button");
	public static By result = By.xpath("//p[@id='PostalCodeCheckerAvailability']");

}
