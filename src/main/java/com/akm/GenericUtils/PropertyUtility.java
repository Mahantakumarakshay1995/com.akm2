package com.akm.GenericUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyUtility {
	@Test
	public String getPropertyKeyValue(String key) throws IOException
	
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\Data\\commonData.properties");
		Properties p=new Properties();
		p.load(file);
		System.out.println(file);
		
		return p.getProperty(key);
		
	}

}
