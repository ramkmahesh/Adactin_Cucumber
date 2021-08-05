package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {

	@FindBy(id = "location")
    private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotels;
	
	@FindBy(id = "room_type")
	private WebElement roomtype;
	
	@FindBy(id = "room_nos")
	private WebElement numberofrooms;
	
	@FindBy(id = "datepick_in")
    private WebElement clearcheckin;
	
	@FindBy(id="datepick_in")
	private WebElement checkindate;
	
	@FindBy(id = "datepick_out")
	private WebElement clearcheckout;
	
	@FindBy(id = "datepick_out")
	private WebElement checkoutdate;
	
	@FindBy(id = "adult_room")
    private WebElement adultroom;
	
	@FindBy(id = "child_room")
	private WebElement childrooom;
	
	@FindBy(id = "Submit")
    private WebElement submit;

	private WebDriver driver;

	public SearchHotel(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);

        
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNumberofrooms() {
		return numberofrooms;
	}

	public WebElement getClearcheckin() {
		return clearcheckin;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getClearcheckout() {
		return clearcheckout;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildrooom() {
		return childrooom;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	

}
