package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WorkTypePage extends Utility {

    public WorkTypePage (){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//main[@role='main']//label")
    List<WebElement> planningWorkTypes;
    @FindBy(xpath= " //input[@value='health']")
    WebElement health;

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton5;

    public void clickOnContinue(){
        clickOnElement(continueButton5);
    }
    public void clickOnHealth(){
        clickOnElement(health);
    }

}
