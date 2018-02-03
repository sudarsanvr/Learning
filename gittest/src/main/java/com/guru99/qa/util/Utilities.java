package com.guru99.qa.util;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.guru99.qa.Base.TestBase;

public class Utilities extends TestBase {

	public static long PAGE_LOAD_WAIT = 20;
	public static long IMPLICIT_WAIT = 10;

	public Utilities() throws IOException {
		super();
		Explicitwait = new WebDriverWait(driver, 20);
	}

	public void explicitwaitbyvisibility(WebElement element) {
		Explicitwait.until(ExpectedConditions.visibilityOf(element));
	}

	public void explicitwaitbyclickability(WebElement element) {
		Explicitwait.until(ExpectedConditions.elementToBeClickable(element));
	}
}