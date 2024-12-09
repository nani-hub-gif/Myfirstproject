package pageobject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Invalidvaliddata {

	public WebDriver driver;
	public Invalidvaliddata (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@id='username']")
	WebElement txt_Invusername;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement txt_Invpassword;
	
	@FindBy(xpath="//input[@name='login']")
	WebElement btn;
	
	@FindBy(xpath="//li[contains(text(),'A user could not be found with this')]")
	WebElement Errormsg;
	
	
	
	public void username(String invname)
	{
		txt_Invusername.sendKeys(invname);
	}
	
	public void password(String invpass)
	{
		txt_Invpassword.sendKeys(invpass);
	}
	
	
	public void login()
	{
		btn.click();
	}
	
	
	public void msg()
	{
		WebDriverWait f=new WebDriverWait(driver, Duration.ofSeconds(10));
		String s=Errormsg.getText();
		f.withMessage(s);
	}
}
