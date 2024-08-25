package com.akm.GenericUtils;

import java.io.File;
import java.io.IOException;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.qameta.allure.Attachment;

public class ListnerImp extends NewBase implements ITestListener 
{

	//To get method name by using ITestResult interface , result variable
		private static String getTestMethodName(ITestResult iTestResult) 
		{
			return iTestResult.getMethod().getConstructorOrMethod().getName();
		}
		//Take the scrennShot , >provide by allure
		@Attachment(value = "Screenshot of {0}", type = "image/png")
		public byte[] saveFailureScreenShot(String name,WebDriver driver) 
		{
			return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		}
		//Print msg 
		@Attachment(value = "{0}", type = "text/plain")
		public static String saveTextLog(String message) 
		{
			return message;
		}
			
		
		@Override
		public void onStart(ITestContext iTestContext) {
			System.out.println("I am in onStart method " + iTestContext.getName());
			iTestContext.setAttribute("WebDriver", NewBase.driver);
		}

		@Override
		public void onFinish(ITestContext iTestContext) {
			System.out.println("I am in onFinish method " + iTestContext.getName());
		}

		@Override
		public void onTestStart(ITestResult iTestResult) {
			System.out.println("I am in onTestStart method " + getTestMethodName(iTestResult) + " start");
		}

		@Override
		public void onTestSuccess(ITestResult iTestResult) {
			System.out.println("I am in onTestSuccess method " + getTestMethodName(iTestResult) + " succeed");
		}

		@Override
		public void onTestFailure(ITestResult iTestResult) 
		{
			System.out.println("I am in onTestFailure method " + getTestMethodName(iTestResult) + " failed");
//			Object testClass = iTestResult.getInstance();
//			WebDriver driver = NewBase.driver;
//			// Allure ScreenShot and SaveTestLog
//			if (driver instanceof WebDriver) {
//				System.out.println("Screenshot captured for test case:" + getTestMethodName(iTestResult));
				NewBase.captureScreenshot(getTestMethodName(iTestResult));
			}
			//saveTextLog(getTestMethodName(iTestResult) + " failed and screenshot taken!");	
		

		
		@Override
		public void onTestSkipped(ITestResult iTestResult) 
		{
			System.out.println("I am in onTestSkipped method " + getTestMethodName(iTestResult) + " skipped");
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) 
		{
			System.out.println("Test failed but it is in defined success ratio " + getTestMethodName(iTestResult));
		}


		

}

