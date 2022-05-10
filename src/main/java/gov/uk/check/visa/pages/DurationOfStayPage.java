package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DurationOfStayPage extends Utility {
    public DurationOfStayPage(){
        PageFactory.initElements(driver,this);
    }

    // @FindBy(xpath = "//label[@for='response-1']")
   @FindBy (xpath="//input[@value='longer_than_six_months']")
    WebElement longerthan6;
    @FindBy(xpath = "//label[@for='response-0']")
    WebElement lessthan6;
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton4;
    public void selectDurationOfStay(String duration){
        switch (duration){
            case "longer than 6 months" :
                clickOnElement(longerthan6);
                break;
            case "6 months or less" :
                clickOnElement(lessthan6);
                break;
        }

    }
    public void clickOnContinue4(){
        clickOnElement(continueButton4);
    }
}
