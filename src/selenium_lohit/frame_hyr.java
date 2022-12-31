package selenium_lohit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class frame_hyr {
	WebDriver driver;
	Actions actobj;
	public void launch() {
		System.setProperty(" webDriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement( By.id("name")).sendKeys("lohit");
	}
	public void frame1() throws InterruptedException {
		driver.switchTo().frame("frm1");
		Select drop=new Select(driver.findElement( By.id("course")));
		drop.selectByValue("python");
		Thread.sleep(4000);
		actobj=new Actions(driver);
		actobj.doubleClick().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement( By.id("name")).sendKeys("trinadh");
		driver.switchTo().frame("frm2");
		driver.findElement( By.name("fName")).sendKeys("trinadhlohit");
	}

	public static void main(String[] args) throws InterruptedException {
		frame_hyr obj=new frame_hyr();
		obj.launch();
		obj.frame1();


	}

}
