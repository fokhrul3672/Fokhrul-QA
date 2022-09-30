package StepDefeinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import extentReportDemo.NOP.NOPExtentRegistration;
import extentReportDemo.NOP.NOPExtentreportLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NOPStepUpdated {
	
	public WebDriver driver;
	NOPExtentRegistration nopreg;
	NOPExtentreportLogin noplog;
	
	
	@Given("open chrome and open url")
	public void  startBrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
	}
	
	@When("Input valid information")
	public void reg() {
		nopreg = new NOPExtentRegistration(driver);
		nopreg.Registration();
				
	}
	
	@Then("Registration complete and close driver")
	public void RegComplete() {
		System.out.println(" Registration Done");
		driver.close();
	}
	
	
	@When("login with valid credential")
	public void validInformation() throws InterruptedException, IOException {
		noplog = new NOPExtentreportLogin(driver);
		noplog.login1_valid();
		
	}
	@Then("Login with Valid info and close driver")
	public void LoginValid() {
		System.out.println(" Login Done");
		driver.close();
	}
	@When("login with invalid credential")
	public void invalidInformation() throws InterruptedException, IOException {
		noplog = new NOPExtentreportLogin(driver);
		noplog.login2_invalid();
		
	}
	@Then("Login with inValid info and close driver")
	public void LoginInvalid() {
		System.out.println(" Cannot Login");
		driver.close();
	}
	@When("login with Null credential")
	public void NullInformation() throws InterruptedException, IOException {
		noplog = new NOPExtentreportLogin(driver);
		noplog.login3_null();
		
	}
	@Then("Login with Null info and close driver")
	public void LoginNull() {
		System.out.println(" Cannot Login with null info");
		driver.close();
	}
	
}
