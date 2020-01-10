package Grid1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paractice 
{
	@Test
	@Parameters({"user","browser"})
	public void login(String user,String browser) throws MalformedURLException
	{
		URL node=new URL("http://localhost:4444//wd/hub");
		DesiredCapabilities ds=new DesiredCapabilities();
		ds.setBrowserName(browser);
		WebDriver driver=new RemoteWebDriver(node, ds);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		for(int i=0;i<100;i++)
		{
			WebElement u = driver.findElement(By.id("username"));
			u.clear();
			u.sendKeys(user);
		     
		    
		
		}
	}

}
