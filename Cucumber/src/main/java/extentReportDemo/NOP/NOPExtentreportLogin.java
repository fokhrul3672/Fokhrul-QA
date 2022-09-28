package extentReportDemo.NOP;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NOPExtentreportLogin {

	WebDriver driver;

	@FindBy(xpath = "//a[normalize-space()='Log in']")WebElement Loginbutton;
	@FindBy(xpath = "//input[@id='Email']")WebElement username;
	@FindBy(xpath = "//input[@id='Password']")WebElement password;
	@FindBy(xpath = "//button[normalize-space()='Log in']")WebElement Loinbutton2;
	@FindBy(xpath = "//a[normalize-space()='Log out']")WebElement Logoutbutton;
	
	public NOPExtentreportLogin(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void login1_valid() throws InterruptedException, IOException {
          
		NOPTestdetaExcel txl = new NOPTestdetaExcel();
		 String[] data = txl.readfile();
		 String user = data[0];
		 String pass = data[1];	
		Loginbutton.click();
	
		username.sendKeys(user);
		password.sendKeys(pass);
		Loinbutton2.click();
		Thread.sleep(2000);
		Logoutbutton.click();
	}
	public void login2_invalid() throws IOException {
		
		NOPTestdetaExcel txl = new NOPTestdetaExcel();
		 String[] data = txl.readfile();
		 String invaliduser = data[2];
		 String invalidpass = data[3];	
		Loginbutton.click();
		username.sendKeys(invaliduser);
		password.sendKeys(invalidpass);
		Loinbutton2.click();
		
	}
	public void login3_null() throws IOException {
		
		
		Loginbutton.click();
		username.sendKeys(" ");
		password.sendKeys(" ");
		Loinbutton2.click();
		
	}
	
	

}
