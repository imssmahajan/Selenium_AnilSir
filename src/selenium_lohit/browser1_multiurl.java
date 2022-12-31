package selenium_lohit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser1_multiurl {
	WebDriver driver;
	public void launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe" );
        driver=new ChromeDriver();
        String url="https://www.google.com/";
        driver.get(url);
         String lohiturl =driver.getCurrentUrl();
         System.out.println("current url is:"+lohiturl);
        Thread.sleep(2000);
        driver.manage().window().maximize();
	}
	public void launch1() throws InterruptedException {
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

	public static void main(String[] args) throws InterruptedException {
		browser1_multiurl obj=new browser1_multiurl();
		obj.launch();
		obj.launch1();
		
		

	}

}
