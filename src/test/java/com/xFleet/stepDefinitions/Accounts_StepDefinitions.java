package com.xFleet.stepDefinitions;

import com.xFleet.pages.AccountsPage;
import com.xFleet.pages.LoginPage;
import com.xFleet.utilities.BrowserUtils;
import com.xFleet.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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
    public void iShouldSeeFilterOptions(String name) {
        BrowserUtils.sleep(2);
        System.out.println("Lala the number of checkboxes is "+accountsPage.multiselectCheckboxes.size());
     //   Assert.assertEquals(accountsPage.multiselectCheckboxes.size(),18);
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
