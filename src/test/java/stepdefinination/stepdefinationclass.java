package stepdefinination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectfile.Logout;
import pageobjectfile.loginclass;

public class stepdefinationclass {
	public WebDriver driver;
	public loginclass l1;
	public Logout l2;
	
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() 
	{
	    driver=new ChromeDriver();
	    l1=new loginclass(driver);
	}

	@When("User open url {string}")
	public void user_open_url(String url) 
	{
	   driver.get(url);
	}

	@When("user Enter username {string} and password {string}")
	public void user_enter_username_and_password(String user, String pass) 
	{
	   l1.user(user);
	   l1.pass(pass);
	}

	@When("click on submit button")
	public void click_on_submit_button()
	{
	   l1.sub();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String exptitle)
	{
	   String actualtitle=driver.getTitle();
	   if(actualtitle.equals(exptitle))
	   {
		  org.testng.Assert.assertTrue(true);
	   }
	   else
	   {
		   org.testng.Assert.assertTrue(false);
	   }
	}

	@When("User click on logout button")
	public void user_click_on_logout_button()
	{
	   l2.log();
	}

	@Then("close browser")
	public void close_browser() 
	{
	   driver.close();
	   driver.quit();
	}


}
