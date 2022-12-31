package selenium_lohit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class positive_test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty( "webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get( " https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys(" 8309871842");
		Thread.sleep(2000);
		driver.findElement( By.xpath( "//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys( "2424abab");
		Thread.sleep(3000);
		driver.findElement( By.xpath( "//button[@class='_2KpZ6l _2HKlqd _3AWRsL'] ")).click();
		Thread.sleep(2000);
	}

}
