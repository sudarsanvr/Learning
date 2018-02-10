package com.guru99.qa.util;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.guru99.qa.Base.TestBase;

public class WebEventListener extends TestBase implements WebDriverEventListener {

	public WebEventListener() throws IOException {
		super();
	}

	public void afterAlertAccept(WebDriver driver) {
		System.out.println("Alert has been accepted");
	}

	public void afterAlertDismiss(WebDriver driver) {
		System.out.println("Alert has been dismissed");
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("Clicked On: " + element);
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Element found by :" + by.toString());
	}

	public void afterNavigateBack(WebDriver driver) {
		System.out.println("Navigating to: '" + url + "'");
	}

	public void afterNavigateForward(WebDriver driver) {
		System.out.println("Before navigating to: '" + url + "'");
	}

	public void afterNavigateRefresh(WebDriver driver) {
		System.out.println("The page has been refreshed");
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("Navigating to :" + url);
	}

	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
	}

	public void beforeAlertAccept(WebDriver driver) {
		System.out.println("Alert to be Accepted");
	}

	public void beforeAlertDismiss(WebDriver driver) {
		System.out.println("Alert to be Dismissed");
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println(element + " is to be clicked");
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Trying to find Element By : " + by.toString());
	}

	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("Navigating back to previous page");
	}

	public void beforeNavigateForward(WebDriver driver) {
		System.out.println("Navigating to next page");
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
	}

	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("Before navigating to: '" + url + "'");
	}

	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
	}

	public void onException(Throwable error, WebDriver driver) {
		System.out.println("Exception :" + error + "has occured");
		try {
			Utilities.TakescreenshotOnException(driver.getTitle());
		} catch (FileNotFoundException FOF) {
			FOF.getStackTrace();
		} catch (IOException IOE) {
			IOE.getStackTrace();
		}
	}
}
