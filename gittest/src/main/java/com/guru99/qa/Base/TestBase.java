package com.guru99.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestBase {
	public static String url;
	public static Properties Prop;
	public static WebDriver driver;
	public static String FilePath = "C:\\workspace\\git\\gittest\\src\\main\\java\\com\\guru99\\qa\\config\\config.Properties";
	public static FileInputStream File;
	public static FirefoxOptions options;
	public static WebDriverWait Explicitwait;

	public TestBase() throws IOException {
		Prop = new Properties();
		try {
			File = new FileInputStream(FilePath);
			Prop.load(File);
		} catch (FileNotFoundException FOF) {
			FOF.getStackTrace();
		} catch (IOException E) {
			E.getStackTrace();
		}
	}

	public static void driversetup() throws IOException {
		String browsername = Prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equals("firefox")) {
			driver = new FirefoxDriver();
			options = new FirefoxOptions();
			options.addPreference("security.insecure_password.ui.enabled", false);
			options.addPreference("security.insecure_field_warning.contextual.enabled", false);
		} else if (browsername.equals("internetexplorer")) {
			driver = new InternetExplorerDriver();

		}
		driver.manage().window().maximize();
		driver.get(Prop.getProperty("url"));
		//driver.manage().timeouts().pageLoadTimeout(Utilities.PAGE_LOAD_WAIT, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Utilities.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}

	public static void TearDown() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}
}