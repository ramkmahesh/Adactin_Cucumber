package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Newnewbase_Class;
import com.adactin.pom.SelectHotel;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class SelectHotelStepDefinition extends Newnewbase_Class {
	
	
	public static WebDriver driver = Runner.driver;
	
	SelectHotel s1 = new SelectHotel(driver);
	

  @When("^User click on Radio Button$")
  public void user_click_on_Radio_Button() throws Throwable {
	  
	  clickOnElement(s1.getRadiobutton());
	 
	  }

  
  @Then("^User click on Continue Button$")
  public void user_click_on_Continue_Button() throws Throwable {
	  
	  clickOnElement(s1.getContinue_btn());
    
  }

}
