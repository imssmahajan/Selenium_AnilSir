package selenium_lohit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	WebDriver driver;
	public void launch() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
        driver=new ChromeDriver();
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=jumbo1-btn-ft&bc=HA");
        driver.manage().window().maximize();
        Thread.sleep(3000);
	}
	public void launch1() throws InterruptedException {
		//driver.findElement(By.xpath("//a[@aria-label='Start my free trial with Salesforce CRM']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.name("UserFirstName")).sendKeys("trinadh");
		Thread.sleep(2000);
		driver.findElement(By.name("UserLastName")).sendKeys("lohit");
		Thread.sleep(2000);
		driver.findElement(By.name("UserEmail")).sendKeys("trinadhlohit003@gmail.com");
		Thread.sleep(2000);
		WebElement job_title=driver.findElement(By.name("UserTitle"));
		//now create "select"method
		Select lohit=new Select(job_title);
		lohit.selectByVisibleText("Marketing_PR_Manager_AP");
		Thread.sleep(2000);
		lohit.selectByValue("Customer_Service_Manager_AP");
		Thread.sleep(2000);
		lohit.selectByIndex(5);
		Thread.sleep(2000);
	}
	public void company() throws InterruptedException {
		driver.findElement( By.name("CompanyName")).sendKeys("hhddn");
		WebElement employe=driver.findElement(By.name("CompanyEmployees"));
		Select lohit1=new Select(employe);
		lohit1.selectByIndex(3);
		Thread.sleep(2000);
		driver.findElement( By.name("UserPhone")).sendKeys("9388748741");
	}
	
	public static void main(String[] args) throws InterruptedException {
		dropdown obj=new dropdown();
		obj.launch();
		obj.launch1();
		obj.company();
	}

}
