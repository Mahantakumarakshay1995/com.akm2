package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakeMyTripPage 
{
	WebDriver driver;
	public MakeMyTripPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFormCity() {
		return formCity;
	}

	public WebElement getToCity() {
		return toCity;
	}
	@FindBy(xpath="//input[@id='fromCity']")
	private WebElement formCity;
	
	@FindBy(xpath="input[@id='toCity']")
	private WebElement toCity;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAfterClickFormBox() {
		return afterClickFormBox;
	}
	@FindBy(xpath="//div[@class='autoSuggestPlugin hsw_autocomplePopup']//descendant::input[@placeholder='From']")
	private WebElement afterClickFormBox;
	
	
	
	

}
