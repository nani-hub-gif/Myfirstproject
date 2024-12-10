package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Validuserwithemptypass {

	public WebDriver driver;
	
	public Validuserwithemptypass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='username']")
	WebElement txt_username;
	
	
	@FindBy(xpath="//input[@name='login']")
	WebElement loginbtn;
	
	public void name(String name)
	{
		txt_username.sendKeys(name);
	}
	
	
	public void login()
	{
		loginbtn.click();
	}
}
