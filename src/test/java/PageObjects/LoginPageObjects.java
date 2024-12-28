package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPageObjects {
	
	@FindBy(id = "username")
    public WebElement Username;

    // Locate the password field
    @FindBy(id = "password")
    public WebElement Password;

    // Locate the login button
    @FindBy(id = "Login")
    public WebElement LoginButton;
    
}

