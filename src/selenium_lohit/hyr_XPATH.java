package selenium_lohit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hyr_XPATH {
	    WebDriver driver;
	    public void frwdx() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='First Name ']/following::input[@name='name'][1]")).sendKeys("lohit");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Last Name']/following::input[@name='name'][1]")).sendKeys("trinadh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		Thread.sleep(2000);
	} 
	public void preceding_checkbox() throws InterruptedException { 
        driver.findElement(By.xpath("//table/tbody/tr[2]/td[2][text()='Maria Anders']/preceding::td[1]")).getText();
		Thread.sleep(3000);
		 driver.findElement( By.xpath("//td[text()='Maria Anders']/preceding-sibling::td/child::input[@type='checkbox']")).click();
		Thread.sleep(3000);
	}
	public static void main(String[] args) throws InterruptedException {
		hyr_XPATH obj=new hyr_XPATH();
		obj.frwdx();
		obj.preceding_checkbox();
	}

}
