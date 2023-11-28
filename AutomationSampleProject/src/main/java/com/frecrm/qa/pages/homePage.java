package com.frecrm.qa.pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.frecrm.qa.base.TestBase;
import com.frecrm.qa.pageFactory.AboutPageFactory;
//import com.frecrm.qa.pageFactory.AboutPageFactory;
import com.frecrm.qa.pageFactory.homePageFactory;
import com.trav.qa.util.Constants;

public class homePage extends TestBase {
	public homePageFactory homePageObject;
	public AboutPageFactory aboutpageObject;
	

	Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	public homePage() throws IOException {
		homePageObject = new homePageFactory(driver);
		aboutpageObject = new AboutPageFactory(driver);

	}
	
	public void verifyHomePage()
	{
		wait.until(ExpectedConditions.titleContains(Constants.homePageTitle));
		
		System.out.println("user is navigated to "+driver.getTitle());
		homePageObject.about.isDisplayed();
		homePageObject.crm.isDisplayed();
		homePageObject.signUp.isDisplayed();

		System.out.println("verified about, crm and signUp elements");
		
		homePageObject.about.click();
		
		System.out.println("Clicked on about button");

		wait.until(ExpectedConditions.visibilityOf(aboutpageObject.lblAboutUs));
		
		System.out.println("Navigated to about page");

		
	}

}
