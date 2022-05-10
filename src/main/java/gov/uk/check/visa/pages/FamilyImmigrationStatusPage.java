package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FamilyImmigrationStatusPage extends Utility {

    public FamilyImmigrationStatusPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//label")
    List<WebElement> immigrationStatus;
    @CacheLookup
    @FindBy(xpath = "//label[@for='response-0']")
    WebElement selectYes;
    @FindBy(xpath = "//label[@for='response-1']")
    WebElement selectNo;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton3;

    public void selectFamilyMembersImmigrationStatus(String reply){
        switch (reply){
            case "Yes" :
                clickOnElement(selectYes);
                break;
            case "No" :
                clickOnElement(selectNo);
                break;
        }

    }

    public void clickOnContinue(){
        clickOnElement(continueButton3);
    }

}



