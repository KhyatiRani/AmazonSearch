package com.amazon.pageobject;

import static com.amazon.pageobject.ObjectFileReader.getELementFromFile;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetPage {

	protected WebDriver webdriver;
	String pageName;

	public GetPage(WebDriver driver, String pageName) {
		this.webdriver = driver;
		this.pageName = pageName;
	}

	public  WebElement element(String elementToken) {
		return elementValue(elementToken);
	}

	public WebElement elementValue(String elementToken) {
		WebElement elem = null;
		By locator = getLocatorElement(elementToken);
		elem = webdriver.findElement(locator);
		return elem;
	}

	public List<WebElement> elementsValue(String elementToken) {
		return webdriver.findElements(getLocatorElement(elementToken));
	}

	public List<WebElement> elements(String elementToken) {
		return elementsValue(elementToken);
	}

	public By getLocatorElement(String elementToken) {
		String[] locator = getELementFromFile(this.pageName, elementToken);
		return getBy(locator[1].trim(), locator[2].trim());
	}

	public By getBy(String locatorType, String locatorValue) {
		switch (Locators.valueOf(locatorType)) {
		case id:
			return By.id(locatorValue);
		case xpath:
			return By.xpath(locatorValue);
		case css:
			return By.cssSelector(locatorValue);
		case name:
			return By.name(locatorValue);
		case classname:
			return By.className(locatorValue);
		case linktext:
			return By.linkText(locatorValue);
		default:
			return By.id(locatorValue);
		}
	}

}
