package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signpom {

	public WebDriver driver;
	public Signpom (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[normalize-space()='My Account']")
	WebElement account;
	
	@FindBy(xpath="//input[@id='reg_email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='reg_password']")
	WebElement pass;
	
	@FindBy(xpath="//input[@name='register']")
	WebElement registration;
	
	@FindBy(xpath="//a[normalize-space()='Sign out']")
	WebElement signout;
	
	public void acc()
	{
		account.click();
	}
	
	public void email(String n)
	{
		email.sendKeys(n);
	}
	
	public void pass(String p)
	{
		pass.sendKeys(p);
	}
	
	public void click()
	{
		registration.click();
	}
	
	public void signout()
	{
		signout.click();
	}
	
	
}
