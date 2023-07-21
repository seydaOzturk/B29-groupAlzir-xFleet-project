package com.xFleet.stepDefinitions;

import com.xFleet.pages.FilterVehiclesPage;
import com.xFleet.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FilterVehicles_StepDefinition {

    FilterVehiclesPage filterVehiclesPage=new FilterVehiclesPage();


    @Then("User clicks on filter icon, {string} button should be visible")
    public void user_clicks_on_filter_icon_button_should_be_visible(String filterIcon) {
        BrowserUtils.sleep(5);
        filterVehiclesPage.filterIcon.click();
    }

    @When("User can apply filters by clicking on filter name, from {string} menu.")
    public void user_can_apply_filters_by_clicking_on_filter_name_from_menu(String manageFiltersButton) {
        BrowserUtils.sleep(2);
        filterVehiclesPage.manageFiltersButton.click();

        filterVehiclesPage.checkBoxOption1.click();
        BrowserUtils.sleep(2);
    }

    @Then("User can apply filters by typing the filter name, from {string} menu.")
    public void user_can_apply_filters_by_typing_the_filter_name_from_menu(String filterInputBox) {
        filterVehiclesPage.filterInputBox.sendKeys("Tags");

        BrowserUtils.sleep(2);
        filterVehiclesPage.tagsFilterCheckBox.click();
        BrowserUtils.sleep(2);


    }

}
