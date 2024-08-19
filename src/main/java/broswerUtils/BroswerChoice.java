package broswerUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
			driver=new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
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
