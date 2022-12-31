package selenium_lohit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_title {
	WebDriver driver;
	public void launch() throws InterruptedException {
	System.setProperty(" webDriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(" https://www.amazon.com/");
	Thread.sleep(200);
	driver.manage().window().maximize();
	
	}
	public void lohit() {
		String act_title=driver.getTitle();
		System.out.println(act_title);
		String exp_title="amzone";
		if (act_title.equals(exp_title));
		{
			System.out.println("passed");
		}
		//else {
			
		
			System.out.println("failed");
		}

	public static void main(String[] args) throws InterruptedException {
		get_title obj=new get_title();
		obj.launch();
		obj.lohit();
	}
	}


