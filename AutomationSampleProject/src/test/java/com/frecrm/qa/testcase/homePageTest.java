package com.frecrm.qa.testcase;


import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.frecrm.qa.base.TestBase;
import com.frecrm.qa.pages.homePage;


public class homePageTest extends TestBase{
	homePage homePage;

	public homePageTest() throws IOException {
		super();
	}
	
	@BeforeTest
	public void setup() throws IOException
	{
		intialization();
		homePage = new homePage();
	}
	
	@Test
	public void verifyHomePage()
	{
		homePage.verifyHomePage();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
