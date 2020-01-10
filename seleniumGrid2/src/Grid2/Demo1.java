package Grid2;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {
	@Test
	@Parameters({"user","appUrl","browser"})
	public void login(String user,String appUrl,String browser) throws MalformedURLException
	{
		URL node=new URL(appUrl);
		DesiredCapabilities ds=new DesiredCapabilities();
		ds.setBrowserName(browser);
		WebDriver driver=new RemoteWebDriver(node,ds);
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
	     /*for(int i=0;i<300;i++)
	     { 
	    	 WebElement u = driver.findElement(By.id("username"));
	    	 u.clear();
	    	 u.sendKeys(user);
	    
	 
	   */ }


	
	}



