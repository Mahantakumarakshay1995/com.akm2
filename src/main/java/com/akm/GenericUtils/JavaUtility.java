package com.akm.GenericUtils;

import java.util.Random;

import org.apache.poi.hpsf.Date;
import org.testng.annotations.Test;
/**
 * this class contains java specific generic libraries
 * @author akshay
 */
public class JavaUtility {
	/**
	 * generate Random Number
	 * @return String
	 */

	public String getRandomData()
	{
		Random r=new Random();
		int ran = r.nextInt(5);
		return "-"+ran;
	}
/**
 * generate Current System Date
 * @return
 */
	
	public  String getCurrentSystemDate()
	{
		Date date=new Date();
		String currentDt = date.toString();
		return currentDt;
	}
}
