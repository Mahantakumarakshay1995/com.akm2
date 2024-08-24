package broswerUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BroswerChoice {
	
	public static WebDriver driver;
	public WebDriver browserSelection(WebDriver driver,String url,String brw) throws IOException 
	{
		
		
		
		String browser=brw;
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();	
		}
		else if(browser.equals("ff"))
		{
			FirefoxOptions options = new FirefoxOptions ();
			options.addArguments("--headless");
			driver=new FirefoxDriver(options);
		}
		else if(browser.equals("edge"))
		{
			EdgeOptions options=new EdgeOptions();
			options.addArguments("--headless");
			driver=new EdgeDriver(options);
		}
		else
		{
			System.out.println("please load browser with chrome/ff/edge");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		
		return driver;
		
		
	}

}
