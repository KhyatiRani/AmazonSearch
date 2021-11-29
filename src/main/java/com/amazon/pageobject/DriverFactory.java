package com.amazon.pageobject;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class DriverFactory {
	public Properties pro;
	static WebDriver driver;
	//ConfigReader reader = new ConfigReader();

	public static WebDriver getDriver() { // Setting system properties of ChromeDriver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Khyati.rani\\Downloads\\AmazonSearch\\AmazonSearch\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	/*
	 * public void testChrome() { ConfigReader reader = new ConfigReader();
	 * System.getProperty("webdriver.chrome.driver", reader.getChromePath());
	 * WebDriver driver = new ChromeDriver();
	 * driver.get(reader.getApplicationUrl()); driver.quit();
	 * 
	 * }
	 */

}