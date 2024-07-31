package pageobjectfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	WebDriver wedriver;
	public Logout(WebDriver p) {
		wedriver=p;
		PageFactory.initElements(p,this);
	}
	@FindBy(xpath="//a[text()='Log out']")WebElement Logout;
	
	
	public void log()
	{
		Logout.click();
	}


	

}
