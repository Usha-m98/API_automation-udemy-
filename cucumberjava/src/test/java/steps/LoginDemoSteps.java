//package steps;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class LoginDemoSteps 
//{
//	WebDriver d=null;
//	
//	@Given("browser is open")
//	public void browser_is_open() 
//	{
//		
//		WebDriverManager.chromedriver().setup();
//		d=new ChromeDriver();
//		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	d.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);   
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() 
//	{
//	   d.navigate().to("https://example.testproject.io/web/");
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username,String password) 
//	{
//	    d.findElement(By.id("name")).sendKeys(username);
//	    d.findElement(By.id("password")).sendKeys(password);
//	   
//	}
//	@And("user clicks on login")
//	public void user_clicks_on_login() 
//	{
//		 d.findElement(By.id("login")).click();
//	}
//
//	@Then("user navigates to next page")
//	public void user_navigates_to_next_page() 
//	{
//		d.findElement(By.id("logout")).isDisplayed();
//	}
//
//
//}
