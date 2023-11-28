
package com.frecrm.qa.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPageFactory {
	
	@FindBy(xpath = "//h1[text()='Free CRM About Us']")
	public WebElement lblAboutUs;

	
	
	public AboutPageFactory(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}

