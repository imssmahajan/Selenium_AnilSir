package selenium_lohit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class parallel_excecution {
	String browser="chrome";
	String browser1="firefox";
	public void launch() throws InterruptedException {
		WebDriver lohit;
		parallel_excecution obj =new parallel_excecution();
		
		if(browser.equalsIgnoreCase("chromE"))
		{
			
		System.setProperty("webdriver.chrom.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
			lohit=new ChromeDriver();
			lohit.get( "https://www.amazon.in//");
			System.out.println("URL is Open");
			lohit.manage().window().maximize();
			Thread.sleep(300);
			
			lohit.findElement( By.id("twotabsearchtextbox")).sendKeys("realme 10 pro plus");
			Thread.sleep(2000);
			System.out.println("Real pro Selected");
			lohit.findElement( By.id("nav-search-submit-button")).click();
		 if(browser1.equalsIgnoreCase("firefox")) 
		{
	        System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\Downloads\\geckodriver-v0.31.0-win64 (1)\\geckodriver.exe");
			lohit=new FirefoxDriver();
			lohit.get("https://www.amazon.in//");
			lohit.manage().window().maximize();
			Thread.sleep(300);
			lohit.findElement( By.id("twotabsearchtextbox")).sendKeys( "realme 10 pro plus");
			lohit.findElement( By.id("nav-search-submit-button")).click();
		}
		}
		else {
			System.out.println("the browese not found");
		}
		 
	}
	public static void main(String[] args) throws InterruptedException {
		parallel_excecution obj=new parallel_excecution();
		obj.launch();
	}
}
