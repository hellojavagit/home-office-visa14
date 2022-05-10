package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends TestBase {
    StartPage startPage;
    SelectNationalityPage selectNationalityPage;
    ReasonForTravelPage reasonForTravelPage;
    ResultPage resultPage;
    DurationOfStayPage durationOfStayPage;
    WorkTypePage workTypePage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        startPage = new StartPage();
        selectNationalityPage = new SelectNationalityPage();
        reasonForTravelPage = new ReasonForTravelPage();
        resultPage = new ResultPage();
        durationOfStayPage = new DurationOfStayPage();
        workTypePage = new WorkTypePage();
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
    }

    @Test(groups ={"smoke", "sanity", "regression"})
    public void anAustralianComingToUKForTourism() {
        startPage.clickStartNow();
        selectNationalityPage.selectNationalityFromDD("australia");
        selectNationalityPage.clickOnContinueButton();
        reasonForTravelPage.clickOnReasonForTravel();
        reasonForTravelPage.clickOnContinue1();
        resultPage.verifyResultMessage("You will not need a visa to come to the UK");
    }

    @Test(groups ={"regression"})
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() {
        startPage.clickStartNow();
        selectNationalityPage.selectNationalityFromDD("chile");
        selectNationalityPage.clickOnContinueButton();
        reasonForTravelPage.clickOnReasonForTravel();
        reasonForTravelPage.clickOnContinue1();
      durationOfStayPage.selectDurationOfStay("longerthan 6");
        durationOfStayPage.clickOnContinue4();
       workTypePage.clickOnHealth();
        workTypePage.clickOnContinue();
       resultPage.verifyResultMessage("You need a visa to work in health and care");
    }

    @Test(groups = {"sanity", "regression"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card() {
        startPage.clickStartNow();
        selectNationalityPage.selectNationalityFromDD("colombia");
        selectNationalityPage.clickOnContinueButton();
        reasonForTravelPage.clickOnReasonForTravel();
        reasonForTravelPage.clickOnContinue1();
        familyImmigrationStatusPage.selectFamilyMembersImmigrationStatus("Yes");
        familyImmigrationStatusPage.clickOnContinue();
        resultPage.verifyResultMessage("You’ll need a visa to join your family or partner in the UK");
    }

}