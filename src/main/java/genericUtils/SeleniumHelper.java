package genericUtils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumHelper 
{
	public void SendDataTB(WebDriver driver,String ele,String str)
	{
		WebElement elee = driver.findElement(By.xpath(ele));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ele)));
		
		boolean b=elee.isDisplayed();
		b&= elee.isEnabled();
		if(b)
		{
			elee.clear();
			elee.sendKeys(str);
		}
		else
		{
			System.out.println("enter data");
		}
	}

}
