package stepdefinition;

import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageobject.Invalidvaliddata;
import pageobject.Signpom;
import pageobject.Validuserwithemptypass;

public class Baseclass {

	public WebDriver driver;
	public Signpom p;
	public Invalidvaliddata i;
	public Properties configproper;
	public Validuserwithemptypass n;
	
	public String Randome()
	{
		String randome=RandomStringUtils.randomAlphabetic(6);
		return randome;	
	}
}
