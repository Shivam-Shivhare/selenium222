import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javaexucated {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.get("https://practicetestautomation.com/practice-test-login/");
		/*String s1=js.executeScript("return document.URL;").toString();
		System.out.println(s1);
		String s2=js.executeScript("return document.title;").toString();
		System.out.println(s2);
		String s3=js.executeScript("return document.Domain;").toString();
		System.out.println(s3);*/
		//js.executeScript("window.scrollBy(0,500)");
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		//js.executeScript("document.body.style.zoom='50%'");
		String s1=js.executeScript("return window.innerHeight;").toString();
		System.out.println(s1);
		String s2=js.executeScript("return window.innerWidth;").toString();
		System.out.println(s2);
	//	js.executeScript("alert('Alert-Message');");
		js.executeScript("document.getElementById('username').value='student';");
		js.executeScript("document.getElementById('password').value='Password123';");
		WebElement e1=driver.findElement(By.id("submit"));
		
		js.executeScript("arguments[0].click;",e1);
		
		

	}

}