package Grid1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class grid2
{
	@Test
	@Parameters({"user","browser","appUrl"})
	public void login(String browser,String appUrl,String user) throws MalformedURLException
	{
		URL node=new URL(appUrl);
		DesiredCapabilities ds=new DesiredCapabilities();
		ds.setBrowserName(browser);
		WebDriver driver=new RemoteWebDriver(node,ds);
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
	     for(int i=0;i<300;i++)
	    /* {  
	    	 WebElement u = driver.findElement(By.id("username"));
	    	 u.clear();
	    	 u.sendKeys(user);
	    
	     
	     }*/
	    	 driver.findElement(By.id("username")).sendKeys("admin");
	         driver.findElement(By.name("pwd")).sendKeys("manager");
	         driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
	}

}
