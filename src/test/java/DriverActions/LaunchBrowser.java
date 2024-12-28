package DriverActions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public WebDriver driver;
	public void BrowserActions() throws IOException
	{
		String filepath = "C:\\Users\\rajes\\eclipse-workspace\\SaalesforceTesting\\src\\test\\resources\\ConfigurationFiles\\config.properties";
		
		FileInputStream file = new FileInputStream(filepath);
		Properties properties = new Properties();
		properties.load(file);
		
		switch (properties.getProperty("browser").toLowerCase()) {
        case "chrome":
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--start-maximized");
            chromeOptions.addArguments("--disable-extensions");
            chromeOptions.addArguments("--disable-popup-blocking");
            chromeOptions.addArguments("--profile.default_content_settings.popups=0");
            chromeOptions.addArguments("--profile.default_content_settings.automatic_downloads=1");
            chromeOptions.addArguments("--disable-notifications");
            driver = new ChromeDriver(chromeOptions);
            driver.get(properties.getProperty("url"));
            break;

        case "firefox":
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            //firefoxOptions.addArguments("--headless");
            firefoxOptions.addArguments("--headless");
            firefoxOptions.addArguments("--start-maximized");
            firefoxOptions.addArguments("--disable-extensions");
            firefoxOptions.addArguments("--disable-popup-blocking");
            firefoxOptions.addArguments("--profile.default_content_settings.popups=0");
            firefoxOptions.addArguments("--profile.default_content_settings.automatic_downloads=1");
            driver = new FirefoxDriver(firefoxOptions);
            driver.get(properties.getProperty("url"));
            break;

        case "edge":
            WebDriverManager.edgedriver().setup();
            EdgeOptions edgeoptions = new EdgeOptions();
            //edgeoptions.addArguments("--headless");
            edgeoptions.addArguments("--headless");
            edgeoptions.addArguments("--start-maximized");
            edgeoptions.addArguments("--disable-extensions");
            edgeoptions.addArguments("--disable-popup-blocking");
            edgeoptions.addArguments("--profile.default_content_settings.popups=0");
            edgeoptions.addArguments("--profile.default_content_settings.automatic_downloads=1");
            driver = new EdgeDriver(edgeoptions);
            driver.get(properties.getProperty("url"));
            break;

        default:
            throw new IllegalArgumentException("Unsupported Browser supported: " + properties.getProperty("browser"));
		}
		
	}
	
}
