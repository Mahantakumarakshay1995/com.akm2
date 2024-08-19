package HerokuApp;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.akm.GenericUtils.ExcellUtility;
import com.akm.GenericUtils.JavaUtility;
import com.akm.GenericUtils.NewBase;
import com.akm.GenericUtils.WebDriverUtility;


@Listeners(com.akm.GenericUtils.ListnerImp.class)
public class webdriverUse extends NewBase {
	
	WebDriverUtility wu=new WebDriverUtility();
	@Test
	public void open() throws EncryptedDocumentException, IOException 
	{
		System.out.println(10/0);
		System.out.println("Opened HerokuApp");
		
		
		
	}

}
