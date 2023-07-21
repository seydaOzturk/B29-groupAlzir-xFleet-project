package com.xFleet.pages;

import com.xFleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddEvent {

    public AddEvent(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(text(),\"Fleet\")]")
    public WebElement  fleetTab;

    @FindBy(xpath = "//span[text()=\"Vehicles\"]")
    public WebElement  vehicleModules;

    @FindBy(xpath = "//tr[@class='grid-row row-click-action']")
    public WebElement rowClick;


    @FindBy(xpath = "//a[@title='Add an event to this record']")
    public WebElement addEventButton;

    @FindBy(xpath = "//span[text()=\"Add Event\"]")
    public WebElement title;


    @FindBy(xpath = "(//div[@tabindex='-1']//span)[9]//span[contains(@class, 'color')]")
    public List<WebElement> colors;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    public WebElement allDayEventCheckBox;

    @FindBy (xpath = "(//input[@type='checkbox'])[3]")
    public WebElement repeatCheckBox;


    @FindBy(xpath = "//select[@data-name='recurrence-repeats']")
    public WebElement repeatDropDown;






}
