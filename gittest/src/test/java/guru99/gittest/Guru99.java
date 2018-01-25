package guru99.gittest;

import org.testng.annotations.Test;
import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
public class Guru99 extends TestBase {

	public static LoginScreen Login;
	static {
		try {
			loadProFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@BeforeTest
	public static void setup() throws IOException {
		Login = new LoginScreen(driversetup());
	}

	@Test
	public void successfulLogin(){
		Login.Login();
	}
	
	@AfterTest
	public void quit() {
		TearDown();
	}
}
