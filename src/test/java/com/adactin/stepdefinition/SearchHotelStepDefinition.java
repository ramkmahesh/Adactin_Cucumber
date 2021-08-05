package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Newnewbase_Class;
import com.adactin.pom.SearchHotel;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class SearchHotelStepDefinition extends Newnewbase_Class {
	
	public static WebDriver driver = Runner.driver;
	
	SearchHotel sh = new SearchHotel(driver);
	
	
	@When("^User enter the Location$")
	public void user_enter_the_Location() throws Throwable {
		dropDown(sh.getLocation(), "byValue", "Melbourne");
	    
	}

	@When("^User enter the Hotels$")
	public void user_enter_the_Hotels() throws Throwable {
		dropDown(sh.getHotels(), "byVisibleText", "Hotel Sunshine");
	   
	}

	@When("^User enter the Room type$")
	public void user_enter_the_Room_type() throws Throwable {
		dropDown(sh.getRoomtype(), "byValue", "Super Deluxe");
	   
	}

	@When("^User enter the Number of Rooms$")
	public void user_enter_the_Number_of_Rooms() throws Throwable {
		dropDown(sh.getNumberofrooms(), "byIndex", "3");
	   
	}

	@When("^User clear the Check In Date$")
	public void user_clear_the_Check_In_Date() throws Throwable {
		clearOnElement(sh.getClearcheckin());
	   
	}

	@When("^User enter the Check In Date$")
	public void user_enter_the_Check_In_Date() throws Throwable {
	    inputOfElement(sh.getCheckindate(), "10/07/2021");
	}

	@When("^User clear the Check Out Date$")
	public void user_clear_the_Check_Out_Date() throws Throwable {
		clearOnElement(sh.getClearcheckout());
	   
	}

	@When("^User enter the check Out Date$")
	public void user_enter_the_check_Out_Date() throws Throwable {
	    inputOfElement(sh.getCheckoutdate(), "12/07/2021");
	}

	@When("^User enter the Adults per Room$")
	public void user_enter_the_Adults_per_Room() throws Throwable {
	    dropDown(sh.getAdultroom(), "byIndex", "2");
	}

	@When("^User enter the Children per Room$")
	public void user_enter_the_Children_per_Room() throws Throwable {
		dropDown(sh.getChildrooom(), "byIndex", "2");
	   
	}

	@Then("^User click search$")
	public void user_click_search() throws Throwable {
		clickOnElement(sh.getSubmit());
	    
	}



}
