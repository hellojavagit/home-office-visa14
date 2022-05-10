package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectNationalityPage extends Utility {
    public SelectNationalityPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//select[@class='govuk-select']")
    WebElement nationality;
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continuebutton;

    public void selectNationalityFromDD(String country){
        selectByValueFromDropDown(nationality,country);
    }
    public void clickOnContinueButton(){
        clickOnElement(continuebutton);
    }
}
