package selenium_lohit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts_handle {
	WebDriver driver;
	public void launchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe" );
        driver=new ChromeDriver();
        driver.get("https://www.indiehackers.com/sign-in");
        Thread.sleep(2000);
        driver.manage().window().maximize();
	}
	public void click_ok() throws InterruptedException {
		driver.findElement(By.linkText("Reset")).click();
		 Thread.sleep(2000);
		 driver.switchTo().alert().accept();
		Thread.sleep(2000);
	}
	public void click_on_cancel() throws InterruptedException {
		driver.findElement(By.linkText("Reset")).click();
		 Thread.sleep(2000);
		 driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
	}
	public void send_data() throws InterruptedException {
		driver.findElement(By.linkText("Reset")).click();
		driver.switchTo().alert().sendKeys("trinadhlohit003@gmail.com");
		 Thread.sleep(4000);
		 driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	public void get_text_alert() throws InterruptedException {
		driver.findElement(By.linkText("Reset")).click();
       Thread.sleep(2000);
	   String text=driver.switchTo().alert().getText();
	   System.out.println("the alert text:"+text);
	} 
	public static void main(String[] args) throws InterruptedException {
		alerts_handle obj=new alerts_handle();
		obj.launchAUT();
		obj.click_ok();
		obj.click_on_cancel();
		obj.send_data();
		obj.get_text_alert();
		


	}

}
