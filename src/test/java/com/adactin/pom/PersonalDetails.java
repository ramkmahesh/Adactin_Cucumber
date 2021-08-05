package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetails {
	
	public static WebDriver driver;
	
	@FindBy(id = "first_name")
	private WebElement firstname;
	
	@FindBy(id = "last_name")
	private WebElement lastname;
	
	@FindBy(name = "address")
	private WebElement address;
	
	@FindBy(id = "cc_num")
	private WebElement ccnumber;
	
	@FindBy(id = "cc_type")
	private WebElement cctype;
	
	@FindBy(id = "cc_exp_month")
	private WebElement ccexpmnth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement ccexpyr;
	
	@FindBy(id = "cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement book;

	public PersonalDetails(WebDriver driver2) {
 
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnumber() {
		return ccnumber;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcexpmnth() {
		return ccexpmnth;
	}

	public WebElement getCcexpyr() {
		return ccexpyr;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}

}
