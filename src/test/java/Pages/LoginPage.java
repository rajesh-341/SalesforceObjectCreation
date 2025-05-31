package Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DriverActions.LaunchBrowser;

import PageObjects.*;



public class LoginPage extends LaunchBrowser{

	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	public static final Logger log = LogManager.getLogger(LoginPage.class);	
	
	public void loginPage() throws IOException {
		file = new FileInputStream(filepath);
		Properties properties = new Properties();
		properties.load(file);
		
		System.out.println("driver =" + driver);
        LoginPageObjects loginPageObjects = new LoginPageObjects();
    	PageFactory.initElements(driver, loginPageObjects);
    	loginPageObjects.Username.sendKeys(properties.getProperty("username"));
    	loginPageObjects.Password.sendKeys(properties.getProperty("password"));
    	loginPageObjects.LoginButton.click();
	}	
	
	
	
}