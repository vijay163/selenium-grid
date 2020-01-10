package Grid1;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class grid1 
{
	@Test
	public void browserTest() throws InterruptedException, IOException
	{
		URL node = new URL("http://localhost:4444/wd/hub");
		DesiredCapabilities ds=new DesiredCapabilities();
		ds.setBrowserName("firefox");
		
		WebDriver driver=new RemoteWebDriver(node,ds);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   /* driver.get("http://localhost/login.do");
	    driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.xpath("//div[text()='Login ']")).click();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	*/driver.get("http://www.myntra.com");
	 WebElement men = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
	    Actions ac = new Actions(driver);
	    ac.moveToElement(men).perform();
	    WebElement sw = driver.findElement(By.xpath("//a[text()='Sweaters']"));
	    ac.sendKeys(Keys.CONTROL).click(sw).perform();
	    /*ac.contextClick(sw).perform();
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_T);
	   
	    Thread.sleep(2000);
	    WebElement dis = driver.findElement(By.xpath("(//span[contains(.,'1299')]/span[2]/../../span[2])[1]"));
	    Thread.sleep(2000);
	   TakesScreenshot ts = (TakesScreenshot)driver;
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    File des = new File("./Photo/dis2.png");
	    FileUtils.copyFile(src, des);
	  Thread.sleep(2000);
	   System.out.println(dis.getText());
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	    Thread.sleep(2000);
	    WebElement s = driver.findElement(By.xpath("(//span[contains(.,'2999')])[1]"));
	  int yaxis = s.getLocation().getY();
	  System.out.println(yaxis);
	  js.executeScript("window.scrollTo(0,"+yaxis+")");
	  Thread.sleep(2000);
	 WebElement click = driver.findElement(By.xpath("(//span[contains(.,'714')])[1]"));
	Thread.sleep(3000);
	ac.doubleClick(click).perform();
	 Thread.sleep(3000);
	 WebElement text = driver.findElement(By.xpath("//span[text()='EMI starting from Rs. 33/month']/../../../../../../div[1]"));
	  System.out.println("**emi cost is***"+text.getText());
	 */}
	
		}
	


