package selenium_lohit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_action {
	WebDriver driver;
	Actions act;
	public void launch() throws InterruptedException {
	System.setProperty(" webDriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(" https://www.opencart.com/");
	Thread.sleep(3000);
	}
	
	public void mouseaction() {
		act=new Actions(driver);
		WebElement desk=driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/a"));
		WebElement mac=driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/div/div/ul/li[2]/a"));
		act.moveToElement(desk).moveToElement(mac).click().perform();
	}
	

	public static void main(String[] args) throws InterruptedException {
		mouse_action obj=new mouse_action();
		obj.launch();
		obj.mouseaction();
		

	}

}
