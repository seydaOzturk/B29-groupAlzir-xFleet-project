package com.xFleet.stepDefinitions;

import com.xFleet.pages.AddEvent;
import com.xFleet.pages.LoginPage;
import com.xFleet.utilities.BrowserUtils;
import com.xFleet.utilities.ConfigurationReader;
import com.xFleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class AddEvent_StepDefinition {
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://qa.xfleetsolutions.com/user/login");
    }

    @Given("user logged in as {string}")
    public void user_logged_in_as(String userType) {
        String username = null;
        String password = null;

        if (userType.equalsIgnoreCase("driver")) {
            username = ConfigurationReader.getProperty("driverUsername");
            password = ConfigurationReader.getProperty("password");
        } else if (userType.equalsIgnoreCase("store manager")) {
            username = ConfigurationReader.getProperty("storeManagerUsername");
            password = ConfigurationReader.getProperty("password");
        } else if (userType.equalsIgnoreCase("sales manager")) {
            username = ConfigurationReader.getProperty("salesManagerUsername");
            password = ConfigurationReader.getProperty("password");
        }
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }

    AddEvent addEvent = new AddEvent();

    @When("user hover over on {string}")
    public void user_hover_over_on(String tab) {
        BrowserUtils.waitUntilLoaderScreenDisappear();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(addEvent.fleetTab).perform();

    }

    @When("user click on {string} module")
    public void user_click_on_module(String module) {
        BrowserUtils.sleep(5);
        addEvent.vehicleModules.click();


    }

    @When("user click on vehicle row")
    public void user_click_on_vehicle_row() {
        BrowserUtils.waitForClickablility(addEvent.rowClick,5);
        addEvent.rowClick.click();

    }

    @Then("user click {string} button")
    public void user_click_button(String button) {
        BrowserUtils.sleep(5);
        addEvent.addEventButton.click();

    }

    @Then("user sees {string} in the title")
    public void userSeesInTheTitle(String expectedTitle) {
        BrowserUtils.sleep(5);
        Assert.assertEquals(expectedTitle, addEvent.title.getText());
    }

    @Then("user can access the {string} page")
    public void userCanAccessThePage(String string) {
        BrowserUtils.sleep(5);
        Assert.assertTrue(addEvent.addEventPage.isDisplayed());
    }

    @Then("user do not see {string} button")
    public void userDoNotSeeButton(String arg0) {
        BrowserUtils.sleep(3);
        Assert.assertFalse("Add event button is exist.", addEvent.addEventButton.isEnabled());
    }

    @Then("{string} page should pop up")
    public void pageShouldPopUp(String arg0) {
        BrowserUtils.sleep(5);
        Assert.assertTrue(addEvent.title.isDisplayed());
    }

    @Then("user see compulsory fields below:")
    public void userSeeCompulsoryFieldsBelow(List<String> expectedFields) {
        BrowserUtils.sleep(3);
        List<String> actualFields = new ArrayList<>();

        for (WebElement eachField : addEvent.allRequiredFields) {
            actualFields.add(eachField.getText());

        }
        Assert.assertEquals(expectedFields, actualFields);
    }

    @Then("user click Save button")
    public void userClickSaveButton() {

        addEvent.saveButton.click();
    }

    @Then("user sees {string} message")
    public void userSeesMessage(String expectedMessage) {
        BrowserUtils.sleep(3);
        Assert.assertEquals(expectedMessage,addEvent.message.getText());
    }
}
