import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class checkDemoHomePage {

	@Test

	public void site_header_is_on_home_page() {
		String WorkingDir = System.getProperty("user.dir");
		System.out.println("Current Working Directory: "+WorkingDir);
		
		System.setProperty("webdriver.chrome.driver","D:\\Project\\Webdriver_Basics\\Drivers\\chromedriver.exe");
		 

	    /*FirefoxOptions options = new FirefoxOptions();
	    options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");

	    WebDriver driver = new FirefoxDriver(options);*/
		WebDriver driver = new ChromeDriver();
	    
	    //Firefox's proxy driver executable is in a folder already
	    //  on the host system's PATH environment variable.
	    driver.get("http://saucelabs.com");
	    System.out.println("Launched Browser");
	    //WebElement header = driver.findElement(By.id("page-header"));
	    //assertTrue((header.isDisplayed()));

	    driver.close();     
	    driver.quit();
	   
	}

}
