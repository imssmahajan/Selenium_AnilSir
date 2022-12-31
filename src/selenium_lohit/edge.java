package selenium_lohit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edge {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty( "webdriver.edge.driver","C:\\Users\\DELL\\Downloads\\edgedriver_win64\\msedgedriver.exe" );
        WebDriver obj=new EdgeDriver();
        Thread.sleep(200);
	}

}
