package com.guru99.qa.util;

import java.io.IOException;
import java.io.*;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;
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

	public void isalertpresent() {
		try {
			driver.switchTo().alert();
			alert.dismiss();
		} catch (NoAlertPresentException E) {
			E.getMessage();
		}
	}

	public static void TakescreenshotOnException(String PageName) throws IOException {
		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currenturl = System.getProperty("user.dir");
		FileUtils.copyFile(srcfile,
				new File(currenturl + "/screenshot/" + PageName + "_" + System.currentTimeMillis() + ".png"));
	}
}