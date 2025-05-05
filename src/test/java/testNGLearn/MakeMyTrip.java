package testNGLearn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.akm.GenericUtils.NewBase;
import com.akm.GenericUtils.WebDriverUtility;

import POMpages.MakeMyTripPage;

public class MakeMyTrip extends NewBase
{
	WebDriver driver;
	WebDriverUtility wu=new WebDriverUtility();
	
	@Test
	public void cityChose() throws InterruptedException
	{
		this.driver=NewBase.driver;
		System.out.println("succesfully opened");
		driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]")).click();
//		
		MakeMyTripPage mtp=new MakeMyTripPage(driver);
		mtp.getFormCity().click();
		mtp.getAfterClickFormBox().sendKeys("g");
//		mtp.getAfterClickFormBox().sendKeys("GOA");
		//WebElement ele=driver.findElement(By.xpath("//input[@placeholder='From']"));
//		ele.click();
		
		
		List<WebElement> li = driver.findElements(By.xpath("//span[contains(text(),'GOI')]"));
		//System.out.println(li.toString());
		for(int i=0;i<li.size();i++)
		{
			if(li.get(i).getText().equalsIgnoreCase("GOI"))
			{
				li.get(i).click();
				break;
			}
		}
		
		WebElement toBox = driver.findElement(By.xpath("//span[@class='lbl_input appendBottom10']//following-sibling::input[@id='toCity']"));
		toBox.click();
		WebElement afterClickToBox = driver.findElement(By.xpath("//div[@class='autoSuggestPlugin hsw_autocomplePopup makeFlex column spaceBetween']//descendant::input[@placeholder='To']"));
		afterClickToBox.sendKeys("Jha");
		
		driver.findElement(By.xpath("//span[contains(text(),'JRG')]")).click();
		
		
//		WebElement formBox = driver.findElement(By.xpath("//div[@class='autoSuggestPlugin hsw_autocomplePopup']/div/input[@type='text']"));
//		wu.waitForElementVisibility(driver, formBox);
//		
//		WebElement tomBox = driver.findElement(By.xpath("//div[@class=\"autoSuggestPlugin hsw_autocomplePopup makeFlex column spaceBetween\"]/div/input"));
//		wu.waitForElementVisibility(driver, tomBox);
		Thread.sleep(4000);
		
		WebElement date = driver.findElement(By.xpath("//div[@class='DayPicker-Month']//descendant::div[@class='DayPicker-Day']//child::div[@class='dateInnerCell']//p[.='15']"));
		date.click();
		
		driver.findElement(By.xpath("//a[.='Search']")).click();
		
		
		
		
		//formBox.sendKeys("goa");
	//	formBox.sendKeys(driver.findElement(By.xpath("(//div[.='BLR'])[1]")));
//		Thread.sleep(4000);
//		WebElement src = driver.findElement(By.xpath("(//div[text()='BLR'])[1]"));
//		wu.waitForElementVisibilityWithClick(driver, src);
//		
//		tomBox.sendKeys("JRG");
//		Thread.sleep(3000);
//		 WebElement dest = driver.findElement(By.xpath("//span[contains(text(),'JRG')]"));
//		wu.waitForElementVisibilityWithClick(driver, dest);

		
		
	}

}
