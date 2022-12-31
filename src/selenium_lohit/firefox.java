package selenium_lohit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
	System.setProperty( "webdriver.geko.driver", "C:\\Users\\DELL\\Downloads\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
	WebDriver obj=new FirefoxDriver();

	}
}


