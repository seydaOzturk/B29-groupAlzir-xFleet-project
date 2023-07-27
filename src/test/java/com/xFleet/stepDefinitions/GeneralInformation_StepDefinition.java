package com.xFleet.stepDefinitions;

import com.xFleet.pages.AddEvent;
import com.xFleet.pages.GeneralInformationPage;
import com.xFleet.pages.LoginPage;
import com.xFleet.utilities.ConfigurationReader;
import com.xFleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;


public class GeneralInformation_StepDefinition {
    LoginPage loginPage = new LoginPage();
    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("xFleetURL"));


    }
    AddEvent addEvent = new AddEvent();
    GeneralInformationPage generalInformationPage = new GeneralInformationPage();
    @When("user click on a vehicle row")
    public void user_click_on_a_vehicle_row() {
        addEvent.rowClick.click();

    }
    @Then("user sees general information page")
    public void user_sees_general_information_page() {
        String actual = generalInformationPage.generalInfo.getText();
        String expected = "General Information";

        Assert.assertEquals(actual,expected);

    }

    @When("user hover over at the end of each row")
    public void user_hover_over_at_the_end_of_each_row() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(generalInformationPage.threeDots).perform();

    }
    @When("user click on eye icon")
    public void user_click_on_eye_icon() {


    }
    @When("user is on general information page")
    public void user_is_on_general_information_page() {
        String actual = generalInformationPage.generalInfo.getText();
        String expected = "General Information";

        Assert.assertEquals(actual,expected);

    }
    @Then("user sees to edit, delete and add event buttons")
    public void user_sees_to_edit_delete_and_add_event_buttons() {
        String actualEdit = generalInformationPage.editBtn.getText();
        String expectedEdit = "Edit";
        String actualDelete = generalInformationPage.deleteBtn.getText();
        String expectedDelete = "Delete";
        String actualEvent = addEvent.addEventButton.getText();
        String expectedEvent = "Add Event";

        Assert.assertTrue(actualEdit.contains(expectedEdit));
        Assert.assertTrue(actualDelete.contains(expectedDelete));
        Assert.assertTrue(actualEvent.contains(expectedEvent));


    }
}
