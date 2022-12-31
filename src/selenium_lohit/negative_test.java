package selenium_lohit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class negative_test {
	WebDriver driver;
	public void launch() {
		System.setProperty(" webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get( "https://login.salesforce.com/");
	}
	public void argu(String name,String password) throws InterruptedException
	{
		driver.findElement( By.id( "username")).sendKeys("Username");
		Thread.sleep(2000);
		driver.findElement( By.id("password")).sendKeys( "password");
		Thread.sleep( 2000);
		driver.findElement( By.id("Login")).click();
	}
	public static void main(String[] args) throws InterruptedException {
		negative_test obj=new negative_test();
		obj.launch();
		obj.argu("trinadh", "tetete");
		obj.argu( "tghghghg", "fbbfbbf");


	}

}
