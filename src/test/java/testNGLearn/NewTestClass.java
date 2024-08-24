package testNGLearn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.akm.GenericUtils.NewBase;

import POMpages.LoginPage;
@Listeners(com.akm.GenericUtils.ListnerImp.class)
public class NewTestClass extends NewBase {
	@Test()
	public void reachDashBoardPage()
	{
		
		driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
		driver.navigate().refresh();
	}
	@Test
	public void validateTitle() 
	{
		String title=driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM");
	}
	@Test(groups = "regression")
	public void validateDashboardPageContent()
	{
		String ss = driver.findElement(By.xpath("//p[text()='Time at Work']")).getText();
		Assert.assertEquals(ss,"Time at Work");
	}
	@Test(groups = "smoke")
	public void validateUrl()
	{
		List<WebElement> li = driver.findElements(By.xpath("//button[@title='Assign Leave']/../..//div[@title]"));
		for(WebElement e:li)
		{
			System.out.println(e.getText());
		}
	}
	

}
