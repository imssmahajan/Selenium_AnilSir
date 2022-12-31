package selenium_lohit;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class url_multi {
	public void launch() throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter valid no of times");
		int count =sc.nextInt();
		for(int i=1;i<=count;i++) 
		{
		System.setProperty( "webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver lohit=new ChromeDriver();
		lohit.get("https://www.amazon.com/" );
		Thread.sleep(300);
		
		}
		
	}

	public static void main(String[] args) throws InterruptedException { 
		url_multi obj=new url_multi();
		obj.launch();
			
		}

	}


