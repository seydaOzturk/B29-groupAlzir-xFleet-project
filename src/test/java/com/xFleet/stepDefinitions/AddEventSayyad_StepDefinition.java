package com.xFleet.stepDefinitions;

import com.xFleet.pages.AddEvent;
import com.xFleet.pages.LoginPage;
import com.xFleet.utilities.BrowserUtils;
import com.xFleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AddEventSayyad_StepDefinition {

    AddEvent addEvent = new AddEvent();


    @When("{string} hovers over Fleet module")
    public void hovers_over_fleet_module(String userType) {
        BrowserUtils.sleep(5);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(addEvent.fleetTab).perform();
    }

    @Then("{string} clicks on Vehicles submodule")
    public void clicks_on_vehicles_submodule(String string) {
        BrowserUtils.sleep(5);
        addEvent.vehicleModules.click();
    }

    @Then("{string} clicks on any vehicle-row")
    public void clicksOnAnyVehicleRow(String arg0) {
        BrowserUtils.waitForClickablility(addEvent.rowClick,10);
//        BrowserUtils.sleep(5);
        addEvent.rowClick.click();

    }


    @Then("{string} sees Add Event button")
    public void sees_add_event_button(String string) {
        BrowserUtils.sleep(5);
        Assert.assertTrue(addEvent.addEventButton.isDisplayed());
    }



    @Given("{string} clicks on Add Event button")
    public void clicks_on_add_event_button(String string) {
        BrowserUtils.sleep(5);
        addEvent.addEventButton.click();
    }
    @Then("{string} sees Add Event page pops up")
    public void sees_add_event_page_pops_up(String string) {
        BrowserUtils.sleep(5);
        Assert.assertTrue(addEvent.title.isDisplayed());
    }


    @When("{string} clicks on each color")
    public void clicks_on_each_color(String string) {
        for (WebElement color : addEvent.colors) {
            BrowserUtils.sleep(3);
            color.click();
        }
    }


    @When("{string} clicks on All-day event")
    public void clicks_on_all_day_event(String string) {
        BrowserUtils.sleep(5);
        addEvent.allDayEventCheckBox.click();
        Assert.assertTrue(addEvent.allDayEventCheckBox.isSelected());
    }

    @Then("{string} sees All-day option is clicked")
    public void sees_all_day_option_is_clicked(String string) {
        BrowserUtils.sleep(5);
        Assert.assertTrue(addEvent.addEventButton.isSelected());
    }

    @When("{string} clicks on Repeat option")
    public void clicks_on_repeat_option(String string) {
        BrowserUtils.sleep(5);
        addEvent.repeatCheckBox.click();
    }

    @When("{string} selects {string}")
    public void selects(String string, String string2) {
        Select select = new Select(addEvent.repeatDropDown);
        List<WebElement> dropDownList = select.getOptions();
        for (WebElement dropdown : dropDownList) {
            BrowserUtils.sleep(3);
            dropdown.click();
        }
    }

    @Then("{string} sees {string} is clicked")
    public void sees_is_clicked(String repeatPeriods, String expectedValue) {
        BrowserUtils.sleep(4);
        Assert.assertEquals(expectedValue, repeatPeriods);
    }



}
