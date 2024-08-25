package com.akm.GenericUtils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
/**
 * This class comtains WebDriver specific generic methods
 */
public class WebDriverUtility 
{
	/**
	 * Implicit wait
	 * @param driver
	 */
	public void waitUntilPageLoad(WebDriver driver )
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	/**
	 * Used for explict wait till visibility of element
	 * @param driver
	 * @param element
	 */
	public void waitForElementVisibility(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, null);

		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	/**
	 * customization wait till 50 time try to get element
	 * @param element
	 * @throws InterruptedException
	 */
	public void waitAndClick(WebElement element) throws InterruptedException
	{
		int count=0;
		while(count<50)
		{
			try 
			{
				element.click();
				break;
			}
			catch(Throwable e)
			{
				Thread.sleep(5000);
				count++;
			}
		}
	}
	/**
	 * This method will select on the basic of Visible text
	 * @param element
	 * @param option
	 */
	public void selectOptionByOption(WebElement element, String option)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(option);
	}
	/**
	 * This method will select on the basic of Index
	 * @param element
	 * @param option
	 */
	public void selectOptionByIndex(WebElement element, int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	/**
	 * This method will select  based upon Dynamic Dropdown
	 * @param element
	 * @param option
	 */
	public void selectOptionDynamicDropDown(WebElement element, String option)
	{
		Select sel=new Select(element);
		List<WebElement> Allopt = sel.getOptions();
		for (WebElement webElement : Allopt) 
		{
			String opt = webElement.getText();
			if(opt.equals(option))
			{
				sel.selectByVisibleText(option);
				break;
			}
			else
			{
				System.out.println("element is not present");
			}
		}
		
	}
	/**
	 * MouseHovering passing driber, and target will be webelement
	 * @param driver
	 * @param ele
	 */
	public void mouseOver(WebDriver driver, WebElement ele)
	{
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}
	/**
	 * Right click perform on a webelement
	 * @param driver
	 * @param ele
	 */
	public void contextClick(WebDriver driver, WebElement ele)
	{
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
	}
	/**
	 * double click perform on a webelement
	 * @param driver
	 * @param ele
	 */
	public void doubleClick(WebDriver driver, WebElement ele)
	{
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();
	}
	/**
	 * This method will switch to Differnt Window
	 * @param driver
	 * @param partialWinTitle
	 */
	public void switchToWindow(WebDriver driver, String partialWinTitle)
	{
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		while(it.hasNext())
		{
			String WinID = it.next();
			String title = driver.switchTo().window(WinID).getTitle();
			if(title.contains(partialWinTitle))
			{
				break;
			}
		}
	}
	/**
	 * This method will be used as alert accept the poop up..
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	/**
	 * This method will cancel the popup
	 * @param driver
	 */
	public void cancelAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	/**
	 * This method used for Scrolling action
	 * @param driver
	 * @param ele
	 */
	public void scrollToWebElement(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		int y=ele.getLocation().getY();
		js.executeAsyncScript("window.scrollBy(0,"+y+")", ele);
	}
	
	public void switchToFrame(WebDriver driver , int index)
	{
		driver.switchTo().frame(index);
	}
	public void switchToFrame(WebDriver driver , WebElement ele)
	{
		driver.switchTo().frame(ele);
	}
	public void switchToFrameById(WebDriver driver , int id)
	{
		driver.switchTo().frame(id);
	}
	/**
	 * Robot class enter Key
	 * @param key
	 * @throws AWTException
	 */
	public void pressEnterKey(KeyEvent key) throws AWTException
	{
		Robot  r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	public void dragAndDrop(WebElement ele1,WebElement ele2,WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(ele1, ele2).perform();;
	}

	
	
	

}
