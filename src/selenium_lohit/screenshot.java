package selenium_lohit;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	//private static final File TakesScreenShot = null;
	WebDriver driver;
	public void launch() {
			System.setProperty(" webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get( "https://login.salesforce.com/");
	}
	
	public void screenshot1() throws Exception 
	{
		driver.findElement( By.id( "username")).sendKeys("lohit");
		Thread.sleep(2000);
		driver.findElement( By.id("password")).sendKeys( "474767");
		Thread.sleep( 2000);
		driver.findElement( By.id("Login")).click();
	}
	public void screen1() throws IOException {
		String lohit=driver.getPageSource();
		 System.out.println("sourse code is:"+lohit);
		if(lohit.contains( "trinadhlohit"))
		{
	    System.out.println("the msg was matched");
	 
		}
		else
		{
			File tr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 	File tr1=new File("C:\\Screen\\screen.png");
			FileHandler.copy(tr, tr1);
		}
	}
	public static void main(String[] args) throws Exception {
		screenshot obj=new screenshot();
		obj.launch();
		obj.screenshot1();
		obj.screen1();
		

	}

}
