package selenium_lohit;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scanners_in_selinium {
	//WebDriver driver;
	public void launch() throws InterruptedException {
	Scanner sc=new Scanner(System.in);
	System.out.println("eneter valid u.r.l");
	String url=sc.nextLine();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver lohi=new ChromeDriver();
	lohi.get(url);
	Thread.sleep( 300);
	//WebDriver lohi=new ChromeDriver();

	}
	public static void main(String[] args) throws InterruptedException {
		scanners_in_selinium obj=new scanners_in_selinium();
		obj.launch();
		

	}

}
