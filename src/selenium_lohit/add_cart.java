package selenium_lohit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class add_cart {
	
	WebDriver driver;
	Actions actobj;
	public void launch() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.amazon.com/");
		Thread.sleep(2000);
	}
	  public void senddata() throws InterruptedException {
		  actobj=new Actions(driver);
		  WebElement search=driver.findElement( By.id("twotabsearchtextbox"));
		  actobj.sendKeys(search,"apple 12").perform();
		  Thread.sleep(2000);
		  actobj.sendKeys(Keys.ENTER).perform();
		  Thread.sleep(2000);
		  WebElement click=driver.findElement(By.cssSelector(".s-image"));
		  actobj.sendKeys(click, Keys.ENTER).perform();
		  Thread.sleep(2000);
		  driver.navigate().forward();
		  driver.findElement(By.xpath("//*[@id=\"abb_accessory_add_button_B08HDLV6P5\"]/span/input")).click();
		  Thread.sleep(2000);
	  }

	public static void main(String[] args) throws InterruptedException {
		add_cart obj=new add_cart();
		obj.launch();
		obj.senddata();

	}

}
