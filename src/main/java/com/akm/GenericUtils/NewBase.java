package com.akm.GenericUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.maven.shared.utils.io.FileUtils;
import org.apache.poi.hpsf.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.akm.GenericUtils.IPathConstant;
import com.akm.GenericUtils.WebDriverUtility;

import POMpages.LoginPage;
import broswerUtils.BroswerChoice;


public class NewBase {
	public static File file;
	public static FileInputStream fis;
	public static Properties config;
	public static WebDriver driver;
	BroswerChoice bc=new BroswerChoice();
	
	
	//LoginPage lp=new LoginPage(driver);
	@BeforeSuite(groups = {"smoke", "regression"})
	public void openProperties() throws IOException
	{
		 file=new File(IPathConstant.PROPERTYFILEPATH);
		fis=new FileInputStream(file);
		config=new Properties();
		config.load(fis); 
	}
	@BeforeTest(groups = {"smoke", "regression"})
	public void browseUrl() throws IOException {
		String url=config.getProperty("url");
		String browser=config.getProperty("browser");
		driver=bc.browserSelection(driver, url, browser);
		
		driver.manage().window().maximize();
		WebDriverUtility wdu=new WebDriverUtility();
		wdu.waitUntilPageLoad(driver);
		
// For Login In to Orange HRM page		
//		LoginPage lp=new LoginPage(driver);
//		lp.Login("Admin", "admin123");
		
	}
	
	@AfterTest(groups = {"smoke", "regression"})//enabled = false)
	public void tearDown()
	{
		driver.quit();
	}
	
	public static void  captureScreenshot(String fileName)
	{
		//TakeScrrenshot
		String currentSystemDate=new Date().toString().replace(":","_").replace(" ", "_");
		System.out.println(currentSystemDate);
				TakesScreenshot sh=(TakesScreenshot)driver ;
			
				File sourceFile=sh.getScreenshotAs(OutputType.FILE);
				File destFile=new File("./Screenshots/"+fileName+currentSystemDate+".png");
				try {
					FileUtils.copyFile(sourceFile, destFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Screnshoot Saved sucessfully");
	}

}
