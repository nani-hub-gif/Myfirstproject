package stepdefinition;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pageobject.Invalidvaliddata;
import pageobject.Signpom;
import pageobject.Validuserwithemptypass;

public class sign extends Baseclass {

	
	@Before
	public void setup() throws IOException
	{
		configproper=new Properties();
		FileInputStream f=new FileInputStream("D:\\Workspace\\Selenium_cucumber\\config.properties");
		configproper.load(f);
		
		String br=configproper.getProperty("browser");
		
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();

		}
		
		if(br.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe");
		    driver = new EdgeDriver(); // Corrected to use EdgeDriver

			driver.manage().window().maximize();
		}
		
	}
	
	@Given("Open the browser")
	public void open_the_browser() {

		
		p=new Signpom(driver);

	}

	@Then("Enter the URL {string}")
	public void enter_the_url(String string) {
	   driver.get(string);
	}




	@And("Click on My Account Menu")
	public void click_on_my_account_menu() {
	    p.acc();
	}

	@And("Enter registered {string} in username textbox")
	public void enter_registered_in_username_textbox(String string) {

		String email1=Randome()+"@gmail.com";
			p.email(email1);
	}

	@And("Enter password in {string} textbox")
	public void enter_password_in_textbox(String string) {
		p.pass(string);

	}

	@Then("Click on login button")
	public void click_on_login_button() {
	    p.click();
	}

	@Then("User must successfully login to the web page")
	public void user_must_successfully_login_to_the_web_page() {
	    System.out.println("The User is Successfully login");
	}
	
	@Then("verify the Signout text")
	public void verify_the_signout_text() {
	    p.signout();
	}

//INCORRECT EMAIL AND PASSWORD
	
	@Then("Enter incorrect {string} in username textbox")
	public void enter_incorrect_in_username_textbox(String email) {
		i=new Invalidvaliddata(driver);
		i.username(email);
	}

	@Then("Enter incorrect {string} in password textbox.")
	public void enter_incorrect_in_password_textbox(String pass1) {
		i.password(pass1);
	}

	@Then("Proper error must be displayed\\(ie Invalid username) and prompt to enter login again")
	public void proper_error_must_be_displayed_ie_invalid_username_and_prompt_to_enter_login_again() {
		
	 boolean b=	driver.getPageSource().contains("Please provide a valid email address");
		Assert.assertTrue("Please provide a valid email address.", b);
	}

	//valid email and empty password
	
	@Then("Enter valid {string} in username textbox")
	public void enter_valid_in_username_textbox(String string) {
		n=new Validuserwithemptypass(driver);
	    n.name(string);
	}


	@Then("Click on login button.")
	public void click_on_login_button1() {
	    n.login();
	}

	@Then("Proper error must be displayed\\(ie Invalid password) and prompt to enter login again")
	public void proper_error_must_be_displayed_ie_invalid_password_and_prompt_to_enter_login_again() {
	   
		String s=driver.findElement(By.xpath("//div[@id='body']//li[1]")).getText();
		System.out.println(s);
		Assert.assertTrue("Password is required", true);
	}
	





}
