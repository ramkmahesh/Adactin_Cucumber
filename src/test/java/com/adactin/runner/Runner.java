package com.adactin.runner;

import org.junit.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Newnewbase_Class;
import com.adactin.property.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions (features = "src\\test\\java\\com\\adactin\\feature\\Adactin.feature" ,
                      glue = "com\\adactin\\stepdefinition",
                      monochrome = true
                      )

public class Runner {

	public static WebDriver driver;
	
	@BeforeClass
	
	public static void setUp() throws Throwable {
		
        String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();
		
		driver = Newnewbase_Class.getbrowser(browser);
	}
	
	
	@AfterClass 
     public static void tearDown() {
        
    	 driver.quit();
	}
	
	
	
	
	
}
