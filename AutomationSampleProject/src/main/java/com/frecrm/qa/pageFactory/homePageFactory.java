package com.frecrm.qa.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePageFactory {
	
	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	public WebElement signUp;

	@FindBy(xpath = "//a[normalize-space()='About']")
	public WebElement about;
	
	@FindBy(xpath = "//a[normalize-space()='CRM']")
	public WebElement crm;

	
	public homePageFactory(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}

