package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReasonForTravelPage extends Utility {
public ReasonForTravelPage() {
    PageFactory.initElements(driver, this);
}
    //@FindBy (xpath = "//main[@role='main']//label")
    //List<WebElement> reasonForTravel;
    @FindBy(id = "response-0")
    WebElement reasonForTravel;
    @FindBy (xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton1;

   /* public void selectReasonForTravel(String reason)
    {
        for (WebElement res : reasonForTravel){
            if(res.getText().equalsIgnoreCase(reason)){
                clickOnElement(res);
                break;
            }
        }
    }*/
   public void clickOnReasonForTravel() {
       clickOnElement(reasonForTravel);
   }
    public void clickOnContinue1(){
        clickOnElement(continueButton1);

}
}
