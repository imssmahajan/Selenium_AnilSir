package selenium_lohit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cchromeopen {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe" );
        WebDriver obj=new ChromeDriver();
        Thread.sleep(2000);
        obj.get("https://www.amazon.in/");
        obj.manage().window().maximize();
	}

}
