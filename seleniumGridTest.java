package dockerSeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class seleniumGridTest {
	@Test
	public void gridtest() throws MalformedURLException, InterruptedException{
		

		  ChromeOptions options=new ChromeOptions();//to change setup for chrome
		  System.out.println("driver session start on grid");
          WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444"),options);
 /*
  * Remote webdriver used only for grid
  * from remotewebdriver implement methods
  */
 
 Thread.sleep(8000);
	driver.get("https://www.google.com");
	Thread.sleep(5000);
	  System.out.println("application open");
	  System.out.println("title is"+driver.getTitle());
	  driver.quit();
	  
	  
	  
  }
}
