package selenium_lohit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class exp_text {
	WebDriver driver;
	Actions act;
	public void launch() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
        driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
	}
	public void select() throws InterruptedException {
		act=new Actions(driver);
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		act.sendKeys(search,"apple").perform();
		for(int i=1;i<=6;i++) {
			act.sendKeys( Keys.DOWN).perform();
		}
		act.sendKeys( Keys.ENTER).perform();
		Thread.sleep(3000);
	}
	public static void main(String[] args) throws InterruptedException {
		exp_text obj=new exp_text();
		obj.launch();
		obj.select();

	}

}

