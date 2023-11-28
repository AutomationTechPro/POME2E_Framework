package com.frecrm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static Properties prop;
	
	public static WebDriver driver; 

	public TestBase() throws IOException {

		try {
			prop = new Properties();
			FileInputStream ip;
			ip = new FileInputStream("src/main/java/com/frecrm/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public WebDriver intialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.contains("chrome")) {

			driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			return driver;

		} else {
		}
		return driver;


	}
}