package com.xFleet.stepDefinitions;

import com.xFleet.pages.AccountsPage;
import com.xFleet.pages.LoginPage;
import com.xFleet.utilities.BrowserUtils;
import com.xFleet.utilities.ConfigurationReader;
import com.xFleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Accounts_StepDefinitions {

    AccountsPage accountsPage = new AccountsPage();
    LoginPage loginPage = new LoginPage();

    @Given("user is on the logged into the webpage")
    public void userIsOnTheLoggedIntoTheWebpage() {

    }

    @When("I click on {string} tab")
    public void iClickOnCustomersTab(String name) {
        switch (name) {
            case "Customers":
                BrowserUtils.sleep(5);
                accountsPage.customersTab.click();
                break;
            case "Manage filters":
                BrowserUtils.sleep(5);
                accountsPage.manageFilterButton.click();
                break;
        }
    }

    @And("I click on {string} button")
    public void iClickOnAccountsButton(String name) {

        switch (name) {
            case "Accounts":
                accountsPage.accountButton.click();
                BrowserUtils.sleep(2);
                break;
            case "Filter":
                BrowserUtils.sleep(2);
                accountsPage.filterButton.click();
                break;
        }
    }

    @Then("I should see {string} options")
    public void iShouldSeeFilterOptions(String filter) {

        switch (filter) {
            case "Filter":
                BrowserUtils.sleep(2);
                Select select = new Select(accountsPage.filterSelectButton);
                System.out.println("Your filter items number is " + select.getAllSelectedOptions().size());
                Assert.assertEquals(8, select.getAllSelectedOptions().size());
                break;
            case "Each Filter":
                BrowserUtils.sleep(1);
               int num = accountsPage.multiselectCheckboxes.size();
                for (int i = 0; i <= num-1; i++) {
                    accountsPage.multiselectCheckboxes.get(i).click();
                    BrowserUtils.sleep(1);
                }

                for (int i = 0; i <= num-1; i++) {
                    accountsPage.multiselectCheckboxes.get(i).click();
                    Assert.assertTrue(accountsPage.filterTabs.get(i).isDisplayed());
                    BrowserUtils.sleep(1);
                }
        }
    }

    @Given("I logged in as {string}")
    public void iLoggedInAsSalesmanager(String role) {
        String username = null;
        String password = null;

        if (role.equalsIgnoreCase("salesManager")) {
            username = ConfigurationReader.getProperty("salesManagerUsername");
            password = ConfigurationReader.getProperty("password");
            loginPage.login(username, password);

        }
    }
}
