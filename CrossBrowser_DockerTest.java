package dockerSeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class CrossBrowser_DockerTest {
	WebDriver driver;
	@Parameters({"bname"})
	
	@Test
	public void BrowserTest(String bname) throws MalformedURLException, InterruptedException {
		
		if(bname.equalsIgnoreCase("Chrome")) {
			ChromeOptions options=new ChromeOptions();
			 driver=new RemoteWebDriver(new URL("http://localhost:4444"),options);
			 System.out.println("Connection for chrome browser established");
			
		}
		if(bname.equalsIgnoreCase("Firefox")) {
			FirefoxOptions options=new FirefoxOptions();
			 driver=new RemoteWebDriver(new URL("http://localhost:4444"),options);
			 System.out.println("Connection for firefox browser established");
				}
		
		if(bname.equalsIgnoreCase("Edge")) {
			EdgeOptions options=new EdgeOptions();
			 driver=new RemoteWebDriver(new URL("http://localhost:4444"),options);
			 System.out.println("Connection for Edge browser established");
		}
            Thread.sleep(8000);
			driver.get("https://www.amazon.com");
		   Thread.sleep(3000);
		   System.out.println("Application executing parallely");
			driver.quit();
	}
}

