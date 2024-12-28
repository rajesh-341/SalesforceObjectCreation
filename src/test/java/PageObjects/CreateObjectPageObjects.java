package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateObjectPageObjects {

	@FindBy(xpath = "//*[text()='Home']")
    public WebElement HomeText;

    @FindBy(xpath = "//a[@title='Object Manager']")
    public WebElement ObjectManager;

    @FindBy(id = "globalQuickfind")
    public WebElement QuickFindInput;
    
    @FindBy(xpath = "//*[@id=\"setupComponent\"]/div[2]/div/div[2]/div/table/tbody/tr[2]/td[5]/lightning-icon/span/lightning-primitive-icon")
    public WebElement otherElement;
    
    @FindBy(linkText = "/one/one.app#/setup/ObjectManager/01I5h000001jQVl/view")
    public WebElement teacherObject;
    
    @FindBy(xpath = "//a[text()='Fields & Relationships']")
    public WebElement FieldsAndRelationships;
    
    @FindBy(xpath = "(//a[@class='rowActionsPlaceHolder slds-button slds-button--icon-border-filled'])[8]")
    public WebElement EditDropDown;
    
    @FindBy(xpath = "//a[@title='edit']")
    public WebElement Edit;
}
