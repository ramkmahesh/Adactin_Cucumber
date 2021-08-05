package com.adactin.baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class Newnewbase_Class {
	
	//Browser Launch
		public static WebDriver driver;
		
		public static WebDriver getbrowser(String browser) {
			
			try {
				if (browser.equalsIgnoreCase("chrome")) {
					//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+("\\Driver\\chromedriver.exe"));
					
					System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+("\\Drivernew\\chromedriver.exe"));
					
					
					driver = new ChromeDriver();
				}
				else if (browser.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+("\\Driver\\geckodriver.exe"));
					driver = new FirefoxDriver();
				}
				else if (browser.equalsIgnoreCase("internetexlporer")) {
					System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+("\\Driver\\IEDriverServer.exe"));
					driver = new InternetExplorerDriver();
				}
				else if (browser.equalsIgnoreCase("edge")) {
					System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+("\\Driver\\msedgedriver.exe"));
					driver = new EdgeDriver();
				}
				else if (browser.equalsIgnoreCase("opera")) {
					System.setProperty("webdriver.opera.driver", System.getProperty("user.dir")+("\\Driver\\operadriver.exe"));
					driver = new OperaDriver();
				}
				else {
					System.out.println("Invalid Browser");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}//Maximize
			driver.manage().window().maximize();
			return driver;
		}//Get
		public static void getUrl(String value) {
			driver.get(value);
		}//Sendkeys
		public static void inputOfElement(WebElement element,String value) {
			element.sendKeys(value);
		}//Click
		public static void clickOnElement(WebElement element) {
			element.click();
		}//Clear
		public static void clearOnElement(WebElement element) {
			element.clear();
		}//Close
		public static void closeOnElement() {
			driver.close();
		}//Quit
		public static void quitOnElement() {
			driver.quit();
			
		}//DropDown
		public static void dropDown(WebElement element,String options,String value) {
			Select s = new Select(element);
			try {
				if (options.equalsIgnoreCase("byIndex")) {
					int parseInt = Integer.parseInt(value);
					s.selectByIndex(parseInt);
				}
				else if (options.equalsIgnoreCase("byValue")) {
					s.selectByValue(value);
				}
				else if (options.equalsIgnoreCase("byVisibleText")) {
					s.selectByVisibleText(value);
				}
				else {
					System.out.println("Invalid Options");
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}//NavigateTo
		public static void navigateto(String value) {
			driver.navigate().to(value);
		}//NavigateBack
		public static void navigateback() {
			driver.navigate().back();
		}//NavigateForward
		public static void navigateforward() {
			driver.navigate().forward();
		}//NavigateRefresh
		public static void navigaterefresh() {
			driver.navigate().refresh();
		}
		//Alert
		public static void Alert(WebElement element,String types,String value) {
			
					try {
						if (types.equalsIgnoreCase("ok")) {
							driver.switchTo().alert().accept();
						}
						else if (types.equalsIgnoreCase("cancel")) {
							driver.switchTo().alert().dismiss();
						}
						else if (types.equalsIgnoreCase("prompt")) {
							driver.switchTo().alert().sendKeys(value);
							driver.switchTo().alert().accept();
						}
						else {
							System.out.println("Invalid Alert Keys");
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} 

}
