package selenium_lohit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class human_effort {
	WebDriver driver;
	public void launch() throws InterruptedException {
	String[] browser={"chrome","firefox"};
	for( String lohit:browser) 
	{
		if(lohit.equalsIgnoreCase("cHrome" )) {
			System.setProperty(" webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			Thread.sleep(200);
		}
		else if(lohit.equalsIgnoreCase( "firefox")) {
			System.setProperty(" webdriver.gecko.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			Thread.sleep(300);
		}
		else {
			System.out.println("the broweser not found");
		}
	}
	
	
	}

	public static void main(String[] args) throws InterruptedException {
		human_effort obj=new human_effort();
		obj.launch();
	

	}

}
