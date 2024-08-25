package HerokuApp;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.akm.GenericUtils.ExcellUtility;
import com.akm.GenericUtils.JavaUtility;
import com.akm.GenericUtils.NewBase;
import com.akm.GenericUtils.WebDriverUtility;


@Listeners(com.akm.GenericUtils.ListnerImp.class)
public class webdriverUse extends NewBase {
	WebDriver driver;
	
	WebDriverUtility wu=new WebDriverUtility();
	@Test
	public void openCheckDropDown() throws  IOException, InterruptedException 
	{
		this.driver=NewBase.driver;
		System.out.println("Opened HerokuApp");
		
		WebElement elebutton = driver.findElement(By.xpath("//a[text()='Dropdown']"));
		elebutton.click();
		
		WebElement ele = driver.findElement(By.xpath("//select[@id=\"dropdown\"]"));
		wu.selectOptionByIndex(ele, 1);
		
		Thread.sleep(5000);
		
		wu.selectOptionByOption(ele, "Option 2");
		
		System.out.println("sucessfully selected");
			
	}
	@Test
	public void checkDragDrop() throws InterruptedException
	{
		this.driver=NewBase.driver;
		System.out.println("Opened HerokuApp");
		
		WebElement dragAndDropbutton = driver.findElement(By.xpath("//a[contains(text(),'Drag and Drop')]"));
		dragAndDropbutton.click();
		
		WebElement ele1=driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement ele2=driver.findElement(By.xpath("//div[@id='column-b']"));

		wu.dragAndDrop(ele1, ele2, driver);
		System.out.println("sucessfully Action did");
		
	}

}
