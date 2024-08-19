package testScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void createOrg() {
		System.out.println("execute createorg test");
		System.out.println(10/0);
	}
	
	@Test
	public void createOrgWithIndustry()
	{
		System.out.println("execute createorgWithIndustry test");
	}

}
