package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver;
	
	@Given("^I Open the website$")
	public void i_Open_the_website() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "E://Automation Softwares//Unzipped Files//Drivers//chromedriver_win32//chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://opensource.demo.orangehrmlive.com");
	    Thread.sleep(6000);
		
	}

	@When("^I enter Valid Username and Password$")
	public void i_enter_Valid_Username_and_Password() throws Throwable {
		
		driver.findElement(By.id("txtUsername")).sendKeys("ädmin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
	  
	}

	@And("^I click on Login button$")
	public void i_click_on_Login_button() throws Throwable {
	   
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^I should be able to login$")
	public void i_should_be_able_to_login() throws Throwable {
		
		if(driver.getCurrentUrl().equalsIgnoreCase("http://opensource.demo.orangehrmlive.com/index.php/dashboard")){
	         System.out.println("Test Pass"); 
	      } else { 
	         System.out.println("Test Failed"); 
	      } 
	      driver.close(); 
	   } 


}
