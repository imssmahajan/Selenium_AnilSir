package selenium_lohit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {
	
	WebDriver driver;
	Actions act;
	public void launch() throws InterruptedException {
	System.setProperty(" webDriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(" https://www.opencart.com/");
	Thread.sleep(3000);
	}
	public void right() throws InterruptedException {
		act=new Actions(driver);
		WebElement right=driver.findElement( By.xpath("//*[@id=\"hero\"]/div[1]/div[1]/div/p[2]/a[2]"));
		Thread.sleep(2000);
		act.contextClick(right).perform();
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		Right_click obj=new Right_click();
		obj.launch();
		obj.right();
	

	}

}
