package com.xFleet.pages;

import com.xFleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountsPage extends LoginPage{
    public AccountsPage(){PageFactory.initElements(Driver.getDriver(), this);
    }

   @FindBy(xpath = "(//span[@class='title title-level-1'])[3]")
    public WebElement customersTab;

    @FindBy(xpath = "//a[@href='/account']/span")
    public WebElement  accountButton;

    @FindBy(xpath = "//a[@class='add-filter-button']")
    public WebElement manageFilterButton;

    @FindBy(xpath = "//ul[@class='ui-multiselect-checkboxes ui-helper-reset fixed-li']/li")
    public List <WebElement> multiselectCheckboxes;

    @FindBy(xpath = "//a[@title='Filters']/i")
    public WebElement filterButton;





}
