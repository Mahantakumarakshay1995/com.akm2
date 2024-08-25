package ExcelltestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.akm.GenericUtils.ExcellUtility;

public class importExcelTestData {
	ExcellUtility eu=new ExcellUtility();
	@Test
	public void createOrg() throws IOException 
	{
		String orgName = eu.getExcelDataHeader("Bhu", "TC_01", "OrgName");
		Assert.assertEquals("Altruist", orgName);
		System.out.println("execute createorg test");
		
	}
	
	@Test
	public void createOrgWithIndustry() throws EncryptedDocumentException, IOException
	{
		String industryTypeName = eu.getExcelDataHeader("Bhu", "TC_02", "IndustryType");
		Assert.assertEquals("IT", industryTypeName);
		System.out.println("execute createorgWithIndustry test");
	}

}
