package selenium_lohit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class add_cart1 {
	
	  RemoteWebDriver driver;
	  Actions actobj;
	  public void launch() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.amazon.com/");
		Thread.sleep(2000);
	  }
	public void senddata() throws InterruptedException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung m 13");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.findElements(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).getClass();
		Thread.sleep(2000);
		driver.findElements( By.id("add-to-cart-button")).getClass();
		Thread.sleep(2000); 
	}
	
	
	
	
	

	public static void main(String[] args) throws InterruptedException {
		add_cart1 obj=new add_cart1();
		obj.launch();
		obj.senddata();

	}

}
