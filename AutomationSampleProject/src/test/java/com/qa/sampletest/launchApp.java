package com.qa.sampletest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchApp {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://freecrm.com/crmcloud.html");

	}

}
