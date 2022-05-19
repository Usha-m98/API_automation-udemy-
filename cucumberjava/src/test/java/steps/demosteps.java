package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class demosteps {
WebDriver d;
	@Given("User is on home page")
	public void User_is_on_home_page() {
	    WebDriverManager.chromedriver().setup();
	    d=new ChromeDriver();
	    d.manage().window().maximize();
	    d.get("http://demo.guru99.com/");
	}

	@When("User provide email id")
	public void User_provide_email_id() {
	    d.findElement(By.xpath("//input[@name='emailid']")).sendKeys("ushamtumkur@gmail.com");
	}

	@And("User click on submit button")
	public void User_click_on_submit_button() {
	    d.findElement(By.xpath("//input[@name='btnLogin']")).click();
	}

	@Then("Page should display the login details")
	public void page_should_display_the_login_details() {
	    System.out.println("Login details shown");
	}
	
	@When("User will provide blank email id")
	public void User_will_provide_blank_email_id() {
		d.findElement(By.xpath("//input[@name='emailid']")).sendKeys("");
	}

	@Then("Page should display the error message")
	public void page_should_display_the_error_message() {
	    System.out.println("error message");
	}

}
