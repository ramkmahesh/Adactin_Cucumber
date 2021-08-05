package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Newnewbase_Class;
import com.adactin.pom.LoginPage;
import com.adactin.property.File_Reader_Manager;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class Stepdefenition extends Newnewbase_Class {
	
	public static WebDriver driver= Runner.driver;
	
	LoginPage lp = new LoginPage(driver);
	
	@Given("^User launch the adactin application$")
	public void user_launch_the_adactin_application() throws Throwable {
		
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		
		getUrl(url);
	    
	}

	@When("^User enter the valid username$")
	public void user_enter_the_valid_username() throws Throwable {
		
		inputOfElement(lp.getUsername(), "maheshrk");
	}  

	@When("^User enter the valid password$")
	public void user_enter_the_valid_password() throws Throwable {
		
		inputOfElement(lp.getPassword(), "junejuly");
	   
	}
	
	
	@When("^User click on Login$")
     public void user_click_on_Login() throws Throwable {
		
		clickOnElement(lp.getLogin());
		
	}
		
			

	@Then("^User validate the username and password$")
	public void user_validate_the_username_and_password() throws Throwable {
		
		
	
	}


}
