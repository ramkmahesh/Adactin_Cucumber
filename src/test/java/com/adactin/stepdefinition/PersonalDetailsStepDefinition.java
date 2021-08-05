package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Newnewbase_Class;
import com.adactin.pom.PersonalDetails;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class PersonalDetailsStepDefinition extends Newnewbase_Class {
	
	public static WebDriver driver = Runner.driver;
	
	PersonalDetails pd = new PersonalDetails(driver);
	
	@When("^User enter his/her first name$")
	public void user_enter_his_her_first_name() throws Throwable {
		
		inputOfElement(pd.getFirstname(), "mahe");
	   
	}

	@When("^User enter his/her last name$")
	public void user_enter_his_her_last_name() throws Throwable {
		
		inputOfElement(pd.getLastname(), "RK");
	   
	}

	@When("^User enter his/her address$")
	public void user_enter_his_her_address() throws Throwable {
		
		inputOfElement(pd.getAddress(), "25,South Street,Chennai");
	   
	}

	@When("^User enter his/her credit card number$")
	public void user_enter_his_her_credit_card_number() throws Throwable {
		
		inputOfElement(pd.getCcnumber(), "1234567891234567");
	    
	}

	@When("^User enter his/her credit card type$")
	public void user_enter_his_her_credit_card_type() throws Throwable {
		dropDown(pd.getCctype(), "byValue", "VISA");
	   
	}

	@When("^User enter month$")
	public void user_enter_month() throws Throwable {
		dropDown(pd.getCcexpmnth(), "byValue", "11");
	    
	}

	@When("^User enter year$")
	public void user_enter_year() throws Throwable {
		dropDown(pd.getCcexpyr(), "byValue", "2022");
	   
	}

	@When("^User enter the cvv number$")
	public void user_enter_the_cvv_number() throws Throwable {
		inputOfElement(pd.getCvv(), "356");
	    
	}

	@Then("^User click the book now button$")
	public void user_click_the_book_now_button() throws Throwable {
		clickOnElement(pd.getBook());
	    
	}

}
