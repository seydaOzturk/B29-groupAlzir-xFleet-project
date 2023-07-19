package com.xFleet.pages;

import com.xFleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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




}
