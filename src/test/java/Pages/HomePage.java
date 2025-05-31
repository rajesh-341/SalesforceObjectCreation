package Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import PageObjects.CreateObjectPageObjects;



public class HomePage extends LoginPage

{


	public void HomePage() throws IOException 
	{
		FileInputStream LoginPage = new FileInputStream(filepath);
		Properties properties = new Properties();
		properties.load(file);
		
       CreateObjectPageObjects createObject = new CreateObjectPageObjects();
    	PageFactory.initElements(driver, createObject);
    	
    	wait.until(ExpectedConditions.visibilityOf(createObject.HomeText));
    	createObject.ObjectManager.click();
    	
    	wait.until(ExpectedConditions.visibilityOf(createObject.QuickFindInput));
    	createObject.QuickFindInput.sendKeys("teacher");  
	}
	
	public void ObjManager()
	{
		log.info("Obj Manager Execution Started");
	
		CreateObjectPageObjects createObject = new CreateObjectPageObjects();
    	PageFactory.initElements(driver, createObject);
    	
    	wait.until(ExpectedConditions.visibilityOf(createObject.otherElement));
    	createObject.otherElement.click();
    	
		wait.until(ExpectedConditions.visibilityOf(createObject.teacherObject));
    	createObject.teacherObject.click();
    	
    	log.info("Obj Manager Execution Completed");
	}
		
}
