package AllureReport;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 
{
	
	@Test
    public void testMethod2()
    {
		Assert.assertTrue(true);
		System.out.println("testMethod2 is not working as expected");
    }
}
