package com.xFleet.stepDefinitions;

import com.xFleet.pages.VehicleInformationPage;
import com.xFleet.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class VehicleInformation_StepDefinitions {
     VehicleInformationPage vehicleInformation = new VehicleInformationPage();
    @Then("user sees all information on the page")
    public void user_sees_all_information_on_the_page() {
        BrowserUtils.sleep(3);
        Assert.assertTrue(vehicleInformation.carsTable.isDisplayed());

    }

    @Then("user sees total page number")
    public void userSeesTotalPageNumber() {
        BrowserUtils.sleep(5);
        Assert.assertTrue(vehicleInformation.numOfPage.isDisplayed());
    }

    @Then("user sees next page and previous page buttons")
    public void userSeesNextPageAndPreviousPageButtons() {
        BrowserUtils.sleep(3);
        Assert.assertTrue(vehicleInformation.nextPage.isDisplayed());
        Assert.assertTrue(vehicleInformation.previousPage.isDisplayed());
    }

    @Then("user sees total records of vehicles")
    public void userSeesTotalRecordsOfVehicles() {
        Assert.assertTrue(vehicleInformation.totalRecords.isDisplayed());
    }
}
