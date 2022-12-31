package selenium_lohit;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement Source =driver.findElement(By.id("draggable"));
		WebElement target =driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(Source, target).perform();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		driver.close();
		

		

	}
}