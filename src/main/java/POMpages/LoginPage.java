package POMpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	   WebDriver driver;//lunch the webdriver instance here
	  public LoginPage(WebDriver d) // point my driver when we calling it
	{
		this.driver=d;
		//this method will create webelement
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement usernameTB;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordTB;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement lgnButton;

	public WebElement getUsernameTB() {
		return usernameTB;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void setUsernameTB(WebElement usernameTB) {
		this.usernameTB = usernameTB;
	}

	public void setPasswordTB(WebElement passwordTB) {
		this.passwordTB = passwordTB;
	}

	public void setLgnButton(WebElement lgnButton) {
		this.lgnButton = lgnButton;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public WebElement getLgnButton() {
		return lgnButton;
	}
	/**
	 * Busines logic for Login Method
	 * @param username
	 * @param password
	 */
	
	public void Login(String username,String password)
	{
		usernameTB.sendKeys(username);
		passwordTB.sendKeys(password);
		lgnButton.click();
	}
	
	
	


}
