package selenium_lohit;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class url_multibroweser {
	WebDriver driver;
	public void multi1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter browsername");
	    String browser=sc.nextLine();
		 
		if(browser.equalsIgnoreCase("ChromE")) {
			System.setProperty(" webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase( "firefox")) {
			System.setProperty(" webdriver.gecko.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new FirefoxDriver();
		}
		else {
			System.out.println(" browersnotfound");
		}
		driver.get( "https://www.amazon.in/");
	}

	public static void main(String[] args) {
		url_multibroweser obj=new url_multibroweser();
		obj.multi1();
		
		

	}

}
