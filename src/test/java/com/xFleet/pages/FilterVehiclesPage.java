package com.xFleet.pages;

import com.xFleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterVehiclesPage {

    public FilterVehiclesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//i[@class='fa-filter hide-text']")
    public WebElement filterIcon;

    @FindBy(xpath = "//a[@class='add-filter-button']")
    public WebElement manageFiltersButton;

    @FindBy(xpath = "//ul[contains(@style, 'auto;')]")
    public WebElement filterListCheckBox;

    @FindBy(xpath = "//*[@id=\"ui-multiselect-0-0-option-0\"]")
    public WebElement checkBoxOption1;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement filterInputBox;

    @FindBy(xpath = "//*[@id=\"ui-multiselect-0-0-option-1\"]")
    public WebElement tagsFilterCheckBox;




}
