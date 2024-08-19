package testScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import broswerUtils.BroswerChoice;

public class ExecutionClass {
	static WebDriver driver;
	public static void main(String[] args) throws IOException  {

		BroswerChoice o=new BroswerChoice();
		String url = null;
		String brw = null;
		driver = o.browserSelection(driver, url, brw);
	}

} 
