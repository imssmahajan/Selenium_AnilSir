package selenium_lohit;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class diff_url_multi {
	public void launch() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  first valid u.r.l");
		//System.out.println("enter second url");
		String url =sc.nextLine();
		System.out.println("Enter Title");
		String exp_title=sc.nextLine();
		//String title=sc.nextLine();
		System.setProperty(" webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver lohit=new ChromeDriver();
		lohit.get(url);
		String act_title=lohit.getTitle();
		System.out.println(act_title);
		if(exp_title .equals(act_title))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
		
		
	}

	public static void main(String[] args) {
		diff_url_multi obj=new diff_url_multi();
		obj.launch();

	}

}
