package guru99.gittest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static String url;
	public static Properties OR = new Properties();
	public static WebDriver driver;
	public static String FilePath = "C:\\workspace\\git\\gittest\\src\\test\\java\\guru99\\gittest\\OR.Properties";
	public static FileInputStream File;
	public static WebDriver driversetup() throws IOException {
		driver = new FirefoxDriver();
		driver.get(OR.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	public static void TearDown() {
		driver.quit();
	}

	public static Properties loadProFile() throws IOException {
		File = new FileInputStream(FilePath);
		OR.load(File);
		return OR;
	}
}