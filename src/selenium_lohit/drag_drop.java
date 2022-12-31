package selenium_lohit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop{
	WebDriver driver;
	Actions act;
	public void launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://jqueryui.com/droppable/");
        Thread.sleep(3000);
        
	}
	public void frames() throws InterruptedException {
		act=new Actions(driver);
		WebElement right=driver.findElement( By.xpath("//*[@id=\"menu-top\"]/li[5]/a"));
		act.contextClick(right).perform();
	
	}
	public void drag() {
		driver.switchTo().frame(0);
		act=new Actions(driver);
		WebElement drag=driver.findElement( By.id ("draggable"));
		WebElement drop=driver.findElement( By.id("droppable"));
		act.dragAndDrop(drag, drop).perform();
	}
	
	public static void main(String[] args) throws InterruptedException {
		drag_drop obj=new drag_drop();
		obj.frames();
		obj.launch();
		 obj.drag(); 

	}

}
