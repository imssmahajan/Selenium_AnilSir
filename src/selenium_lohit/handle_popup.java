package selenium_lohit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handle_popup {
	WebDriver driver;
	Actions actobj;
	public void launch() throws InterruptedException {
		System.setProperty(" webDriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
	}
	public void popup() throws InterruptedException {
		actobj=new Actions(driver);
		actobj.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(1000);
	}
	public void senddata() throws InterruptedException 
	{
		actobj=new Actions(driver);
		WebElement search=driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
		actobj.sendKeys(search,"apple").perform();
		Thread.sleep(2000);
		actobj.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		WebElement click1=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img"));
		actobj.sendKeys(click1,Keys.ENTER).perform();
		//actobj.sendKeys(click1,Keys.ENTER).perform();
		
	}
	public static void main(String[] args) throws InterruptedException {
		handle_popup obj=new handle_popup();
		obj.launch();
		obj.popup();
		obj.senddata();

	}

}
