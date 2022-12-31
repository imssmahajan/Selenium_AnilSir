package selenium_lohit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class data_searchbox {
	WebDriver driver;
	public void launchAT() {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get( "https://www.amazon.com/");
	}
	public void product() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(" apple 13");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}
	
	public static void main(String[] args) {
		data_searchbox obj=new data_searchbox();
		obj.launchAT();
		obj.product();
		

	}

}
