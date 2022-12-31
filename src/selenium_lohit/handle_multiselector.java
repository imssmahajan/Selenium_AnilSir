package selenium_lohit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
 
 
public class handle_multiselector {
	WebDriver driver;
	Actions act;
	public void launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
        Thread.sleep(3000);
	}
	public void multisel () throws InterruptedException {
		driver.switchTo().frame("iframeResult");
		WebElement drop=driver.findElement( By.id("cars"));
		Thread.sleep(2000);
	    Select lohit=new Select(drop);
	    if(lohit.isMultiple()) {
	    	lohit.selectByVisibleText("Audi");
	    	
	    	Thread.sleep(3000);
	    	List<WebElement>allopt=lohit.getAllSelectedOptions();
	    	for(int i=1;i<allopt.size();i++) {
	    		String data=allopt.get(i).getText();
	    		System.out.println("the selected option is:"+data);
	    	}
	    		 
	    	Thread.sleep(3000);
	    	lohit.deselectByVisibleText("Audi");
	    	lohit.deselectAll();
	    	}
	    
	    	else
	    	{
	    		System.out.println("this not multi");
	    	}
	    }

	public static void main(String[] args) throws InterruptedException {
		handle_multiselector obj=new handle_multiselector();
		obj.launch();
		obj.multisel();

	}

}
