import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.akm.GenericUtils.IPathConstant;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent12 
{
	public WebDriver driver;
	public ExtentHtmlReporter reporter;//Path of report file and we can change to look and feel of report
	public ExtentReports reports;//attach the reporter
	public ExtentTest test;//to make entries of test cases and logs
	@BeforeSuite
	public void setup() 
	
	{
		
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		reporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"\\ExtentReports\\report.html");
		reporter.config().setDocumentTitle("SDET");
		reporter.config().setTheme(Theme.STANDARD);
		
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		
		
	}
	@Test
	public void getTittle1()
	{
		test= reports.createTest("getTitle1");
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "OrangeHRM");
		
		
	}
	@Test
	public void getTittle2()
	{
		test= reports.createTest("getTitle2");
		String actualTitle = driver.getTitle();
		Assert.assertEquals(false, true);
		
		
	}
	@AfterMethod
	public void endReport(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL,"TC Failed"+result.getName());
			test.log(Status.FAIL,"TC Failed"+result.getThrowable());	
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS,"TC PASSED"+result.getName());
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP,"TC SKIPPED"+result.getName());
		}
	}
	
	@AfterSuite
	public void close()
	{
		driver.quit();
	reports.flush();	
	}

}
